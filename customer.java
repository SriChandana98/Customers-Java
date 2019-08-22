package com.sj.collectionfr;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class customer {
	int id,n;
	String name;
	static Scanner sc=new Scanner(System.in);
	void add()
	{
		n=sc.nextInt();
		System.out.println("enter id ,name to add to the list");
		id=sc.nextInt();
		name=sc.nextLine();
		
		HashMap<Integer,String> map = new HashMap<Integer,String>(n); 
		  for (int i=1; i<=n; i++) 
            map.put(id,name); 
		  System.out.println(map); 
		  
  
	}
	
	void display()
	{
		System.out.println("enter customer id");
		
	}
	public static void main(String args[])
	{ 
		customer c=new customer();
	   System.out.println("enter 1 for new entry/ enter 2 for display/ default for exit");
	   int i=sc.nextInt();
		switch(i)
		{
		case 1:c.add();
		break;
		case 2: c.display();
		break;
		default: 
			System.out.println("wrong choice");
		break;
		}
	}

}
