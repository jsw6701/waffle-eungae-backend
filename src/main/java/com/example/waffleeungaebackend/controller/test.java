package com.example.waffleeungaebackend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class test {

    @RequestMapping("/test")
    public String test() {
        log.info("test");
        return "<h1> test oooo</h1>";
    }

}
