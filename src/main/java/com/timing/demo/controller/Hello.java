package com.timing.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 86227
 */
@RestController
public class Hello {
    @GetMapping
    public Map<String, String> hello() {
        Map<String, String> result = new HashMap<>();
        result.put("name", "张总");
        result.put("age", "25");
        return result;
    }
}
