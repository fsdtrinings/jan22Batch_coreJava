package p1;

public class StudentApp {

	public static void main(String[] args) {
		
		Student s1 = new Student(); 
		
		s1.name = "Ramesh";
		s1.rollNumber = 101;
		s1.javaMarks = 30;
		s1.angularMarks = 40;
		
		
		Student s2 = new Student();
		s2.name = "Amit";
		s2.rollNumber = 102;
		s2.javaMarks = 80;
		s2.angularMarks = 40;
		
		System.out.println(" =========== Student 1 =========");
		s1.viewTotalMarkSheet();
		System.out.println(" =========== Student 2 =========");
		s2.viewTotalMarkSheet();
		
		
	}
}
