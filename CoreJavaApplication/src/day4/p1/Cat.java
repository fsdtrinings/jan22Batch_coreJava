package day4.p1;

public class Cat extends Animal {
	Cat(int energy)
	{
		super(energy);
		System.out.println("Cat Constructor");
	}
	
	public void doHunt()
	{
		if(super.energy>30)
		{
			System.out.println((super.energy--)+" Cat doHunt called Current Value "+(super.energy));
			super.userPoint+= 10;
		}
		else
		{
			doEat();
		}
		
	}
}
