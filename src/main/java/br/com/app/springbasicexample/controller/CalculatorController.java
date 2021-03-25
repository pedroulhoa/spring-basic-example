package br.com.app.springbasicexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/{operation}/{num1}/{num2}")
    public String sumByUriParam(@PathVariable String operation, @PathVariable int num1, @PathVariable int num2) {
        int result = 0;
        switch (operation) {
            case "sum":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            default:
                System.out.println("Operation not found!");
        }

        return String.valueOf(result);
    }

}
