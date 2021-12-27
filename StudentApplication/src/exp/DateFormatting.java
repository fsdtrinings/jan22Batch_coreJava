package exp;

public class DateFormatting {

	public String getFormattedDate(int date)
	{
		
		if(date >= 0 && date <= 31)
		{
			String suffix = "";
			switch(date)
			{
				case 1:
				case 21:
				case 31:
					suffix = "st";
					break;
				case 2:
				case 22:
					suffix = "nd";
					break;
				case 3:
				case 23:
					suffix = "rd";
					break;
				default:
					suffix = "th";
					break;
						
			}
			
			return date+""+suffix;
			
			
		}
		else
		{
			return date+" is not valid date";
		}
			
		
	}
}
