package p1;

public class Demo1 {
	
	String str = "";
	public static void main(String[] args) {
		
		Demo1 obj1 = new Demo1();
		System.out.println("1");
		
		try
		{
			//obj1.doInsert();
			obj1.getSubString();
			System.out.println(obj1.str);
			
		}
		catch(Exception e)
		{
			System.out.println("code inside exception "+e);
		}
		finally
		{
			System.out.println("system re-allocation code");
		}
		System.out.println("2");
	}
	
	public void doInsert()
	{
		str = "Ramesh Kumar";
	}
	
	public void getSubString()
	{
		str = str.substring(2,7);
	}

}
