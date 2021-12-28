package p1;


// class at server end  will replace by Spring framework

public class EmployeeOperations {
	
	Employee arr[] = new Employee[10000];// replace by Database
	int count = 0; // holds the value of inserted employees
	
	int tempPos1 = 0; // holds value of same project employee count
	
	public boolean insertEmployee(int id,int salary,String name,String projectName)
	{
		boolean isInserted = false;
		// create employee object 
		
		Project p = new Project(projectName);
		Employee e = new Employee(id, name, salary, p);
		
		// insert into array's index(count)
		arr[count] = e;
		count++; // 1 employee inserted
		isInserted = true; // replace with database status 
		return isInserted;
		
	}

	public Employee[] getAllEmployeebasedOnProject(String searchProjectName)
	{
	
		Employee temparr[] = new Employee[count];// will replace with collections
		
		
		for(int i = 0;i<count;i++)
		{
			if(arr[i].getProject().getProjectName().equalsIgnoreCase(searchProjectName))
			{
				temparr[tempPos1++] = arr[i]; 
			}
		}
		//System.out.println("----------->>"+temparr.length);
		return temparr;
	}
	
	
	
	public int getTempPos1() {
		//System.out.println("3 --------------->> temppos "+tempPos1);
		return tempPos1;
	}

	public Employee getAllEmployeeBySalaryRange(int range1,int range2)
	{
		
		return null;
	}
	
	public Employee getEmployeeById(int searchId)
	{
		for(int i = 0;i<count;i++)
		{
			if(arr[i].getId() == searchId)
			{
				return arr[i]; 
			}
		}
		
		return null;
	}
	
	public boolean updateSalary(int id,int newSalary)
	{
		
		return false;
	}
	
	
	
	public Employee[] getArr() {
		return arr;
	}

	public void setArr(Employee[] arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	

}//end class

