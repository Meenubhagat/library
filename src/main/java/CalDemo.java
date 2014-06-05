import java.util.Calendar;


public class CalDemo {

	public static void main(String[] args) {
		   
	      // create a calendar
	      Calendar cal = Calendar.getInstance();
		  
	      // print current date
	      System.out.println("The current date is : " + cal.getTime());

	      // add 20 days to the calendar
	      cal.add(Calendar.DATE, 20);
	      System.out.println("20 days later: " + cal.getTime());
	      

	
	   }
}
