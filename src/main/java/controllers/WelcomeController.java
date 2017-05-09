package controllers;

import dao.CarDaoTemporaryImpl;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.CarService;

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
        model.addAttribute("list", service.getAll());
        return "display";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model)
    {
        model.addAttribute(new Car(CarDaoTemporaryImpl.getCount(), "", "", 0, 0));
        return "search";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(Car car, Model model)
    {
        List<Car> list = service.search(car);
        if (!list.isEmpty())
            model.addAttribute("list", list);
        else
            model.addAttribute("error", "There is no cars that matches your expectations. Try something else :(");
        return "display";
    }
}
