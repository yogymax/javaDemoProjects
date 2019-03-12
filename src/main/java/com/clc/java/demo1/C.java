package com.clc.java.demo1;

public class C {

	int num=10;
	

	public void m1(){ 	
		
		A  a = new A();
			//I -I   -- direct access 
			System.out.println(a.publicVar);
			System.out.println(a.protectedVar);
			System.out.println(a.defaultVar);
			//System.out.println(a.privateVar);
			
			//I-s -- direct
			System.out.println(A.spublicVar);
			System.out.println(A.sprotectedVar);
			System.out.println(A.sdefaultVar);
			//System.out.println(A.sprivateVar);
			
			
			
	}
	
	static public void m2(){
		//I -I   -- direct access 
		A  a = new A();
		System.out.println(a.publicVar);
		System.out.println(a.protectedVar);
		System.out.println(a.defaultVar);
		//System.out.println(a.privateVar);
		
		//s-s
		System.out.println(A.spublicVar);
		System.out.println(A.sprotectedVar);
		System.out.println(A.sdefaultVar);
		//System.out.println(A.sprivateVar);
		
	}
	
	
	
	
}
