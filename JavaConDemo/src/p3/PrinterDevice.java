package p3;

import java.time.LocalDate;
import java.time.LocalDateTime;

// resource
public class PrinterDevice {
	
	
	// approach 1 - method level 
	// public synchronized void doPrint(String file)
	public void doPrint(String username , String file)
	{
		boolean isValidUser = true;
		String status = "Rejected "+LocalDateTime.now();
		System.out.println(" Auth - 1");
		System.out.println(" Auth - 2");
		System.out.println(" Auth - 3");
						
		if(username.equals("unknown"))
		{
			isValidUser = false;
		}
		
		
		// approach - 2
		synchronized (this) 
		{
			if(isValidUser == true)
			{
				System.out.println("[ ");

				try {
					Thread.sleep(250);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println(file);
			
				System.out.println("]");
				status = "print complete "+LocalDateTime.now();

			}
					
			
			System.out.println("Reallocation resource ");
			
		}// end of synch.. code
		
		System.out.println("logging file "+username+" - "+status);
	}

}
