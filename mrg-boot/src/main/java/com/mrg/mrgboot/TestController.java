package com.mrg.mrgboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String test(){

        return "Hello Spring boot" ;
    }

}
