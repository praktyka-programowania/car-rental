package controllers;

//import dao.CarDaoTemporaryImpl;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.CarService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class WelcomeController
{
    @Autowired
    CarService service;

    @RequestMapping("/")
    public String mainPage()
    {
        return "main";
    }

    @RequestMapping("/display")
    public String showAll(Model model)
    {
        List<Car> list = service.getAll();
        if (!list.isEmpty())
            model.addAttribute("list", list);
        else
            model.addAttribute("error", "There is no available cars for today. Try later :(");
        return "display";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model)
    {
        model.addAttribute(new Car(/*CarDaoTemporaryImpl.getCount()*/0, "", "", 0, 0));
        List<Car> list = service.getAll();
        Collections.sort(list, (a, b) -> a.getCompany().compareTo(b.getCompany()));
        model.addAttribute("list", list);
        return "search";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@Valid Car car, BindingResult result, Model model)
    {
        if (result.hasErrors())
        {
            List<Car> list = service.getAll();
            Collections.sort(list, (a, b) -> a.getCompany().compareTo(b.getCompany()));
            model.addAttribute("list", list);
            return "search";
        }
        List<Car> list = service.search(car);
        if (list.size() > 0)
            model.addAttribute("list", list);
        else
            model.addAttribute("error", "There is no available cars that match to your require. Try once more.");
        return "display";
    }



    // TODO Delete this method
    @RequestMapping("/addAll")
    public String addAll()
    {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Mercedes", "w140", 2005, 1555));
        list.add(new Car("BMW", "e37", 2006, 2000));
        list.add(new Car("Mazda", "RX8", 2005, 1222));
        list.add(new Car("Mazda", "626", 2005, 1222));
        list.add(new Car("BMW", "e38", 2003, 2000));
        list.add(new Car("Waz", "2108", 2005, 1222));
        list.add(new Car("BMW", "e36", 2005, 2000));
        list.add(new Car("BMW", "e36", 2005, 2000));
        list.add(new Car("Mazda", "6", 2005, 1222));
        list.add(new Car("Mazda", "3", 2005, 1222));
        list.add(new Car("Mercedes", "220", 2017, 1555));
        list.add(new Car("Waz", "2101", 2005, 1222));
        service.addAll(list);
        return "redirect:/display";
    }
}
