package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

import java.security.PublicKey;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String getGreeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String getPlus(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        if (num1 == null || num2 == null) {
            return "Введите два числа!";
        }
        return num1 + " + " + num2 + " = " + calculatorService.addition(num1, num2);
    }

    @GetMapping("/minus")
    public String getMinus(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        if (num1 == null || num2 == null) {
            return "Введите два числа!";
        }
        return num1 + " - " + num2 + " = " + calculatorService.subtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String getMultiply(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        if (num1 == null || num2 == null) {
            return "Введите два числа!";
        }
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String getDivide(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        if (num1 == null || num2 == null) {
            return "Введите два числа!";
        }
        if (Double.parseDouble(num2) == 0) {
            return "Делить на нуль нельзя!";
        }
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}
