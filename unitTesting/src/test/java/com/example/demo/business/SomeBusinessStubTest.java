package com.example.demo.business;

import static org.junit.Assert.*;
import org.junit.Test;

import com.example.demo.service.SomeDataService;


class SomeDataServiceStub implements SomeDataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3};
	}
	
	
}

public class SomeBusinessStubTest {
	
	

	@Test
	public void CalculateSumUsingDataService_basic() {
		SomeBusinessImpl obj=new SomeBusinessImpl();
		obj.setSomeDataService(new SomeDataServiceStub());
		//int actualResult=obj.calculateSum(new int[] {1,2,3});
		int actualResult=obj.calculateSumUsingDataService();
		int expectedResult=6;
		assertEquals(expectedResult,actualResult);
	}

}
