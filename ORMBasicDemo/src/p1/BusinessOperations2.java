package p1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//   Example of One to Many Relationship
public class BusinessOperations2 {

	static Scanner sc = new Scanner(System.in);
	static Random randomNumber = new Random();
	
	String policyName[] = {"JeevanBimaPolicy","MedicalHealthInsurance","FamilyInsurance","TermedInsurance","CarPolicy"};
	int policySumAssured[] = {450000,1500000,6000000,10000000,500000};
	private Policy policyArr[] = new Policy[5];
	
	
	
	public BusinessOperations2() {
		
	
		for(int i = 0;i<5;i++) {
			policyArr[i] = new Policy();
			policyArr[i].setPolicyName(policyName[i]);
			policyArr[i].setSumAssured(policySumAssured[i]);
			policyArr[i].setPremiumAmount((int)(policySumAssured[i]*0.01));
		}
	}






	public static void main(String[] args) {
		
		BusinessOperations2 obj = new BusinessOperations2();
		
		
		try {
			
			CityBankAccount account1 = getAccount();
			CityBankAccount account2 = getAccount();
			CityBankAccount account3 = getAccount();
			
			
			
			account1.setPolicies(Arrays.asList(obj.policyArr[0],obj.policyArr[2]));
				
			
			
			
			// ----------  Data Insertion --------------------------------------------------------
			
			Configuration cfg = new Configuration();
			SessionFactory factory = cfg.configure().buildSessionFactory();
			Session hibernate = factory.openSession();   // hibernate - session
			
		
			
			// call insert operation
			Transaction t = hibernate.beginTransaction();
			
			for(int i = 0;i<5;i++)
			{
				hibernate.save(obj.policyArr[i]);
			}
			
			hibernate.save(account1);
			hibernate.save(account2);
			hibernate.save(account3);
			
			
			
			
			t.commit();
		
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	
	
	
	
	public static CityBankAccount  getAccount()
	{
		System.out.println("Enter Account Detils ");
		
		CityBankAccount acc = new CityBankAccount();
		System.out.println("Enter Account Holder Name ");
		acc.setAccountName(sc.nextLine());
		acc.setBalance(randomNumber.nextInt(50000));
		
		
		ClientAddress perAddress = new ClientAddress("New Delhi", "A", "dfd",12121);
		ClientAddress temAddress = new ClientAddress("New Delhi", "B", "dfgdfd",56512121);
		
		acc.setPermamentAddress(perAddress);
		acc.setTemoraryAddress(temAddress);
		
		return acc;
		
	}
	
}
