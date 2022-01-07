package p1;

public class LambdaDemo {

	public static void main(String[] args) {
		lambda_Approach1();

	}
	
	public static void lambda_Approach1()
	{
		Laptop hp = new Laptop();
		/*
		Internet i = new Internet {
			
			@Override
			public int netSpeed() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		*/
		
		Internet i = ()->{
			return 200;
		};
		
		hp.doOnlineWrok(i);
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
