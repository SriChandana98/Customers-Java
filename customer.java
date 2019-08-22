package com.sj.collectionfr;
import java.util.*;
public class customer {
	List<Integer> id = new ArrayList<Integer>();
	List<String> name = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);
	 void insert() {
		System.out.println("Enter id");
		id.add(sc.nextInt());
		System.out.println("Enter name");
		name.add(sc.next());
	}
	void view() {
		System.out.println("Enter id you want to view");
		int tempid =sc.nextInt();
		int tempindx=0;
		for(int i=0;i<id.size();i++) {
			if(id.get(i)==tempid) {
				tempindx=i;
				break;
			}
		}
		System.out.println("the name of id "+tempid+" is "+name.get(tempindx));
	}
	public static void main(String[] args) {
		customer c = new customer();
		int t=0;
		while(t==0) {
			int op;
			System.out.println("1.Insert");
			System.out.println("2.view");
			System.out.println("3.exit");
			op=sc.nextInt();
			switch(op) {
			case 1: c.insert();
			break;
			case 2: c.view();
			break;
			case 3: t=1;
			break;
			default: System.out.println("enter valid option");
			break;
			
				
			}
		}
		
	}

}
