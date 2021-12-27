package p2;

// bean class, POJO (plain old java object)

public class Student {
	
	// #1
	private String studentName;
	private int rollNumber;
	private int totalMarks;
	private int javaMarks;
	private int ngMarks;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks() {
		totalMarks = javaMarks+ngMarks;
	}
	public int getJavaMarks() {
		return javaMarks;
	}
	public void setJavaMarks(int javaMarks) {
		this.javaMarks = javaMarks;
	}
	public int getNgMarks() {
		return ngMarks;
	}
	public void setNgMarks(int ngMarks) {
		this.ngMarks = ngMarks;
	}
	
	

}
