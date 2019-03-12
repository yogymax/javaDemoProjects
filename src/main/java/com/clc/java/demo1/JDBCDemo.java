package com.clc.java.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	
	public static void main(String[] args) throws SQLException  {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			Connection con=null;
			ResultSet rset=null;
			Statement stmt=null;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin123");
				stmt = con.createStatement();
				for(int i=1;i<=5;i++)
					stmt.executeUpdate("insert into employee_info_jdbc values("+i +"," +"'Thomas','Sales',5000)");
				rset = stmt.executeQuery("select * from employee_info_jdbc");
				while(rset.next()){
					System.out.print(rset.getInt("id") +"    ");
					System.out.print(rset.getString("name")+"    ");
					System.out.print(rset.getString("dept")+"    ");
					System.out.print(rset.getInt("salary")+"    ");
					System.out.println();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(rset!=null)
					rset.close();
				if(stmt!=null)
					stmt.close();
				if(con!=null)
					con.close();
			}
		//stmt.executeUpdate("create table employee_info_jdbc (id INT AUTO_INCREMENT PRIMARY KEY,name varchar(20),dept varchar(10),salary int(10))");
		
		
				
		
	}

}





/**

Type1
Type2
Type3
Type4 * -- Pure Object Orieneted
	https://www.geeksforgeeks.org/jdbc-drivers/
	


	loadthe drivers -- Class.forName('-------')
	create connection --Connection con =  DriverManager.getConnection(url,username,password)
	Create Stmt = Statement st =con.createStatement()
	Resultset = ResultSet rs = st.executeQuery(--------------)
	Cleanup -- rs...st ...con..
	
	
	JDBC-- 
		Load the drivers -- 
				Class.forName("oracle.jdbc.driver.OracleDriver"); 
				Class.forName("com.mysql.jdbc.Driver"); 
		Create Connection
				//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  

		
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/sonoo","root","root");


		create table employee (id INT AUTO_INCREMENT PRIMARY KEY,name varchar(20),dept varchar(10),salary int(10));
		
		
		
	Create Connection  =connectionString,username,password
		#connectionString -- url
				1 - Protocal
				2 - DBname
				3 - -Driver Type #
				4 - MachineName - host/ipaddress/hostname/machinname
				5 - port
				6 - database Schema 
		#username - 
		#password
		
		
		Create Statement
		
			Statement stmt=con.createStatement();  
			Statement stmt=con.createStatement();  
		
		Execute Query
			ResultSet rs=stmt.executeQuery("select * from emp");  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			
		Close Resources
			rs.st..con
	
	Machine1 -- 						Machine2
				within same network -- same machin
				ipaddress/hostname/machinname  -- localhost/127.0.0.1
				portno -- 3306/1521
				username password -- installation time
				driver -- jar provided by vendor - implemenation-- classpath
				
		Shud have knowledge of SQL
			https://www.thegeekstuff.com/2011/10/mysql-tutorial-basics/
		
		
		
				
	Database Installation-- 
		
		

		
		
		package com.clc.java.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	
	public static void main(String[] args) throws SQLException  {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			Connection con=null;
			ResultSet rset=null;
			Statement stmt=null;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin123");
				stmt = con.createStatement();
				for(int i=1;i<=5;i++)
					stmt.executeUpdate("insert into employee_info_jdbc values("+i +"," +"'Thomas','Sales',5000)");
				rset = stmt.executeQuery("select * from employee_info_jdbc");
				while(rset.next()){
					System.out.print(rset.getInt("id") +"    ");
					System.out.print(rset.getString("name")+"    ");
					System.out.print(rset.getString("dept")+"    ");
					System.out.print(rset.getInt("salary")+"    ");
					System.out.println();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(rset!=null)
					rset.close();
				if(stmt!=null)
					stmt.close();
				if(con!=null)
					con.close();
			}
		//stmt.executeUpdate("create table employee_info_jdbc (id INT AUTO_INCREMENT PRIMARY KEY,name varchar(20),dept varchar(10),salary int(10))");
		
		
				
		
	}

}


**/