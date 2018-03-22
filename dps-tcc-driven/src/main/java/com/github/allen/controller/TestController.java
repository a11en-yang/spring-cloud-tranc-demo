package com.github.allen.controller;

import io.swagger.models.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;

@Controller
public class TestController {

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public Object set(){
        return new Object();
    }
}
