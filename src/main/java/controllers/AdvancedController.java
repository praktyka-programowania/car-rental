package controllers;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.CarService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AdvancedController
{
    @Autowired
    CarService service;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model)
    {
        model.addAttribute(new Car("", "", 0, 0));
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Valid Car car, BindingResult result, Model model)
    {
        if (result.hasErrors())
        {
            return "add";
        }
        else
            return "afterAdded";
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
