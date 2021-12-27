package exp;

public class DateApp {

	public static void main(String[] args) {
		
		DateFormatting formatting  = new DateFormatting();
		
		String formattedDate = formatting.getFormattedDate(14);
		System.out.println(formattedDate);
		
		formattedDate = formatting.getFormattedDate(10);
		System.out.println(formattedDate);
		
		formattedDate = formatting.getFormattedDate(1);
		System.out.println(formattedDate);
		
		formattedDate = formatting.getFormattedDate(140);
		System.out.println(formattedDate);
		
		
	}
}
