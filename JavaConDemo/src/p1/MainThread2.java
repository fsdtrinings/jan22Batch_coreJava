package p1;

public class MainThread2 {

	public static void main(String[] args) {
		
		Thread.currentThread().setName("MainThread");
		
		
		SimpleThread t2 = new SimpleThread();
		t2.setName("Thread-2");
		t2.start();
		
		SimpleThread t3 = new SimpleThread();
		t3.setName("Thread-3");
		t3.start();
		
		
		mainThreadTask();
	}
	
	public static void mainThreadTask()
	{
		String name = Thread.currentThread().getName();
		
		for(int i = 0;i<10;i++)
		{
			System.out.println(i+" - "+name);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
