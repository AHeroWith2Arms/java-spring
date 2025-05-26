package pro.sky.startspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImple implements CalculatorService {

    public String calculatorHello() {
        return "Добро пожалость в калькулятор";
    }

    public String calculatorPlus(int num1, int num2) {
        int res = num1 + num2;
        return num1 + " + " + num2 + " = " + res;
    }

    public String calculatorMinus(int num1, int num2) {
        int res = num1 - num2;
        return num1 + " - " + num2 + " = " + res;
    }

    public String calculatorMultiply(int num1, int num2) {
        int res = num1 * num2;
        return num1 + " * " + num2 + " = " + res;
    }

    public String calculatorDivide(int num1, int num2) {
        if (num2 == 0) {
            return "На 0 делить нельзя";
        } else {
            int res = num1 / num2;
            return num1 + " / " + num2 + " = " + res;
        }
    }

}
