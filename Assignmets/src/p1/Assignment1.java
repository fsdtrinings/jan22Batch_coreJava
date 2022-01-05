package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment1 {

	String blockedDomainName[] = {"whatsapp.com","gmil.com","err.com"};
	// should throw an exception during insertEmail() operation
	// BlockedEmailException
	// if email starts from non-character value (a-z or A-Z are only valid)
	// then throw InvalidEmailException
	
	// NOTE : - Exception should be handled inside main method only
	
	public static void main(String[] args) {
		
		List<String> emails = new ArrayList<>();
		
		
		// step 1  , insert email and print emails  , 10:15 - 10:30
		
		
		
		// step 2 , filter mails and print map 
		
	}
	
	public void storeInTreeSet(Map<String, List<String>> map)
	{
		// In set data should be sorted on the basis of domain name
		
		
		
	}
	
	public List<String> insertEmails(List<String> emails)
	{
		// write code to get email from user input and insert into list
		
		// 1. Scanner Obj 
		// 2. read data from Scanner 
		// 3. insert data into list
		// 4. Validated email based on blocked domain name and throw an exception
		
		
		return null; // 4. return list 
	}
	
	public Map<String, List<String>> filterEmails(List<String> emails)
	{
		
		/*
		 * method will be responsible for filter out emails based on domain name 
		 * then insert into new list and then insert into map wrt key value.
		 * */
		Map<String, List<String>> filteredEmails = new HashMap<>();
		
		/*  Key            Value 
		 * ------------------------------
		 *  Gmail  -> ['ramesh@gmail.com',"suresh@gmail.com","Amith@gmail.com"]
		 *  yahoo  -> ['avinash@yahoo.com',"kavya@yahoo.com"]
		 *  capg   -> ['mohith@capg.com','surya@capg.com']
		 * 
		 * */
		
		// 1. iterate list '
		// 2. extract domain name from the email
		// 3. compare email's domain name with filtered one 
		// 4. insert the email in the list 
		// 5. insert the list in the map corresponding to key 
		// 6. if key already available then fetch the list and repeat step no. 4 
		
		return null;
		
	}
	
	public void printList(List<String> list)
	{
		// print the email list
	}
	public void printMap(Map<String, List<String>> map)
	{
		// print the map 
	}
}
