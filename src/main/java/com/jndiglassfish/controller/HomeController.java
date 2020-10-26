package com.jndiglassfish.controller;

import com.jndiglassfish.repository.Repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @Autowired
    Repositories repositories;


    @ResponseBody
    @GetMapping(value = "/")
    public String homed () {
        return "Hello <b>" + repositories.getUserByName(1) + "<b>";
    }



}
