package p2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		//basicStreamDemo();
		//taskMinMax();
		//empTask1();
		filterEmpTask2();
	}//end main
	
	
	public static void basicStreamDemo()
	{
		List<Integer> list =  Arrays.asList(15,18,92,60,30);
		list.stream();
		
		// --- based on conventional approach 
		Stream.of(48,92,20).forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
			
		});
		
		// --- same code through lambda
		
		Stream.of(48,92,20).forEach((t)->System.out.println(t));
		
		
	}
	
	public static void taskMinMax()
	{
		Stream<Integer> stream = Stream.of(48,91,60,0,36,-77);
		
		// min or max
		
		// min or max is the intermediate operation
		// get is the terminal operation
		int minValue = stream.min((x,y)->x.compareTo(y)).get();
		System.out.println(minValue);
		// a) ----  implement MAX operation
		
		
		// b) count operation
		
		
		Stream<Integer> stream2 = Stream.of(48,91,60,0,36,-77);
		List<Integer> abc = stream2.collect(Collectors.toList());
		
		
		Stream<Integer> stream3 = Stream.of(48,91,60,0,36,-77);
		
		// approach 1
		/*
		List<Integer> newList = stream3.filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if(t<50) return true;
				else return false;
			}
			
		}).collect(Collectors.toList());
		*/
		
		List<Integer> newList = stream3.filter((t)->{
			if(t<50) return true;
			else return false;
		}).collect(Collectors.toList());
		System.out.println("\n\nNew List \n"+newList);
	}

	
	public static void empTask1()
	{
		Employee e1 = new Employee(1,"A",2000,45);
		Employee e2 = new Employee(2,"B",3000,18);
		Employee e3 = new Employee(3,"C",5000,23);
		Employee e4 = new Employee(4,"D",7000,30);
		Employee e5 = new Employee(5,"E",1000,48);
		Employee e6 = new Employee(6,"F",800,22);
		Employee e7 = new Employee(7,"G",1900,27);
		
		//Arrays.asList(15,18,92,60,30);
		
		
		
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
		// approach 1 :- creation of saperate class MinSalaryComparator
		Employee lowestSalaryEmp1 = empList.stream().min(new MinSalaryComparator()).get();
		System.out.println(lowestSalaryEmp1);
		
		// approach 2 - using Comparator operation through lambda operation
		
		// step 1
		
		Comparator<Employee> lamdaComparatorCode = (o1,o2)->{
			return o1.getSalary() - o2.getSalary();
		};
		
		
		Employee lowestSalaryEmp2 = empList.stream().min(lamdaComparatorCode).get();
		System.out.println(lowestSalaryEmp2);
		
		
		
	}
	
	
	public static void filterEmpTask2()
	{
		
		Employee e1 = new Employee(1,"A",2000,45);
		Employee e2 = new Employee(2,"B",3000,18);
		Employee e3 = new Employee(3,"C",5000,23);
		Employee e4 = new Employee(4,"D",7000,30);
		Employee e5 = new Employee(5,"E",1000,48);
		Employee e6 = new Employee(6,"F",800,22);
		Employee e7 = new Employee(7,"G",1900,27);
		
		//Arrays.asList(15,18,92,60,30);
		
		
		
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
		List<Employee> filteredList =empList.stream().filter((emp)->{
			if(emp.getSalary()>1500 && emp.getSalary()<4000)
			{
				return true;
			}
			else return false;
		}).collect(Collectors.toList());
		
		for (Employee employee : filteredList) {
			System.out.println(employee);
		}
		
	}
	
	
	public static void mapDemoForEmp()
	{
		// increase the salary by 10% where age in b/w 20-30 years
	}
}//end class














