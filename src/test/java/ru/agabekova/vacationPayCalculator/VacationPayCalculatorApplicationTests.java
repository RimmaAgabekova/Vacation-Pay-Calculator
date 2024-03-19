package ru.agabekova.vacationPayCalculator;

import org.junit.jupiter.api.Test;
import ru.agabekova.vacationPayCalculator.models.VacationCalculator;
import ru.agabekova.vacationPayCalculator.services.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacationPayCalculatorApplicationTests {

	@Test
	public void testWithValidParameters() {
		CalculatorService calculatorService = new CalculatorService();
		String actual = calculatorService.getCalculateVacation(new VacationCalculator(100000.00, 14));
		String expected = "47781,57";
		assertEquals(expected, actual);
	}
}
