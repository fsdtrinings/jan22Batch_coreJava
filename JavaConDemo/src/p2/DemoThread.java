package p2;


//Runnable object / target object
// bcoz this class implements Runnable
public class DemoThread implements Runnable 
{
	Thread t;
	public DemoThread() {
	
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		System.out.println("inside run");
	}
	
	

}
