package com.example.demo.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.service.SomeDataService;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {
	
	@InjectMocks
	SomeBusinessImpl obj;
	
	@Mock
	SomeDataService data;
	
//	@Before
//	public void before() {
//		obj.setSomeDataService(data);
//	}

	@Test
	public void CalculateSumUsingDataService_basic() {
		
		when(data.retrieveAllData()).thenReturn(new int[] {1,2,3});
		
		assertEquals(6,obj.calculateSumUsingDataService());
	}
	@Test
	public void CalculateSumUsingDataService_empty() {
		
		when(data.retrieveAllData()).thenReturn(new int[] {});
		
		assertEquals(0,obj.calculateSumUsingDataService());
	}
	@Test
	public void CalculateSumUsingDataService_one() {
		
		when(data.retrieveAllData()).thenReturn(new int[] {5});
		
		assertEquals(5,obj.calculateSumUsingDataService());
	}
}
