package com.pack.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorServiceTest {

	Calculator c1=null;
	CalculatorService cs= ;
	@Test
	public void testOperation() {
		
		//fail("Not yet implemented");
		assertTrue(c1.performCalculation(cs));
	}
	@Before
	public void createObject() {
		System.out.println("object creation ");
		c1 = new Calculator();
	}
}
