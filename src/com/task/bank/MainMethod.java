package com.task.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Scanner sc=new Scanner(System.in);
		
		
//		  System.out.println("Enter an Account Honder name"); String a=sc.nextLine();
//		  
//		  System.out.println("Enter an Account No"); int b=sc.nextInt();
//		  
//		 System.out.println("Enter an Address of Account Honder"); String c=sc.next();
//		 
//		 System.out.println("Type of  Accout"); String d= sc.next();
//		 
//		  System.out.println("Enter your balance amout"); double e=sc.nextDouble();
		 
	BankApp al=new BankApp();
//	     al.insert(a, b, a, d, e);
			
		System.out.println("List of all the Account ");
		 System.out.println(al.listacount());
	

		 System.out.println("Enter the Account No you want to see");
		 int num=sc.nextInt();
		 
		System.out.println(al.perticularData(num));
		 
	}

}
