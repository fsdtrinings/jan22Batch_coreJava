package p2;


// Server code
public class QuizApp {
	
	QuizDBCode dbConnection = new QuizDBCode();
	
	public String[] getQuestionsFromDB()
	{
		// write code to verify user , user security code , session handling 
		// get connection with DB 
		// execute DB query 
		// collect results from DB 
		// deliver result to user 
		 return dbConnection.getQuestions();
	}
	
	
	public String[][] getOptionsFromDB()
	{
		return dbConnection.getOptions();
	}
	
	
	// Business Operation / Business Logic
	public float processUserSubmission(int[] userAnswers)
	{
		float userPoint = 0;
		int dbAnswers[] = dbConnection.getCorrectAnswer();
		
		for(int i = 0;i<dbAnswers.length;i++)
		{
			if(dbAnswers[i] == userAnswers[i]) userPoint += 1.0f;
			else userPoint -= 0.5f;
		}
			
		return userPoint;
	}

}
