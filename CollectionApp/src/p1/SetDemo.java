package p1;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		
		Set<Integer> abc = new TreeSet<>();
		
		abc.add(15);
		abc.add(105);
		abc.add(215);
		abc.add(2);
		abc.add(1);
		abc.add(10);
		
		System.out.println(abc.size());
		System.out.println(abc);
	}
}
