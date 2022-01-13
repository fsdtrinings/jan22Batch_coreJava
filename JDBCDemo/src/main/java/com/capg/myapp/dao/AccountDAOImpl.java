package com.capg.myapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capg.myapp.beans.Account;
import com.capg.myapp.util.DBConnection;


/**
 * DAO class responsible for all DB logic 
 * */
public class AccountDAOImpl implements AccountDAO {

	Connection con = DBConnection.con;
	PreparedStatement ps; // these are the statements which consist precompiled SQL quries
	
	public boolean insertAccount(Account account){
		
		String sqlQuery = "insert into capg.account values(?,?,?,?,?,?)";
		try
		{
			ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, account.getAccontNumber());
			ps.setString(2, account.getAccountName() );
			ps.setInt(3, account.getBalance());
			ps.setString(4, account.getBranchName());
			ps.setString(5, account.getState());
			ps.setString(6, account.getCountry());
			
			
			int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
			if(i==1) return true;
			return false;
		}
		catch(Exception e)
		{
			System.out.println("Eception while Data Insertion "+e);
		}
		
		return false;
	}

	public Account getAccount(int accountNumber) {
		
		String sqlQuery = "select * from capg.Account where accountNumber = ?";
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, accountNumber);
			
			ResultSet rs =  ps.executeQuery();
			while(rs.next())
			{
				int acountNumber = rs.getInt("accountNumber");
				String name = rs.getString("accountName");
				int acountBalance = rs.getInt("balance");
				String branchName = rs.getString("branchName");
				String state = rs.getString("state");
				String country = rs.getString("country");
				
				Account a = new Account(acountNumber, name, acountBalance, branchName, state, country);
				
				return a;
			
			}
		} catch (Exception e) {
			
			System.out.println("Exception in getAccount by accountNumber "+e);
		}
		
		
		return null;
	}
	
	
	public List<Account> getAccounts(int balanceRange1, int balanceRange2) {
		
		String sqlQuery = "select * from capg.account where balance>=? and balance<=?";
		List<Account> accountsList = new ArrayList<Account>();
		
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, balanceRange1);
			ps.setInt(2, balanceRange2);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				int acountNumber = rs.getInt("accountNumber");
				String name = rs.getString("accountName");
				int acountBalance = rs.getInt("balance");
				String branchName = rs.getString("branchName");
				String state = rs.getString("state");
				String country = rs.getString("country");
				
				Account a = new Account(acountNumber, name, acountBalance, branchName, state, country);
				accountsList.add(a);
				
			}
			return accountsList;
			
		} catch (SQLException e) {
			System.out.println("Exception in getAccount by balance range "+e);
		}
		
		
		return null;
	}

	public boolean modifyAccountBranchName(String newBranchName,int accountNumber) {
		// TODO Auto-generated method stub
		// if SQL safe mode issue happens 
		// https://stackoverflow.com/questions/11448068/mysql-error-code-1175-during-update-in-mysql-workbench
		
		try {
			String sqlQuery = "update capg.account set branchName = ? where accountNumber = ?";
			ps = con.prepareStatement(sqlQuery);
			ps.setString(1, newBranchName);
			ps.setInt(2, accountNumber);
			
			int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
			if(i>0) return true;
			return false;
			
		} catch (Exception e) {
			System.out.println("Exception in BranchName modification "+e);
		}
		
		return false;
	}

}
