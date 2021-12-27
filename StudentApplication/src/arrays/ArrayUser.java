package arrays;

import java.util.Iterator;
// line 1
import java.util.Scanner;

public class ArrayUser {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArraysOperation arrayApp = new ArraysOperation();
		
		System.out.println(" Enter 5 Elements in the array");
		for(int x = 0;x<5;x++)
		{
			System.out.println(" Enter the Element for Array ");
			arrayApp.doInsert(sc.nextInt());
			
		}
		
		
		
		
		// ---- Print array old approach
		//arrayApp.printArray();
		
		
		// ---- Print array oops approach
		int arr[] = arrayApp.getArr();
		int size = arrayApp.getSize();
		
		for(int i = 0;i<size;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		
		System.out.println("\n\n");
		int searchElement = 48485;
		int pos = arrayApp.searchFromArray(searchElement);
		if(pos != -1)
		{
			System.out.println(searchElement+" available at "+pos);
		}
		else
		{
			System.out.println(searchElement+" is not in the list");
		}
	}
	
	
}
