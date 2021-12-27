package arrays;

import java.util.Iterator;

public class ArraysOperation {

	
	int arr[] = new int[100];
	
	int size = 0;
	
	public void doInsert(int data)
	{
		// code to insert into array
		arr[size] = data;
		size++;
	}
	
	public int searchFromArray(int searchData)
	{
		int position = -1;

		// code to search from array

		for(int i = 0;i<size;i++)
		{
			if(arr[i] == searchData)
			{
				return i;
			}
		}

		return position;
	}
	/*
	public void printArray()
	{
		for(int i = 0;i<size;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}*/

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	

}
