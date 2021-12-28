package p2;

public class Employee {

	private int id = 0;
	private String name = "no name";
	private String designation = "";
	private int salary = 0;
	
	Employee()
	{
		System.out.println("Employee Constructor");
		id = 1;
		name = "Ramesh";
		designation = "associate";
		salary = 2000;
	}
	Employee(int empId,String empName,String empDesignation,int empSalary)
	{
		System.out.println("Employee Constructor 2 ");
		id = empId;
		name = empName;
		designation = empDesignation;
		salary = empSalary;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
}//end class
