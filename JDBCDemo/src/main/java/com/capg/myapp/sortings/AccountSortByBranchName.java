package com.capg.myapp.sortings;

import java.util.Comparator;

import com.capg.myapp.beans.Account;

public class AccountSortByBranchName implements Comparator<Account>{

	public int compare(Account a1, Account a2) {
	
		return a1.getBranchName().compareTo(a2.getBranchName());
	}
	
	

}
