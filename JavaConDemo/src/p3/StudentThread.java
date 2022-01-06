package p3;


// user
public class StudentThread implements Runnable{

	String file;
	Thread t ;
	PrinterDevice hpPrinter;
	String username;
	
	public StudentThread(String username, PrinterDevice hpPrinter , String file) {
		this.hpPrinter = hpPrinter;
		this.file = file;
		this.username = username;
		
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		
		hpPrinter.doPrint(username,file);
		
	}
	

}
