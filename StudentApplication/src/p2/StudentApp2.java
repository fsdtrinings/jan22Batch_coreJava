package p2;

public class StudentApp2 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setStudentName("Varun");
		s1.setRollNumber(123);
		s1.setJavaMarks(45);
		s1.setNgMarks(78);
		s1.setTotalMarks();
		
		System.out.println(s1.getJavaMarks());
		System.out.println(s1.getNgMarks());
		System.out.println(s1.getTotalMarks());
		
	}
}
