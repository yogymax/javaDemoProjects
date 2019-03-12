package com.clc.util;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.clc.util.AppConstants.*;

/***
 * 
 * @Test
 * @beforeX
 * @AfterX
 * 
 * @before
 * 	Method -- method annotated with @Test
 * 	Class - class which has atleast one TestMethod
 * 	Suite  -- All Test classes of an application 
 * 			Test -- collection of Test classes  -- collection of test classes
 * Group-- collection of Test methods irrecpective of Test classes
 * @After
 * 
 * 
 * 
 * 
 * com.clc  -- login
 * 			A - 10
 * 			B - 15
 * 			C - 15
 * com.demo  - Dashboard
 * 			P -20
 * 			Q  10
 * com.xyz  -- reporting
 * 			X 5
 * 			Y 5
 * 
 * 
 * 
 * @author Yogesh
 *
 */

@Listeners(value=MyReportGenListener.class)
public class AutheticateTest {
	static BusinessLogicController controller = new BusinessLogicController();

	@DataProvider
	public Object[][] testData(){
		Object[][] data = new Object[8][3];

		data[0][0]="admin";
		data[0][1]="admin123";
		data[0][2]=LOGIN_SUCCESS;
		
		data[1][0]="";
		data[1][1]="admin123";
		data[1][2]=USERNAME_INVALID;
		
		data[2][0]=null;
		data[2][1]="admin123";
		data[2][2]=USERNAME_INVALID;

		data[3][0]="admin";
		data[3][1]="";
		data[3][2]=PASSWORD_INVALID+1;
		
		data[4][0]="admin";
		data[4][1]=null;
		data[4][2]=PASSWORD_INVALID;
		
		data[5][0]="admin123";
		data[5][1]="admin";
		data[5][2]=INCORRECT_CREDENTIALS;
		
		
		data[6][0]="";
		data[6][1]="";
		data[6][2]=USERNAME_INVALID;
		
		data[7][0]=null;
		data[7][1]=null;
		data[7][2]=USERNAME_INVALID;
		
		return data;
		
	}
	
	@BeforeClass
	public void cls(){
		System.out.println("inside c");
	}
	
	@BeforeMethod
	public void x(){
		System.out.println("inside x");
	}
	
	@AfterMethod
	public void a(){
		System.out.println("inside a");
	}
	
	
	@BeforeMethod
	public void y(){
		System.out.println("inside y");
	}
	
	@Test(dataProvider="testData")
	public void verifyCrendentials(String unm,String pwd,String emsg){
		String returnVal = controller.autheticateUser(unm,pwd);
		Assert.assertEquals(returnVal, emsg);
	}
	
	@Test(enabled=false)
	public void invalidCrendentials(){
		String returnVal = controller.autheticateUser("asadmin","dadmin123");
		Assert.assertEquals(returnVal, INCORRECT_CREDENTIALS);
	}
	
	@Test(enabled=false)
	public void invalidUserName(){
		String returnVal = controller.autheticateUser(null,"admin123");
		Assert.assertEquals(returnVal,USERNAME_INVALID);
		
		returnVal = controller.autheticateUser("","admin123");
		Assert.assertEquals(returnVal,USERNAME_INVALID);
		
		returnVal = controller.autheticateUser("asd","admin123");
		Assert.assertEquals(returnVal,USERNAME_INVALID);
		
		
	}
	
	@Test(enabled=false)
	public void invalidPassword(){
		String returnVal = controller.autheticateUser("admin",null);
		Assert.assertEquals(returnVal,PASSWORD_INVALID);
		
		returnVal = controller.autheticateUser("admin12","");
		Assert.assertEquals(returnVal,PASSWORD_INVALID);
		
		returnVal = controller.autheticateUser("aasasssd","aa");
		Assert.assertEquals(returnVal,PASSWORD_INVALID);
	}	
	

}
