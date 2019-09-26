package com.kalasapura.demo.service;

import org.springframework.stereotype.Component;

@Component
public class DemoService {

    public String getDemoContent(String content) {
        if (content.equalsIgnoreCase("India")) {
            return "Hello India";
        } else {
            return "Hello US";
        }
    }
}
