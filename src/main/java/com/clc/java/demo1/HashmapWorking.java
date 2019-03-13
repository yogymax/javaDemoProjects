package com.clc.java.demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashmapWorking {
	
	public static void main(String[] args) {
	
		Employee e1 = new Employee(1,"A");
		Employee e2 = new Employee(1,"A");
		
		//e1
		Employee e3 = new Employee(2,"A");
		Employee e4 = new Employee(2,"B");
		Employee e5 = new Employee(3,"C");
		Employee e6 = new Employee(3,"D");
		
		Employee e7=e1;
		
		
		List<Book> books1 =new ArrayList<>();
		books1.add(new Book(1,"Java-1"));
		books1.add(new Book(2,"dotNet-2"));
		
		
		List<Book> books2 =new ArrayList<>();
		books2.add(new Book(1,"Java-2"));
		books2.add(new Book(2,"dotNet-2"));
		
		
		HashMap<Employee,List<Book>> hmap = new HashMap<>();
		hmap.put(e2,books2);//null
		hmap.put(e1,books1);//null
					hmap.put(e3,books1);//null
					hmap.put(e4,books2);//null -- e3 - v4
					hmap.put(e5,books1);//null
					hmap.put(e6,books2);//null -- e5 - v6
		hmap.put(e7,books1);//v1  -- e1 -- v7		e1- v7
		
		System.out.println("get e2 key value...!");
		System.out.println(hmap.get(e2));
		
		
		
		
		
	}

}

class Employee{
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
		return "\n Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {   //e1.equals(e2)
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		
		if (empId != other.empId)
			return false;
		
		
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	
	
	
}


class Book{
	private int bookId;
	private String bookName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "\n Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
	
	
	
	
	
}