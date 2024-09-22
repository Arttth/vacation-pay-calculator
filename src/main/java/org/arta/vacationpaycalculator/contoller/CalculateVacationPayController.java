package org.arta.vacationpaycalculator.contoller;

import lombok.AllArgsConstructor;
import org.arta.vacationpaycalculator.service.CalculateVacationPayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
public class CalculateVacationPayController {
    private CalculateVacationPayService calculateVacationPayService;
    private final static String GET_MAPPING_NAME = "/calculate";
    private final static String AVG_SALARY_PARAM_NAME = "avg-salary";
    private final static String VACATION_DAYS_PARAM_NAME = "vacation-days";

    @GetMapping(GET_MAPPING_NAME)
    public int calculateVacationPay(@RequestParam(AVG_SALARY_PARAM_NAME) int avgSalaryPerYear,
                                    @RequestParam(VACATION_DAYS_PARAM_NAME) int vacationDaysCount) {
        return calculateVacationPayService.calculateVacationPay(avgSalaryPerYear, vacationDaysCount);
    }
}
