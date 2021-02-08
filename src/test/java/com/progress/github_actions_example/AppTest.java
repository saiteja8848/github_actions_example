package com.progress.github_actions_example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	private static Calculator calculator;

	@BeforeClass
	public static void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void addTest() {
		assertEquals(calculator.add(1, 1), 2);
		assertEquals(calculator.add(0, -1), -1);
		assertEquals(calculator.add(999, 1), 1000);
		assertEquals(calculator.add(1, 100), 101);
	}
	
	@Test
	public void multiplicationTest() {
		assertEquals(calculator.multiplication(10, 10), 100);
		assertEquals(calculator.multiplication(10, 10), 200);
		assertEquals(calculator.multiplication(10, 10), 100);
	}
}
