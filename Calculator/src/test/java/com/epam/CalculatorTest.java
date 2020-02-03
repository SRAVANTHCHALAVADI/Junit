package com.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c=new Calculator();
		assertEquals(5,c.add(1, 4));
		assertEquals(2,c.sub(2, 4));
		assertEquals(8,c.mul(4, 2));
		assertEquals(3,c.div(6, 2));
	}

}
