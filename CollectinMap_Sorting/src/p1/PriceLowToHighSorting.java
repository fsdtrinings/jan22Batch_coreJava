package p1;

import java.util.Comparator;

public class PriceLowToHighSorting implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		return o1.getPrice() - o2.getPrice();
	}

	
}
