package org.arta.vacationpaycalculator.model;

import java.time.LocalDate;

public class Holiday {
    private String name;
    private LocalDate date;
    private Holiday(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
