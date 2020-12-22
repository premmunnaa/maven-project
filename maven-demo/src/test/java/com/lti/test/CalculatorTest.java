package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lti.pdf.Calculator;

public class CalculatorTest {

	@Test
	public void addIsWorking() {
		Calculator c = new Calculator();
		int actualResult = c.add(10, 50);
		int expectedResult = 60;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void subIsWorking() {
		Calculator c = new Calculator();
		int actualResult = c.sub(50, 10);
		int expectedResult = 40;
		assertEquals(expectedResult, actualResult);
	}

}
