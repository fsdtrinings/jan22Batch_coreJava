package p1;

// business object 
public class Laptop {
	
	private int id;
	private String brandName;
	private int price;
	private int starRating;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(int id, String brandName, int price, int starRating) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.price = price;
		this.starRating = starRating;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStarRating() {
		return starRating;
	}
	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brandName=" + brandName + ", price=" + price + ", starRating=" + starRating
				+ "]";
	}

	@Override
	public int hashCode() {
		System.out.println(" hashcode method called for "+brandName+"- "+id);
		return id+price+starRating+brandName.length();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(" equals method called for "+brandName+"- "+id);
		if(obj instanceof Laptop)
		{
			Laptop tempLaptop = (Laptop) obj;
			
			boolean a = (this.id == tempLaptop.id);
			boolean b = (this.brandName.equals(tempLaptop.brandName));
			boolean c = (this.price == tempLaptop.price);
			boolean d = (this.starRating == tempLaptop.starRating);
			
			return a&&b&&c&&d;
		}
		else return false;
	}
	
	 

}
