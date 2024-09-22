package org.arta.vacationpaycalculator.service;

import org.arta.vacationpaycalculator.model.VacationPay;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;

@Service
public class CalculateVacationPayService {
    public int calculateVacationPay(int avgSalaryPerYear, int vacationDaysCount) {
        VacationPay vacationPay = new VacationPay(avgSalaryPerYear, vacationDaysCount);
        return vacationPay.calculate();
    }
}
