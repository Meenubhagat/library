import java.util.Calendar;


public class CalDemo {

	public static void main(String[] args) {
		
		// Creates two calendars instances
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        // Set the date for both of the calendar instance
        cal1.set(2006, 12, 30);
        cal2.set(2007, 5, 3);

        // Get the represented date in milliseconds
        long milis1 = cal1.getTimeInMillis();
        long milis2 = cal2.getTimeInMillis();
        
        // Calculate difference in milliseconds
        long diff = milis2 - milis1;
        
        // Calculate difference in days
        long diffDays = diff / (24 * 60 * 60 * 1000);
        
        System.out.println("In milliseconds: " + diff + " milliseconds.");
        System.out.println("In days: " + diffDays + " days.");
		   
		}

	  }
	

