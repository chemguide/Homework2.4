package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceInter implements CalculatorService {
    public String addition(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите два числа!";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String subtraction(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите два числа!";
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите два числа!";
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите два числа!";
        }
        return num1 + " / " + num2 + " = " + ((double)num1 / (double)num2);
    }
}
