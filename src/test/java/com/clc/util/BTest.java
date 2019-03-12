package com.clc.util;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value=MyReportGenListener.class)
public class BTest{
	
	@Test(priority=1)
	public void b1(){
		System.out.println("B-m1");
	}

	@Test(groups={"bbb","aaa"})
	public void b2(){
		System.out.println("B-m2");
	}
	
	@Test(groups={"bbb"})
	public void b3(){
		System.out.println("b-m3");
	}
	
	@Test(priority=2)
	public void b4(){
		System.out.println("b-m4");
	}	
	
	@Test
	public void b5(){
		System.out.println("b-m5");
	}	
	
	@Test
	public void b6(){
		System.out.println("b-m6");
	}
	
	@AfterSuite
	public void reportGeneration(){
		
	}
}


