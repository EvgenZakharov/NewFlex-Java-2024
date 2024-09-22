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

        // Расчет отпускных
        double dailySalary = averageSalary / 29.3;
        double vacationPay = dailySalary * vacationDays;

        return vacationPay;
    }
}
