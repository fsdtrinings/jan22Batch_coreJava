package p1;

import java.util.ArrayList;
import java.util.List;

public class CustomObjCollection {

	List<Laptop> laptops = new ArrayList<>();
	
	public static void main(String[] args) {
		// create menu 
		CustomObjCollection amazon = new CustomObjCollection(); // can consider like ecom website
		
		Laptop l1 = new Laptop(1, "Dell", 1500, 2);
		Laptop l2 = new Laptop(2, "Apple", 2500, 3);
		Laptop l3 = new Laptop(3, "HP", 500, 4);
		Laptop l4 = new Laptop(4, "Dell", 3500, 5);
		Laptop l5 = new Laptop(5, "HP", 4500, 2);
		Laptop l6 = new Laptop(6, "Lenovo", 1100, 2);
		Laptop l7 = new Laptop(7, "Lenovo", 1000, 4);
		Laptop l8 = new Laptop(8, "HP", 4500, 5);
		
		
		
		amazon.insertIntoList(l1);
		amazon.insertIntoList(l2);
		amazon.insertIntoList(l3);
		amazon.insertIntoList(l4);
		amazon.insertIntoList(l5);
		amazon.insertIntoList(l6);
		amazon.insertIntoList(l7);
		amazon.insertIntoList(l8);
		
		
		amazon.printAllLaptops(amazon.laptops);
		
		Laptop l = amazon.getLaptop(1);
		System.out.println(l);
		
		l = amazon.getLaptop(50);
		System.out.println(l);
		
		System.out.println("\n\n\n -------- Filter based on Star Rating --------");
		
		List<Laptop>  filteredLaptopList = amazon.getLaptopsByRating(3);
		amazon.printAllLaptops(filteredLaptopList);

		System.out.println("\n\n\n -------- Filter based on Brand Name --------");
		
		filteredLaptopList = amazon.getLaptopsByBrandName("hp");
		amazon.printAllLaptops(filteredLaptopList);
		
		
	}
	
	// called by user to filter out laptops based on star rating
	public List<Laptop> getLaptopsByRating(int ratingFilter) // 3
	{
		List<Laptop> outputList = new ArrayList<>();
		
		for (Laptop laptop : laptops) 
		{
			if(laptop.getStarRating() >= ratingFilter)
			{
				outputList.add(laptop);
			}
		}
		
		return outputList;
	}
	
	// called by user to filter out laptops based on brandName
		public List<Laptop> getLaptopsByBrandName(String brandName) // 3
		{
			List<Laptop> outputList = new ArrayList<>();
			
			for (Laptop laptop : laptops) 
			{
				if(laptop.getBrandName().equalsIgnoreCase(brandName))
				{
					outputList.add(laptop);
				}
			}
			
			return outputList;
		}
	
	// admin of the amazon.com call this function
	public void insertIntoList(Laptop laptop)
	{
		laptops.add(laptop); // this code will be replaced by Db code
	}
	
	// admin and user of the amazon call this function
	public Laptop getLaptop(int searchId)
	{
		Laptop resultLaptop = null;
		
		for (Laptop laptop : laptops) {
			if(laptop.getId() == searchId)
			{
				resultLaptop = laptop;
				break;
			}
		}
		return resultLaptop;
	}
	
	
	// on the search of the laptop (user) call this function
	public void printAllLaptops(List<Laptop> list)
	{
		System.out.println("\n\n ==== Laptops on User Browser/ Mobile Phone[Android or IOS]==========");
		for (Laptop laptop : list) {
			System.out.println(laptop);
			System.out.println("________________________________________________________");
		}
	}
}
