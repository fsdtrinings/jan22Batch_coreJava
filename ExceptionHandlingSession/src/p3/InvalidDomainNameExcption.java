package p3;

// no need to write anything for invalid domain name exception
public class InvalidDomainNameExcption extends Exception{

	String domainName; // cause exception
	String exceptionMsg;
	
	
	
	public InvalidDomainNameExcption(String domainName) {
			this.domainName = domainName;
	}



	public String getExceptionMsg()
	{
		return domainName+" is not valid for our entry ";
	}
	
}
