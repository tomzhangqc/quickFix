package com.cicc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickFixController {

    @RequestMapping("/send")
    public int sendMessage(){
        return 0;
    }

}
