package com.sj.collectionfr;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class Account {
	int id; 
    String name, address; 
	public Account(int id, String name, String address) {

        this.id = id; 
        this.name = name; 
        this.address = address; 
	}
	 public String toString() 
	    { 
	        return this.id + " " + this.name + 
	                           " " + this.address; 
	    } 
	

}
