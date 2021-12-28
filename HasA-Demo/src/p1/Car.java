package p1;

public class Car {
	
	private String carName;
	private String brandName;
	private String carNumber;
	private String color;
	
	private Engine e;
	private MusicSystem ms;
	
	Car(){
		
	}
	
	Car(Engine engine,String carColor,String name)
	{
		e = engine;
		color = carColor;
		carName = name;
		
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public MusicSystem getMs() {
		return ms;
	}
	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}
	@Override
	public String toString() {
		return "Car Name "+" - "+carName+"\n"
				+"Car Color - "+color+"\n"
				+"Engine - "+e;
	}
	
	
	

}
