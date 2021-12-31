package p3;

import java.io.FileNotFoundException;

public class UserServerCode {

	public String validateDomainName(String email)throws InvalidDomainNameExcption
	{
		 // ashish@gmail.com
		// ashish@yahoo.com
		
			String arr[] = email.split("@");
				
			if(arr.length == 2)
			{
				if(arr[1].equals("gmail.com"))
				{
					return " Valid Status";
				}
				else
				{
					throw new InvalidDomainNameExcption(arr[1]);
				}
			
			}
			return null;
		
	}
}
