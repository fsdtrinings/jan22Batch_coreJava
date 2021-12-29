package day4.p1;

import java.util.Scanner;

public class AnimalKindomApp2 {
	public static void main(String[] args) {
		AnimalKindomApp2 gameApp = new AnimalKindomApp2();

		while(true)
		{
			Animal a = gameApp.selectAnimal(); // dog
			// Animal a = new Dog() or new Cat();
			System.out.println("\n\n====>>  user Point before Game Start  "+a.getUserPoint());
			a.doEat();
			System.out.println(" Energy before play Games "+a.getEnergy()); // 17
			gameApp.userPlayGame(a);
		}//end of while
		

	}

	public Animal selectAnimal() {
		

			System.out.println(" === Animal Options on the Home Page ====");
			System.out.println("1. Dog");
			System.out.println("2. Cat");
			System.out.println("0. EXIT");

			switch (new Scanner(System.in).nextInt()) {
			case 1:
				return new Dog(16);
			case 2:
				return new Cat(10);
			case 0: System.exit(0);
			}
		return null;
	
	}

	public void userPlayGame(Animal a) {
		
		System.out.println(" Energy Level of the Animal inside userPlayGames() " + a.getEnergy());//17
		
		if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.doEat();d.doEat();d.doEat();d.doEat();d.doEat();d.doEat();
			System.out.println(" Energy of Dog , after typecasting "+a.getEnergy()); // 23
			
			d.doPlayGames();
			d.doPlayGames();
		}
		if(a instanceof Cat)
		{
			Cat cat = (Cat)a;
			for(int i=0;i<35;i++)
			{
				cat.doEat();
			}
			
			System.out.println(" Energy of Cat , after typecasting "+a.getEnergy()); // 23
			cat.doHunt();
			
		}
		
		
		
		System.out.println("\n\n====>> user Point  "+a.getUserPoint()); 
		

	}
}
