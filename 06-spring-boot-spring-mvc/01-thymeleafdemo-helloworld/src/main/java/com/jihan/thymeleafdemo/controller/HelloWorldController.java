package com.jihan.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

/*
    @RequestMapping("/processFormUpper")
    public String processFormUpper(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        name = name.toUpperCase();
        model.addAttribute("name", name);
        return "show-upper";
    }
*/

    @RequestMapping("/processFormUpper")
    public String processFormUpper(@RequestParam("name") String name, Model model) {
        name = name.toUpperCase();
        model.addAttribute("name", name);
        return "show-upper";
    }
}
