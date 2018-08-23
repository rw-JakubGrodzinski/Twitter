package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController
{
    @RequestMapping("/main")
    public String mainPage()
    {
        return "main";
    }
}