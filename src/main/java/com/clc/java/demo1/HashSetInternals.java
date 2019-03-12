package com.clc.java.demo1;

import java.util.HashSet;

public class HashSetInternals {
		/**
		 * Collection -	
		 * 		Only Objects
		 * 	    Every implemented class has backend datastructure
		 * 		Every data structure in growable in nature
		 * 		Homogenous + Hetrogenous
		 * Set
		 * 	 Duplicates not allowed
		 * 	 Seq order not maintained
		 * 	 Single Null is allowed
		 * 	Hashset = 4+3
		 * 		 hashmap -- Map -- Key value			
		 * 
		 * Hashtable -- Open Hashing...Indexing...
		 * 			
		 * 
		 * @param args
		 */
	
	
		public static void main(String[] args) {
	/*			HashSet<Integer> numbers = new HashSet<Integer>();
				
				numbers.add(10); // true -- null
				numbers.add(20); //true -- null
				numbers.add(20);//false -- PRESENT
				numbers.add(20);//false- PRESENT
				numbers.add(23); //true null
				numbers.add(22);//true -- null
				numbers.add(null);//true null
				
				
				System.out.println(numbers);
				System.out.println(numbers.size());
				*/
				
				Emp e1= new Emp(1, "A");
				Emp e2= new Emp(2, "A");
				
				HashSet<Emp> emps = new HashSet<Emp>();
				emps.add(e1);//1bF293129 -- hash -- 12313828
				emps.add(e2);////a341bF293129 -- hash -129391328
				
				System.out.println(emps);
				System.out.println(emps.size());
			
		}

}



class Emp{
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "\n Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	
	
}