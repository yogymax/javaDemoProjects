package com.clc.java.demo1;


public class A {
	
	public int publicVar=10;
	protected int protectedVar=10;
	 	int defaultVar=10;
	private int privateVar=10;
	
	
	static public int spublicVar=10;
	static protected int sprotectedVar=10;
	static 	int sdefaultVar=10;
	static private int sprivateVar=10;
	
	
	
	public void m1(){ 	
			//I -I   -- direct access 
			System.out.println(publicVar);
			System.out.println(protectedVar);
			System.out.println(defaultVar);
			System.out.println(privateVar);
			
			//I-s -- direct
			System.out.println(spublicVar);
			System.out.println(sprotectedVar);
			System.out.println(sdefaultVar);
			System.out.println(sprivateVar);
			
			
			
	}
	
	static public void m2(){
		//I -I   -- direct access 
		A  a = new A();
		System.out.println(a.publicVar);
		System.out.println(a.protectedVar);
		System.out.println(a.defaultVar);
		System.out.println(a.privateVar);
	
		
		//s-s
		System.out.println(spublicVar);
		System.out.println(sprotectedVar);
		System.out.println(sdefaultVar);
		System.out.println(sprivateVar);
		
		
		
		
	}
	
	
}


/**
default imports
		1#java.lang
		2#all clses withing packg
normal import
	import package.*
	import packagename.clasname;
static import - -if you want to imports all static members in another class without specifying classname
		import  static packagename.clasname.staticfield; -- specific field will be directly accessible without classname
		import static pckagename.classname.*; -- all fields of specified class will be accesible inside this class
inline import
	write down entire package name along with classname thereitself wherever you are using.
		everytime you need to write..
		
*/