package com.capg.myapp.service;

import java.util.List;

import com.capg.myapp.beans.Account;
import com.capg.myapp.execption.InvalidAccountBalanceException;
import com.capg.myapp.execption.InvalidAccountNumberException;
import com.capg.myapp.execption.InvalidBranchNameException;

public interface AccountService {
	public boolean insertAccount(Account account)throws InvalidAccountBalanceException;
	public Account getAccount(int accountNumber)throws InvalidAccountNumberException;
	public List<Account> getAccounts(int balanceRange1,int balanceRange2);
	public boolean modifyAccountBranchName(String newBranchName,int accountNumber)
			throws InvalidBranchNameException,InvalidAccountNumberException;
	
}
