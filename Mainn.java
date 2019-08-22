package com.sj.collectionfr;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
public class Mainn {


		 public static void main (String[] args) 
		    { 
		        ArrayList<Account> ar = new ArrayList<Account>(); 
		        ar.add(new Account(111, "bbbb", "london")); 
		        ar.add(new Account(131, "aaaa", "nyc")); 
		        ar.add(new Account(121, "cccc", "jaipur")); 
		  
		        System.out.println("Unsorted"); 
		        for (int i=0; i<ar.size(); i++) 
		            System.out.println(ar.get(i)); 
		  
		        Collections.sort(ar, new SortById()); 
		  
		        System.out.println("\nSorted by rollno"); 
		        for (int i=0; i<ar.size(); i++) 
		            System.out.println(ar.get(i)); 
		  
		        
		    } 
		 

	}