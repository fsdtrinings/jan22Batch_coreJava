package arrays;

public class ArrayUser {
	
	
	public static void main(String[] args) {
		
		ArraysOperation arrayApp = new ArraysOperation();
		arrayApp.doInsert(15);
		arrayApp.doInsert(105);
		arrayApp.doInsert(85);
		arrayApp.doInsert(715);
		
		
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
