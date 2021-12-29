package day4.p1;

public class Dog extends Animal{

	String dogCollar = "Black";
	Dog(int energy)
	{
		super(energy);
	}
	
	
	public void doPlayGames()
	{
		if(energy>20) {
			System.out.println((super.energy--)+" Dog play Games code exe... current energy "+super.energy);
			super.userPoint += 2;
		}
		else
		{
			System.out.println(" Dog Cannot Play Game , Bcoz energy is less than 20, current enegry level is :- "+super.energy);
		}
		
	}
}
