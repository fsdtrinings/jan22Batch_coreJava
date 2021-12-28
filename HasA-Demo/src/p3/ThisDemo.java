package p3;



public class ThisDemo {

	public static void main(String[] args) {
		
		MyClass obj1 = new MyClass(12,12,"Hello");
		System.out.println(obj1);
		obj1.doThings();
		
		MyClass obj2 = new MyClass(1000,1200,"Capg");
		obj2.doThings();
		
	}
}
