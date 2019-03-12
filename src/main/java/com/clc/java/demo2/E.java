package com.clc.java.demo2;

import com.clc.java.demo1.A;

public class E {


	public void m1(){ 	
		Integer num =10;
		long l = num;
		
		
		
			//I -I   -- direct access 
		A a = new A();
			System.out.println(a.publicVar);
			/*System.out.println(a.protectedVar);
			System.out.println(defaultVar);
			System.out.println(privateVar);
			*/
			//I-s -- direct
			System.out.println(A.spublicVar);
			/*System.out.println(sprotectedVar);
			System.out.println(sdefaultVar);
			System.out.println(sprivateVar);
			*/
			
			
	}
	
	static public void m2(){
		//I -I   -- direct access 
		A  a = new A();
		System.out.println(a.publicVar);
		/*System.out.println(a.protectedVar);
		System.out.println(a.defaultVar);
		System.out.println(a.privateVar);
	*/
		
		//s-s
		System.out.println(A.spublicVar);
	/*	System.out.println(sprotectedVar);
		System.out.println(sdefaultVar);
		System.out.println(sprivateVar);
	*/	
		
		
		
	}
	
}
