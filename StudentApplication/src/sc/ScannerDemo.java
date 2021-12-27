package sc;

// step 1
import java.util.Scanner;

public class ScannerDemo {

	
	public static void main(String[] args) {
		
		// step 2
		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);
		
		

		System.out.println("Enter int value ");
		int x = sc.nextInt();
		System.out.println("Entered value is "+x);
		

		System.out.println("Enter float value ");
		float f = sc.nextFloat();
		System.out.println("Entered value is "+f);
		
		
		System.out.println("Enter Byte value ");
		byte b = sc.nextByte();
		System.out.println("Entered value is "+b);
		
		
		System.out.println("Enter Short value ");
		short s = sc.nextShort();
		System.out.println("entered value is "+s);
		
		// always take different scanner object for String input
		System.out.println("Enter String value ");
		String str = sc2.nextLine();
		System.out.println("entered value is "+str);
		
				
		
	}
}
