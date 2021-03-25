package br.com.app.springbasicexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping(path = "/hello")
    public String hello() {
        return "First endpoint!";
    }

    @RequestMapping(path = {"/one", "/two"})
    public String twoUrls() {
        return "two urls!";
    }

}
