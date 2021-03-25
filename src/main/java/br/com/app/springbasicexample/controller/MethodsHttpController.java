package br.com.app.springbasicexample.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/methods")
public class MethodsHttpController {

    @GetMapping
    public String get() {
        return "GET request";
    }

    @PostMapping
    public String post() {
        return "POST request";
    }

    @PutMapping
    public String put() {
        return "PUT request";
    }

    @PatchMapping
    public String patch() {
        return "PATCH request";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE request";
    }
}
