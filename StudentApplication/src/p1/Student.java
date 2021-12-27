package p1;

public class Student {
	
	String name;
	int rollNumber;
	int javaMarks;
	int angularMarks;
	
	public void printJavaMarks()
	{
		System.out.println("Java Marks :- "+javaMarks);
	}
	
	public void displayAngularMarks()
	{
		System.out.println("Angular Marks :- "+angularMarks);
	}
	
	public void viewTotalMarkSheet()
	{
		System.out.println(" 1) Java Marks :\t "+javaMarks);
		System.out.println(" 2) Angular Marks :\t "+angularMarks);
		System.out.println(" ===================================================");
		System.out.println("  Total Marks :\t "+(javaMarks+angularMarks));
		
	}
	public void changeJavaMarks(int newJavaMarks)
	{
		javaMarks = newJavaMarks;
	}
	public void editNgMarks(int newNgMarks)
	{
		angularMarks = newNgMarks;
	}

}
