package com.clc.java.demo2;

import com.clc.java.demo1.A;


public class D  extends A{

	

	public void m1(){ 	
			//I -I   -- direct access 
			System.out.println(publicVar);
			System.out.println(protectedVar);
	/*		System.out.println(defaultVar);
			System.out.println(privateVar);
	*/		
			//I-s -- direct
			System.out.println(spublicVar);
			System.out.println(sprotectedVar);
	/*		System.out.println(sdefaultVar);
			System.out.println(sprivateVar);
	*/		
			
			
	}
	
	static public void m2(){
		//I -I   -- direct access 
		D  a = new D();
		System.out.println(a.publicVar);
		System.out.println(a.protectedVar);
		/*System.out.println(a.defaultVar);
		System.out.println(a.privateVar);
	*/
		
		//s-s
		System.out.println(spublicVar);
		System.out.println(sprotectedVar);
	/*	System.out.println(sdefaultVar);
		System.out.println(sprivateVar);
	*/	
		
		
		
	}
	
	
}
