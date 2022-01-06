package p1;

public class ThreadingDemo {

	public static void main(String[] args) {
		
		
		MathThread task1 = new MathThread(10, 20);
		task1.start();
		
	
		MathThread task2 = new MathThread(99, 89);
		task2.start();
		
		
		
	}
}
