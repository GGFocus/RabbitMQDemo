package com.example.rabbitmqdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = {"/{id}/say"},method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
        return "id:"+id;
    }
}
