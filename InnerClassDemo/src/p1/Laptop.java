package p1;

public class Laptop {
	
	public void doOnlineWrok(Internet internet)
	{
		int speed = internet.netSpeed();
		if(speed>800)
		{
			System.out.println(" Can Attend Online Meeting "+speed);
		}
		else
		{
			System.out.println("Speed is low cannot attend Online Meeting "+speed);
		}
		
	}
	
	
	public void doCodingInSTS()
	{
		
		
	}

}
