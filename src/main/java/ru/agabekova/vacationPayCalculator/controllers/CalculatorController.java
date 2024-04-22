package ru.agabekova.vacationPayCalculator.controllers;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.agabekova.vacationPayCalculator.services.CalculatorService;
import ru.agabekova.vacationPayCalculator.models.VacationCalculator;

@Controller
@AllArgsConstructor
public class CalculatorController {
    private final CalculatorService calculatorService;

    @GetMapping("/calculator")
    public String getCalculation(@ModelAttribute("calculator") VacationCalculator vacationCalculator,
                             Model model) {

        model.addAttribute("calculator", calculatorService.getCalculateVacation(vacationCalculator));
        return "calculator";
    }
}