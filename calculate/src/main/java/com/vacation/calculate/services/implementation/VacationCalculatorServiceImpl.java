package com.vacation.calculate.services.implementation;

import com.vacation.calculate.services.interaces.VacationCalculatorService;
import org.springframework.stereotype.Service;

@Service
public class VacationCalculatorServiceImpl implements VacationCalculatorService {

    @Override
    public Double vacationPayCalculate(Double salaryAverage, int days) {
        return salaryAverage * days;
    }
}
