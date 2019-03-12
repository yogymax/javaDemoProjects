package com.clc.util;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Listeners(value=MyReportGenListener.class)
public class ATest {

/*	@DataProvider(name="abc")
	public Object[][] testdata(){
		Object[][] testData= new Object[2][2];
		
		testData[0][0] = "a1";
		testData[0][1] = "a2";
		
		testData[1][0] = "b1";
		testData[1][1] = "b2";
		
		return testData;
	}
	
	@Test(dataProvider="abc",groups={"aaa","bbb"}) 
	public void m1(String a,String b){//Skip
		System.out.println(a +": "+ b);
		System.out.println("A-m1");
	}

	@Test(dataProvider="abcd",dataProviderClass=MyDataProvider.class,groups={"aaa"})
	public void m2(String a,String b){
		System.out.println(a +": "+ b);
		System.out.println("A-m2");
	}
	
	@Test(groups={"aaa"},expectedExceptions={ClassCastException.class})
	public void m3(){
		System.out.println("A-m3");
		String s= null;
		s.toCharArray();
	}
	
	@Test(groups={"aaa","bbb"})
	public void m4(){
		System.out.println("A-m4");
	}
	
	
	@Test(dependsOnMethods={"m7"})
	public void m66(){
		System.out.println("A-m4");
	}
	
	
	@Test(dependsOnMethods={"m7"})
	public void m6(){
		System.out.println("A-m4");
	}
	*/
	@Parameters({"os"})
	@Test
	public void m7(String os){
		System.out.println("Your parameter value : " +os);
		System.out.println("A-m4");
		if(!os.equals("windows")){
			int num=10/0;
		}else{
			System.out.println("pass");
		}
		
		
	}
	
	
}



