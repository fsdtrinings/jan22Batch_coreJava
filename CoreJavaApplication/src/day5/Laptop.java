package day5;

public class Laptop extends ElectronicsDevice implements Wifi, Bluetooth {

	@Override
	public void switchOn() {
		System.out.println(" Laptop switch On Executes ... Booting process starts");

	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Laptop switch off executes... refresh RAM ");

	}

	@Override
	public String doShareThroughBluetooth(String deviceName) {

		System.out.println(" Data Sharing to "+deviceName+"..");
		for(int i = 0;i<20;i++)
		{
			try {
				System.out.print(".");
				Thread.sleep(30);
			} catch (Exception e) {
			}
			
		}
		
		return "File Shared :-) ";
	}

	@Override
	public boolean getConnection(String wifiName, String password) {

		return (wifiName.equals("MyWIFI") && password.equals("123")) ? true : false;
	}

	@Override
	public int consumePower() {
		return 100;
	}

	public void startSTS() {
		System.out.println(" STS --- Started ");
	}

	public void executeJavaApp() {
		System.out.println(" Java based app executing");
	}

	public void doWebSurffing()
	{
		if(getConnection("MyWIFI", "123"))
		{
			System.out.println(" Executing Google Chrome...");
		}
		else
		{
			System.out.println(" Internet Connection ERROR !!!");
		}
		
	}

	public void bluetoothSharing(String secondDeviceName)
	{
		String fileNameToShare = "MySONG.MP3"; // select file from menu or location
		
		
		System.out.println(" Laptop Bluetooth Connection On ");
		String notificationMsg = doShareThroughBluetooth(secondDeviceName);
		System.out.println(notificationMsg);
	}

}
