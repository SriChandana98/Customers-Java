package com.sj.collectionfr;

import java.util.Comparator;

public class sortById implements Comparator<Account> {
	 public int compare(Account a, Account b) 
	    { 
	        return a.id - b.id; 
	    } 
}
