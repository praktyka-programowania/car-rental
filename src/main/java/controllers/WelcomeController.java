package controllers;

import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("person")
public class WelcomeController
{
    @RequestMapping("/")
    public String mainPage(Model model)
    {
        if (!model.containsAttribute("person"))
            model.addAttribute(new Person());
        return "main";
    }
}
