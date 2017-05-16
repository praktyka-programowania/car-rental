package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController
{
    @RequestMapping("/about")
    public String about()
    {
        return "about";
    }

    @RequestMapping("/contact")
    public String contact()
    {
        return "contact";
    }
}
