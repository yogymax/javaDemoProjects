package com.clc.util;

import org.testng.annotations.DataProvider;

public class MyDataProvider {

	@DataProvider(name="abcd")
	public static Object[][] abcd(){
		Object[][] testData= new Object[2][2];
		
		testData[0][0] = "a1";
		testData[0][1] = "a2";
		
		testData[1][0] = "b1";
		testData[1][1] = "b2";
		
		return testData;
	}

	
}
