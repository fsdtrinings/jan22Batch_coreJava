package p1;

public class MyCarGame {

	public static void main(String[] args) {
		
		// ---- approach 1 without constructor object 
		
		// creation of object with default
		Car hondaCar = new Car();
		
		// step 2: providing relevant(initial) values or updating new value
		hondaCar.setBrandName("Honda");
		hondaCar.setCarName("Honda-Civic");
		hondaCar.setCarNumber("ABC-123");
		hondaCar.setColor("Black");
		Engine e = new Engine();
		e.setPower(1200);
		
		hondaCar.setE(e);

		MusicSystem abc = new MusicSystem();
		abc.setBrandName("Sony");
		hondaCar.setMs(abc);
		
		System.out.println(hondaCar);
		
		
		// ---- approach 2 with constructor object 
	
		Engine e3 = new Engine();
		e3.setPower(1200);
	    Car suzukiCar = new Car(e3,"White","Maruti-Swift");
	    suzukiCar.setCarName("vdf3453");
	    MusicSystem poineer = new MusicSystem();
	    suzukiCar.setMs(poineer);
	    
	    System.out.println(suzukiCar);
	
	
	}
}
