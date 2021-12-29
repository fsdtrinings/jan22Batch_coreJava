package day4.p1;


// bug in the app , user point not maintaining .... 
// multiple Child animal object would create
public class Bug_AnimalKingdomApp {

	public static void main(String[] args) {
		
		int dogInitialEnergy = 15;
		Dog d = new Dog(dogInitialEnergy);
		d.doEat();
		for(int i=0;i<50;i++)
		{
			d.doEat();
		}
		d.doPlayGames();
		d.doPlayGames();
		d.doPlayGames();
		
		System.out.println("User Point (With Dog ):- "+d.userPoint);
		Cat cat = new Cat(10);
		cat.doEat();
		cat.doHunt();
		System.out.println("User Point (With Cat):- "+cat.userPoint);
		System.out.println("\n\n\n\n");
	}
	
	
	
	
	public Animal selectAnimal()
	{
		
		return null;
	}

	
	public void playGame(Animal a)
	{
		
		
	}
}
