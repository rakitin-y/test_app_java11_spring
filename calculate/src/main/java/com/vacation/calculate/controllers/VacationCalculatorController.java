package com.vacation.calculate.controllers;

import com.vacation.calculate.services.interaces.VacationCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationCalculatorController {

    private final VacationCalculatorService vacationCalculatorService;

    @Autowired
    public VacationCalculatorController(VacationCalculatorService vacationCalculatorService) {
        this.vacationCalculatorService = vacationCalculatorService;
    }

    @GetMapping("/calculate/{salaryAverage}/{days}")
    public ResponseEntity<Double> vacationPay(@PathVariable Double salaryAverage,
                                              @PathVariable int days) {

        return new ResponseEntity<>(vacationCalculatorService.vacationPayCalculate(salaryAverage, days), HttpStatus.OK);
    }
}
