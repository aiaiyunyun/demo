package com.example.demo.controller;

import com.example.demo.entity.Hierarchy;
import com.example.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * Created by lsd on 2017-05-16.
 */
@Controller
public class TestController {

    @Autowired
    TestMapper testMapper;

    @RequestMapping(value = "/")
    public String test(){
       List<Hierarchy> sd = testMapper.getAll();
        return sd.toString();
    }

    @RequestMapping(value = "/helloJsp")
    public String helloJsp(Map<String,Object> map){
        map.put("hello","NIHAO");
        return "hello";
    }
    @RequestMapping(value = "/showPicture")
    public String showPicture(){
        return "showPicture";
    }

}
