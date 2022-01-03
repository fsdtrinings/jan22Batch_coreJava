package p3set;

import java.util.HashSet;

import p1.Laptop;

public class SetDemo {
	
	public static void main(String[] args) {
		
		
		HashSet<Laptop> set = new HashSet<>();
		
		Laptop l1 = new Laptop(1, "Dell", 1500, 2);
		Laptop l2 = new Laptop(2, "HP", 1500, 1);
		Laptop l3 = new Laptop(3, "Apple", 4500, 1);
		Laptop l4 = new Laptop(2, "ZP", 1500, 1);
		
		Laptop l5 = new Laptop(1, "Dell", 1500, 2);
		Laptop l6 = l2;
		
		set.add(l1);
		set.add(l2);
		set.add(l3);
		set.add(l4);
		set.add(l5);
		set.add(l6);

		
		
		for (Laptop laptop : set) {
			System.out.println(laptop);
		}
		
		System.out.println(set.size());
	}

}
