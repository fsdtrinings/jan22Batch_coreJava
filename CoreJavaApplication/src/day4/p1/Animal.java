package day4.p1;

public class Animal {
	
	protected static int userPoint = 0;
	protected static int energy = 0;
	private int eyes;
	private int legs;
	
	Animal(int energy)
	{
		this.energy = energy;
	}
	public void doEat()
	{
		energy++;
		//System.out.println("Animal Class DoEat Method called "+energy);
	}
	public int getUserPoint() {
		return userPoint;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	
	

}
