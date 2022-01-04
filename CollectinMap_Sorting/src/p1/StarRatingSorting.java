package p1;

import java.util.Comparator;

public class StarRatingSorting implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		return o2.getStarRating() - o1.getStarRating();
	}
	
}
