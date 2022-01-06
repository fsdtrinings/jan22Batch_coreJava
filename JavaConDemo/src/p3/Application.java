package p3;

public class Application {

	public static void main(String[] args) {
		
		PrinterDevice hp = new PrinterDevice();
		
		
		StudentThread mike = new StudentThread("mike",hp, "Java-Code");
		
	
		StudentThread neha = new StudentThread("neha",hp, "HTML-Code");
		
		
		StudentThread amith = new StudentThread("amith", hp, "Spring-Code");
		
	
		StudentThread ravi = new StudentThread("unknown",hp, "Python-Code");
		
		
		
	}
}
