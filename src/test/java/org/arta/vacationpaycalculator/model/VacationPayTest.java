package org.arta.vacationpaycalculator.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class VacationPayTest {
    private static final Double AVG_DAYS_OF_YEAR = 29.3;
    private static final Integer AVG_SALARY = 5000000;
    private static final Integer VACATION_DAYS_COUNT = 17;
    private VacationPay vacationPay;

    @BeforeEach
    public void init() {
        this.vacationPay = new VacationPay(AVG_SALARY, VACATION_DAYS_COUNT);
    }

    @Test
    void calculate() {
        int avgDayEarnings = (int) Math.floor(AVG_SALARY / AVG_DAYS_OF_YEAR);
        int vacationPayTest = avgDayEarnings * VACATION_DAYS_COUNT;

        assertEquals(vacationPayTest, vacationPay.calculate());
    }
}