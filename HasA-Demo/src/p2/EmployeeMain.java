package p2;

public class EmployeeMain {

	public static void main(String[] args) {
		
		// calling of default constructor
		Employee e1 = new Employee();
		System.out.println(e1);
		
		// calling of parameterized constructor
		Employee e2 = new Employee(101,"Amit","Sales-Executive",5000);
		System.out.println(e2);
		
		
	}
}//end class
