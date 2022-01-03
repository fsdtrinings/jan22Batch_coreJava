package p1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(15);
		//list.add("fedf");
		list.add(19);
		
		MainClass obj = new MainClass();
		obj.doThings(list);
		
	}
	public void doThings(List list)
	{
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
