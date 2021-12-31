package p2.servercode;

import java.io.FileNotFoundException;

public class UserServerCode {

	public String getDomainNamefromEmail(String email)throws FileNotFoundException,NullPointerException,StringIndexOutOfBoundsException
	{
		 // ashish@gmail.com
		
			System.out.println("3- inside server ");
			String arr[] = email.split("@");
			System.out.println("4- inside server");
			
			
			return (arr.length == 2)?arr[1]:null;
		
	}
}
