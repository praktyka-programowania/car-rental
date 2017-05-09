package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CarService;

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
}
