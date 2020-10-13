package com.example.demo.business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void CalculateSum_basic() {
		SomeBusinessImpl obj=new SomeBusinessImpl();
		int actualResult=obj.calculateSum(new int[] {1,2,3});
		int expectedResult=6;
		assertEquals(expectedResult,actualResult);
	}

}
