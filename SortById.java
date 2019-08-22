package com.sj.collectionfr;

import java.util.Comparator;

public class SortById implements Comparator<Account> {
	 public int compare(Account a, Account b) 
	    { 
	        return a.id - b.id; 
	    } 
}

