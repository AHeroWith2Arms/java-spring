package pro.sky.startspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    public final CalculatorServiceImple calculatorService;

    public CalculatorController(CalculatorServiceImple calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String calculatorHello() {
        return calculatorService.calculatorHello();
    }

    @GetMapping(path = "/calculator/plus")
    public String calculatorPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String calculatorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String calculatorDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorDivide(num1, num2);
    }

}
