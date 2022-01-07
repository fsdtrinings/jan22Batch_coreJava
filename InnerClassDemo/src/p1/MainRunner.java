package p1;

public class MainRunner {
	
	public static void main(String[] args) {
		
		approach1();
		System.out.println("--------------------------");
		approach2_anonymousClass();
		
	}
	
	public static void approach1()
	{
		Internet internet = new MobileHotspot();
		Laptop dell = new Laptop();
		dell.doOnlineWrok(internet);
	}
	
	public static void approach2_anonymousClass()
	{
		Laptop hp = new Laptop();
		hp.doOnlineWrok(new Internet() {
			
			@Override
			public int netSpeed() {
				
				return 900;
			}
		});
		
		
	}

}
