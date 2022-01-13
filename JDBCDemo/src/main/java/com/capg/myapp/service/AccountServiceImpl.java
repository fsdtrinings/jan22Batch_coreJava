package com.capg.myapp.service;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.capg.myapp.beans.Account;
import com.capg.myapp.dao.AccountDAO;
import com.capg.myapp.dao.AccountDAOImpl;
import com.capg.myapp.execption.InvalidAccountBalanceException;
import com.capg.myapp.execption.InvalidAccountNumberException;
import com.capg.myapp.execption.InvalidBranchNameException;

public class AccountServiceImpl implements AccountService {

	// Animal    a    = new Dog();
	AccountDAO accountDAO = new AccountDAOImpl();
	
	
	public boolean insertAccount(Account account)throws InvalidAccountBalanceException
	{
		
		// validation business logic 
		if(account != null)
		{
			if(account.getAccontNumber() >=1 && account.getAccountName()!=null)
			{
				
				if(account.getBalance()<= 100 )
				{
					throw new InvalidAccountBalanceException();
				}
				else
				{
					// pass account to DB layer for insertion
					boolean isDataInserted = accountDAO.insertAccount(account);
					return isDataInserted;
				}
			}
			else
			{
				return false;
			}
		}
		return false;
	}

	public Account getAccount(int accountNumber) throws InvalidAccountNumberException {
		
		// code to get account from DB based on accountNumber
		Account account = accountDAO.getAccount(accountNumber);
		// if account not found then should raise an Exception 
		if(account == null)
		{
			throw new InvalidAccountNumberException();
		}
		return account;
	}

	public List<Account> getAccounts(int balanceRange1, int balanceRange2) {
		
		List<Account> allAccounts = null;
		if(balanceRange1<balanceRange2)
		{
			allAccounts = accountDAO.getAccounts(balanceRange1, balanceRange2);
			return allAccounts;
		}
		else return null;
	}

	public boolean modifyAccountBranchName(String newBranchName,int accountNumber) throws InvalidBranchNameException,InvalidAccountNumberException 
	{
		
		String validBranchNames[] = 
			{
					"NewDelhi111","NewDelhi123","Hydrabad555"
			};
		boolean isValidBranch = false;
		// check the new branch Name ,if not exist then should raise an Exception
		
		if(getAccount(accountNumber)!= null)
		{
			
			for (String availableBranchName : validBranchNames) {
				if(newBranchName.equals(availableBranchName))
				{
					isValidBranch = true;
					boolean status =  accountDAO.modifyAccountBranchName(newBranchName, accountNumber);
					return status;
				}
			}
			if(!isValidBranch)
			{
				throw new InvalidBranchNameException();
			}
		}
		else
		{
			throw new InvalidAccountNumberException();
		}
			
		return false;
		
	}

	

}
