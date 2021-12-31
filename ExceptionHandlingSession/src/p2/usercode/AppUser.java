package p2.usercode;

import java.io.FileNotFoundException;

import p2.servercode.UserServerCode;

public class AppUser {

	public static void main(String[] args) {
		
		AppUser app = new AppUser();
		UserServerCode server = new UserServerCode();		
		
		try {
			
			String email = app.getEmail();
			String domainName = server.getDomainNamefromEmail(email);
			app.printDomainName(domainName);
			
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Contact to Customer Care 1800096545");
			System.out.println(" System Issue \n=====================\n");
			System.out.println(e);
		}
		catch(RuntimeException e)
		{
			System.out.println("Some Other Issue "+e);
		}
		
		
	}
	
	public String getEmail()
	{
		//return "ashish@gmail.com"; // java console/web/android/Tv/watch/3rd party API
		return "ashish@gmail.com";
	}
	
	public void printDomainName(String domainName)
	{
		System.out.println(" Domain Name is "+domainName);
	}
	
}
