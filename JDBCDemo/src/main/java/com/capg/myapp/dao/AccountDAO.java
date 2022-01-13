package com.capg.myapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.capg.myapp.beans.Account;
import com.capg.myapp.execption.InvalidAccountBalanceException;

public interface AccountDAO {
	
	public boolean insertAccount(Account account);
	public Account getAccount(int accountNumber);
	public List<Account> getAccounts(int balanceRange1,int balanceRange2);
	public boolean modifyAccountBranchName(String newBranchName,int accountNumber);
	
	

}
