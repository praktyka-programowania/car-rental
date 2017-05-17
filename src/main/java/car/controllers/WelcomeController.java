package car.controllers;

//import dao.CarDaoTemporaryImpl;
import car.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import car.service.CarService;

import java.util.Collections;
import java.util.List;

@Controller
public class WelcomeController
{
    @Autowired
    CarService carService;

    @RequestMapping("/")
    public String mainPage()
    {
        return "main";
    }

    @RequestMapping("/display")
    public String showAll(Model model)
    {
        List<Car> list = carService.getAll();
        if (!list.isEmpty())
            model.addAttribute("list", list);
        else
            model.addAttribute("error", "There is no available cars for today. Try later :(");
        return "display";
    }

//    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    public String search(Model model)
//    {
//        model.addAttribute(new Car(/*CarDaoTemporaryImpl.getCount()*/0, "", "", 0, 0));
//        List<Car> list = service.getAll();
//        Collections.sort(list, (a, b) -> a.getCompany().compareTo(b.getCompany()));
//        model.addAttribute("list", list);
//        return "search";
//    }

//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String search(@Valid Car car, BindingResult result, Model model)
//    {
//        if (result.hasErrors())
//        {
//            List<Car> list = service.getAll();
//            Collections.sort(list, (a, b) -> a.getCompany().compareTo(b.getCompany()));
//            model.addAttribute("list", list);
//            return "search";
//        }
//        List<Car> list = service.search(car);
//        if (list.size() > 0)
//            model.addAttribute("list", list);
//        else
//            model.addAttribute("error", "There is no available cars that match to your require. Try once more.");
//        return "display";
//    }
}
