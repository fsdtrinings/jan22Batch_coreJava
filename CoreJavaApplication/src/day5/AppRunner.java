package day5;

public class AppRunner {

	public static void main(String[] args) {
		
		AppRunner obj = new AppRunner();
		
		ElectronicsDevice device = obj.selectApplicationFromMenu();
		obj.testDevice(device);
		
	}
	
	public ElectronicsDevice selectApplicationFromMenu()
	{
		// -- menu based application 
		System.out.println(" ");
		
		return new Laptop(); // return an electronicDevice
	}
	
	public void testDevice(ElectronicsDevice device)
	{
		device.switchOn();
		
		System.out.println(" check power consumption :- "+device.consumePower());
		
		if(device instanceof Laptop)
		{
			Laptop dell = (Laptop) device;
			
			dell.executeJavaApp();
			dell.doWebSurffing();
			dell.startSTS();
			dell.doShareThroughBluetooth("MyNewMobilePhone123");
		}
		
		
		device.switchOff();
	}
	
	
}
