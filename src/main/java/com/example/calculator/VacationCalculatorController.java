package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationCalculatorController {
    @GetMapping("/calculate")
    public double calculateVacationPay(
                                        @RequestParam double averageSalary,
                                        @RequestParam int vacationDays) {

        final double averageNumberOfDays = 29.3;

        //Расчет отпускных
        double dailySalary = averageSalary / averageNumberOfDays;
        return dailySalary * vacationDays;

    }
}
