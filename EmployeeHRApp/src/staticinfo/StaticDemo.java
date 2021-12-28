package staticinfo;

public class StaticDemo {
	int i = 10;
	
	static{
		System.out.println("Hello from Static Block ");
	}
	StaticDemo()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		StaticDemo obj = new StaticDemo();
		
		
	
		obj.doAbc();
	}

	public void doAbc()
	{
		
	}
}
