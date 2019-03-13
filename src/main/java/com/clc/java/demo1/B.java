package com.clc.java.demo1;

public class B extends A{
	
	int num2=100;
	
	

	public void m1(){ 	
	
			System.out.println("git commit...from repo by other developer");
		System.out.println("git commit......2");
		//I -I   -- direct access 
			System.out.println(publicVar);
			System.out.println(protectedVar);
			System.out.println(defaultVar);
//			System.out.println(privateVar);
			
			//I-s -- direct
			System.out.println(spublicVar);
			System.out.println(sprotectedVar);
			System.out.println(sdefaultVar);
//			System.out.println(sprivateVar);
	}
	
	static public void m2(){
		//I -I   -- direct access 
		A  a = new A();
		System.out.println(a.publicVar);
		System.out.println(a.protectedVar);
		System.out.println(a.defaultVar);
//		System.out.println(a.privateVar);
		//s-s
		System.out.println(spublicVar);
		System.out.println(sprotectedVar);
		System.out.println(sdefaultVar);
//		System.out.println(sprivateVar);
		
		
		
		
	}
	
	
}
