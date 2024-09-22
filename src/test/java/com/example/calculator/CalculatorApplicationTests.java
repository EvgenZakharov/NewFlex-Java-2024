package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testCalculateVacationPay() {
		VacationCalculatorController controller = new VacationCalculatorController();

		double averageSalary = 29300.0; // Пример средней зарплаты
		int vacationDays = 10; // Пример количества отпускных дней

		// Ожидаемый результат: (29300 / 29.3) * 10 = 10000.0
		double expectedVacationPay = 10000.0;
		double actualVacationPay = controller.calculateVacationPay(averageSalary, vacationDays);

		assertEquals(expectedVacationPay, actualVacationPay, "Расчет отпускных выполнен неверно");
	}

	@Test
	public void testCalculateVacationPayZeroDays() {
		VacationCalculatorController controller = new VacationCalculatorController();

		double averageSalary = 29300.0;
		int vacationDays = 0;

		// Ожидаемый результат: (29300 / 29.3) * 0 = 0.0
		double expectedVacationPay = 0.0;
		double actualVacationPay = controller.calculateVacationPay(averageSalary, vacationDays);

		assertEquals(expectedVacationPay, actualVacationPay, "Расчет отпускных для нулевых дней выполнен неверно");
	}

	@Test
	public void testCalculateVacationPayZeroSalary() {
		VacationCalculatorController controller = new VacationCalculatorController();

		double averageSalary = 0.0;
		int vacationDays = 10;

		// Ожидаемый результат: (0 / 29.3) * 10 = 0.0
		double expectedVacationPay = 0.0;
		double actualVacationPay = controller.calculateVacationPay(averageSalary, vacationDays);

		assertEquals(expectedVacationPay, actualVacationPay, "Расчет отпускных для нулевой зарплаты выполнен неверно");
	}

}
