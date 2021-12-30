package day5;

public abstract class ElectronicsDevice {

	protected CircuitBoard circuitBoard; // has-a
	
		
	public abstract void switchOn();
	public abstract void switchOff();
	
	public int consumePower()  // act like as default method for consuming power
	{
		return 10;
	}
	
}
