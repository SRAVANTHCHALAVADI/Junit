package com.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorMsgTest {

	@Test
	public void test() {
		CalculatorMsg m=new CalculatorMsg();
		assertEquals("Completed",m.sayComplete());
	}

}
