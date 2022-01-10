package p2;

public class QuizDBCode {
	
	// replace with database table
	public static String questions[];
	public static String options[][];
	public static int correctAnswer[];

	// replace with Db creation
	static
	{
		questions = new String[]
				 {"1.Who is the Current Prime Minister of India",
				   "2.Who Invented Computer",
				   "3.Which is the longest written Constitution in the world",
				   "4.Who is the father of our nation"};
		
		options=new String[][] 
				{
			       {"1.Narendra Modi","2.Indira Gandhi","3.Manmohan Singh","4.Wajpayee"},
			       {"1.Charles Babage","2.Newton","3.james Gosling","4.Denis Riche"},
			       {"1.America","2.India","3.Korea","4.China"},
			       {"1.Jawaharlal Nehru","2.Mahatma Gandhi","3.DR.Ambedkar","4.Swami Vivekananda"}
			    };
			    
	    correctAnswer=new int[] {1,1,2,2};
	}

	public static String[] getQuestions() {
		return questions;
	}

	public static void setQuestions(String[] questions) {
		QuizDBCode.questions = questions;
	}

	public static String[][] getOptions() {
		return options;
	}

	public static void setOptions(String[][] options) {
		QuizDBCode.options = options;
	}

	public static int[] getCorrectAnswer() {
		return correctAnswer;
	}

	public static void setCorrectAnswer(int[] correctAnswer) {
		QuizDBCode.correctAnswer = correctAnswer;
	}


	
	

}
