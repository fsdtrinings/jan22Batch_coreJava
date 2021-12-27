package str;

public class StringDemo {
	
	public static void main(String[] args) {
		
	
		String str1 = new String("Hello");
		String str2 = new String("hello");
		
		String str3 = new String("Hello Ramesh");
		
		
		String s1 = "Java";
		String s2 = "Java";
		
		boolean a = (str1 == str2);
		System.out.println(a);// true
		
		boolean b = (s1 == s2);
		System.out.println(b);// true
		
		//str1 = str1.toUpperCase(); // HELLO
		System.out.println(str1);
		
		//str1 = str1.substring(2, 4);
		System.out.println(str1);
		// -------------------------------------
		
		System.out.println(" Through Equals Method ");
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equals(str3));
		
		
		
		
	}

}
