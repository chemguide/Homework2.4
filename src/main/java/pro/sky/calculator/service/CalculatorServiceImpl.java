package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public double addition(String num1, String num2) {
        return Double.parseDouble(num1) + Double.parseDouble(num2);
    }

    public double subtraction(String num1, String num2) {
        return Double.parseDouble(num1) - Double.parseDouble(num2);
    }

    public double multiply(String num1, String num2) {
        return Double.parseDouble(num1) * Double.parseDouble(num2);
    }

    public double divide(String num1, String num2) {
        return Double.parseDouble(num1) / Double.parseDouble(num2);
    }
}
