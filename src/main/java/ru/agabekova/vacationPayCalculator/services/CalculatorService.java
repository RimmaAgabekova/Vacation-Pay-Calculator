package ru.agabekova.vacationPayCalculator.services;

import org.springframework.stereotype.Component;
import ru.agabekova.vacationPayCalculator.models.VacationCalculator;

@Component
public class CalculatorService {
    public static final double AVERAGE_QUANTITY_DAYS_IN_MONTH = 29.3;

    public String getCalculateVacation(VacationCalculator vacationCalculator) {

        if ((vacationCalculator.getAverageSalary() == null) || (vacationCalculator.getCountDays() == null)
                || (vacationCalculator.getCountDays() <= 0) || (vacationCalculator.getAverageSalary() <= 0)) {
            return "Введите данные";
        }
        return String.format("%.2f",
                (vacationCalculator.getAverageSalary() / AVERAGE_QUANTITY_DAYS_IN_MONTH) * vacationCalculator.getCountDays());
    }
}








