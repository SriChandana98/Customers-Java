package com.sj.collectionfr;
import java.io.File;
import java.sql.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;
public class jdbcConnection {
	static Scanner sc = new Scanner(System.in); 
void view(){
	try {
		 File file = new File("C:\\Users\\Abridge Solutions\\Documents\\values.txt"); 
		Scanner sc = new Scanner(file); 
		Class.forName(sc.nextLine());
		Connection con=DriverManager.getConnection(sc.nextLine(),sc.nextLine(),sc.nextLine());
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}
void insert() {
	try {
		 File file = new File("C:\\Users\\Abridge Solutions\\Documents\\values.txt"); 
		Scanner sc = new Scanner(file); 
		Class.forName(sc.nextLine());
		Connection con=DriverManager.getConnection(sc.nextLine(),sc.nextLine(),sc.nextLine());
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("insert into student (regno,name,degree,college,cgpa)"+"values(106,'kaushani','btech','iit',10.0)");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}
void update() {
	try {
		 File file = new File("C:\\Users\\Abridge Solutions\\Documents\\values.txt"); 
		Scanner sc = new Scanner(file); 
		Class.forName(sc.nextLine());
		Connection con=DriverManager.getConnection(sc.nextLine(),sc.nextLine(),sc.nextLine());
		PreparedStatement pst = con.prepareStatement("update students set name=?");
		pst.setString(1, "bhattacharjee" );
		pst.executeUpdate();
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}
void delete() {
	try {
		 File file = new File("C:\\Users\\Abridge Solutions\\Documents\\values.txt"); 
		Scanner sc = new Scanner(file); 
		Class.forName(sc.nextLine());
		Connection con=DriverManager.getConnection(sc.nextLine(),sc.nextLine(),sc.nextLine());
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("delete from students where regno=106");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}

	public static void main(String[] args) {
		jdbcConnection c = new jdbcConnection();
		int t=0;
		while(t==0) {
			int op;
			System.out.println("1.Insert");
			System.out.println("2.view");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			
			System.out.println("5.exit");
			op=sc.nextInt();
			switch(op) {
			case 1: c.insert();
			break;
			case 2: c.view();
			break;
			case 3: c.update();
			break;
			case 4: c.delete();
			break;
			case 5:t=1;
			break;
			default: System.out.println("enter valid option");
			break;
			
				
			}
		}
		
	}

}
