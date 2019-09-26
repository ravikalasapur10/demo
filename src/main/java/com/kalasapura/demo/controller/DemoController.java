package com.kalasapura.demo.controller;

import com.kalasapura.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService demoService;

    public DemoController(final DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("hello/{country}")
    public String hello(@PathVariable("country") String country) {
        return this.demoService.getDemoContent(country);
    }

}
