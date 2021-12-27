package str;

public class StringAPI {
	
	
	public static void main(String[] args) {
		
		String str = "    This is Java Class    ";
		
		
		str = str.toUpperCase();
		System.out.println("str"+str);
		
		System.out.println("Str length is "+str.length());
		str = str.trim();
		System.out.println("Str length is "+str.length());
		
		String s = "0123456789";
		String abc = s.substring(3,8);
		System.out.println(abc);
		
		
		// homework 
		// split method of String
		
		
	}

}
