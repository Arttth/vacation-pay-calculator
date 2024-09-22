package org.arta.vacationpaycalculator.model;

public class VacationPay {
    // in kopecks
    private Integer avgSalaryPerYear;
    private Integer vacationDaysCount;
    private static final Double AVG_DAYS_OF_YEAR = 29.3;

    public VacationPay(Integer avgSalaryPerYear, Integer vacationDaysCount) {
        this.avgSalaryPerYear = avgSalaryPerYear;
        this.vacationDaysCount = vacationDaysCount;
    }

    private Integer calculateAvgDayEarnings() {
        return (int) Math.floor(avgSalaryPerYear / AVG_DAYS_OF_YEAR);
    }

    public Integer calculate() {
         return calculateAvgDayEarnings() * vacationDaysCount;
    }
}
