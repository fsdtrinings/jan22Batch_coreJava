package com.capg.myapp.ui;

import java.util.Collections;
import java.util.List;

import com.capg.myapp.beans.Account;
import com.capg.myapp.service.AccountService;
import com.capg.myapp.service.AccountServiceImpl;
import com.capg.myapp.sortings.AccountSortByBranchName;

public class BankApp {

	public static void main(String[] args) {
		
		// --must be the MENU Based application 
		
		AccountService accountServiceApp = new AccountServiceImpl();
		
		try {

			/*
			Account a = new Account(113, "Jenny", 500, "NY101", "NY", "USA");
			
			boolean status = accountServiceApp.insertAccount(a);
			System.out.println(status);
				*/
			
			/*
			Account a = accountServiceApp.getAccount(11275);
			System.out.println(a);
			*/
			
			
			List<Account> accounts = accountServiceApp.getAccounts(1000, 12000);
			for (Account account : accounts) {
				System.out.println(account);
				
			}
			System.out.println("\n-------------------------------------\n");
			System.out.println(" After Sorting By Branch Name ");
			
			Collections.sort(accounts,new AccountSortByBranchName());
			
			for (Account account : accounts) {
				System.out.println(account);
				
			}
			
			/*
			boolean status = accountServiceApp.modifyAccountBranchName("Hydrabad555", 104);
			System.out.println(status);
			*/
		} catch (Exception e) {
			System.out.println("Contact to Customer Service "+e);
		}		
	}
}
