package p2;

import java.util.Scanner;

public class QuizUser {
	
	private String username = "Ramesh Kumar";
	private float points = 0;
	
	QuizApp quizServer = new QuizApp();
	private int userAnswers[];
	public void playGame()
	{
		// call to server to load question
		String questions[] = quizServer.getQuestionsFromDB();
		String options[][] = quizServer.getOptionsFromDB();
		// write code to put the questions and options in user cookies
		
		userAnswers = new int[questions.length];
		int questionNumber = 0;
		for (String question : questions) {
			
			System.out.println((questionNumber+1)+"  "+question);
			System.out.println(options[questionNumber][0]);
			System.out.println(options[questionNumber][1]);
			System.out.println(options[questionNumber][2]);
			System.out.println(options[questionNumber][3]);
			
			System.out.println("\n\n Enter Answer ");
			userAnswers[questionNumber] = new Scanner(System.in).nextInt();
			questionNumber++;
		}
		
		System.out.println(" Submitting User reply ");
		float points = quizServer.processUserSubmission(userAnswers);
		System.out.println(username+" Points "+points);
	}
	
	public static void main(String[] args) {
		QuizUser loginUser = new QuizUser(); // login
		loginUser.playGame();
		
	}

}
