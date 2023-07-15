package FMProject.dao;
import java.sql.*;
public class DB {
public static Connection getCon(){
	Connection con1=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");//url of jdbc driver
		System.out.println("driver registered succesfully");
		con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/fee_student","root","1234");//url of database
		System.out.println("connection established successfully");
		Statement st=con1.createStatement();
		
		//st.execute("create database fee_student");
//		System.out.println("database is created");
//		st.execute("CREATE TABLE  FEE_STUDENT(ROLLNO VARCHAR(2000),\r\n"
//				+ "NAME VARCHAR(2000),EMAIL VARCHAR(2000),SEX VARCHAR(2000),\r\n"
//				+ "COURSE VARCHAR(2000),FEE int,PAID int,DUE int,ADDRESS VARCHAR(2000),CONTACT VARCHAR(2000))");
//		st.execute("CREATE TABLE  FEE_ACCOUNTANT (ID int, \r\n"
//				+ "	NAME VARCHAR(2000), \r\n"
//				+ "	EMAIL VARCHAR(2000), \r\n"
//				+ "PASSWORD VARCHAR(2000), \r\n"
//				+ "	ADDRESS VARCHAR(2000), \r\n"
//				+ "	CONTACT VARCHAR(2000))");
		System.out.println("Table created Successfully");
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return con1;
}
public static void main(String[] args) {
	DB.getCon();
}
}
