package p1;

import java.util.Iterator;

public class SimpleThread extends Thread
{

	@Override
	public void run() {
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
