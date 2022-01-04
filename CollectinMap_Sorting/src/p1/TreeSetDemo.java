package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSetDemo obj = new TreeSetDemo();
		//obj.example1();
		
		System.out.println("--------------- Default Output ----------------------------------\n\n");
		obj.example2();
		System.out.println("----------------Sort based on Star Ratings ---------------------------------\n\n");
		obj.example3();
		System.out.println("----------------Sort based on Price Low to High ---------------------------------\n\n");
		obj.example4();
		
	}
	
	public void example1()
	{
		TreeSet<Integer> intSet = new TreeSet<>();
		intSet.add(90);
		intSet.add(190);
		intSet.add(30);
		intSet.add(9);
		intSet.add(45);
		
		System.out.println(intSet);
		
		
		TreeSet<String> strSet = new TreeSet<>();
		strSet.add("Dinesh");
		strSet.add("Abhinav");
		strSet.add("Krishna Vamsi");
		strSet.add("Acxyz");
		strSet.add("Aaxyz");
		strSet.add("Dajbhjv");
		strSet.add("Dkahjhjjbhjv");
		strSet.add("zabhv");
		strSet.add("zeabhv");
		
		System.out.println(strSet);
		
		
		
		
	}

	public TreeSet<Laptop> populateLaptops()
	{
		TreeSet<Laptop> laptopSet = new TreeSet<>();
		laptopSet.add(new Laptop(1,"HP", 1600, 5));
		laptopSet.add(new Laptop(2,"Dell", 1880, 4));
		laptopSet.add(new Laptop(3,"Lenovo", 1500, 3));
		laptopSet.add(new Laptop(4,"Apple", 2500, 5));
		return laptopSet;
	}
	
	public void example2()
	{
		
		TreeSet<Laptop> laptopSet = new TreeSet<>();
		laptopSet = populateLaptops();
		doPrint(laptopSet); // print the laptops based on the sorted order mentioned in bean class
		
	}
	
	
	// sort laptops on the basis of starRating
		public void example3()
		{
			// TreeSet
			TreeSet<Laptop> laptopSet = new TreeSet<>();
			laptopSet = populateLaptops();
			
			// convert set to list , so that collection.sort method can take it as argument
			
			List<Laptop> laptopList = new ArrayList<>();
			laptopList.addAll(laptopSet);// this is how we can insert set(or any collection) elements into List 
			
			// collections.sort is used to sort the list based on our preference
			// 1st arg is list itself
			// 2nd arg is object of Sorting class
			
			StarRatingSorting starRatingSortedObject = new StarRatingSorting(); 
			Collections.sort(laptopList, starRatingSortedObject);
			
			doPrint(laptopList);
			
		}
		
		// sort laptops on the basis of price low to high
		public void example4()
		{
			TreeSet<Laptop> laptopSet = new TreeSet<>();
			laptopSet = populateLaptops();
			
			List<Laptop> laptopList = new ArrayList<>();
			laptopList.addAll(laptopSet);
			
			Collections.sort(laptopList, new PriceLowToHighSorting());
			
			doPrint(laptopList);
		}
		
		
	
	
	
	
	public void doPrint(Collection<Laptop> collection)
	{
		for (Laptop laptop : collection) {
			System.out.println(laptop);
		}
	}
	
	
}
