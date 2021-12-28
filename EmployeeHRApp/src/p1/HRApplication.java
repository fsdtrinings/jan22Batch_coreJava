package p1;

import java.util.Scanner;

// front end for HR , will replace with Web front layer or mobile front end

public class HRApplication {
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	static EmployeeOperations empOperations = new EmployeeOperations();
	
	
	
	public static void main(String[] args) {
		
		
		HRApplication app = new HRApplication();
		
		while(true)
		{
			System.out.println("\n\n\n ========== HR Application =========");
			System.out.println("1. Insert Employee ");
			System.out.println("2. Search Employee By ID");
			System.out.println("3. Search Employee By Salary Range");
			System.out.println("4. Search  Employee By Project Name");
			System.out.println("5. View All Employees");
			System.out.println("0. EXIT ");
			
			System.out.println("Enter ur choice ");
			int choice = app.sc.nextInt();
			System.out.println("\n\n");
			switch (choice) {
			case 1:
				app.doInsert();
				break;

			case 2: 
				app.doSearchById();
				break;
			case 4:
				app.doSearchByProject();
				break;
			case 5:
				int count = empOperations.getCount(); 
				Employee arr[] = empOperations.getArr();
				app.displayAllEmployees(count,arr);
				break;
				
			case 0:
				System.out.println("\n\n EXIT ");
				System.exit(0);
				break;
				
			default:
				break;
			}//end case
			
			
			
		}//end while
		
	}//end main
	
	public void doInsert()
	{
		System.out.println("Enter Employee Id ");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name ");
		String name = scStr.nextLine();
		System.out.println("Enter Employee Salary ");
		int salary = sc.nextInt();
		System.out.println("Enter Project Name ");
		String projectName = scStr.nextLine();
		
		
		empOperations.insertEmployee(id,salary,name,projectName);
		
	}
	
	public void doSearchById()
	{
		System.out.println("Enter Employee Id ");
		int id = sc.nextInt();
		
		Employee e = empOperations.getEmployeeById(id);
		if(e!=null)
		{
			System.out.println(" Employee Details ");
			printEmployee(e);
			System.out.println("\n____________________________________________________________________________\n");
		}
		else
		{
			System.out.println(id+" Emloyee not available!!! ");
		}
	}
	
	public void doSearchByProject()
	{
		System.out.println("Enter Project Name ");
		String projectName = scStr.nextLine();
		
		
		
		Employee arr[] = empOperations.getAllEmployeebasedOnProject(projectName);
		//System.out.println("2 ----------->> inside HR App "+arr.length);
		int count = empOperations.getTempPos1();
		//System.out.println(" 4 ----------->> count :- "+count);
		
		displayAllEmployees(count, arr);
		
	}
	
	public void displayAllEmployees(int count,Employee arr[])
	{
		
		
		for(int i = 0;i<count;i++)
		{
			printEmployee(arr[i]);
			System.out.println("______________________________________________________________");
		}
	}
	
	public void printEmployee(Employee e)
	{
		System.out.println(e);
	}
}//end class

















