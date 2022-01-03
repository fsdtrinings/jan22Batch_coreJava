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
	
	 

}
