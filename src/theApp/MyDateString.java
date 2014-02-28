package theApp;

import java.util.Calendar;

/**
 * From http://thedailywtf.com/Articles/Date-Formatting-Done-Right.aspx, http://www.javacodegeeks.com/2011/07/funny-source-code-comments.html
 * 
 * @author unknown
 */
class MyDateString {
	private static Calendar cal = Calendar.getInstance();

	// Creates the date string
	public MyDateString() {
	}

	// Gets the date string from the time
	// drunk, fix later
	public static final long getDateString(long currtime) {
		long rv = (currtime % 1000L);
		
		try {
			if (currtime < 1000000)
				return -1L;
			cal.setTimeInMillis(currtime);
			rv += 1000L * ((long) cal.get(Calendar.SECOND));
			rv += 100000L * ((long) cal.get(Calendar.MINUTE));
			rv += 10000000L * ((long) cal.get(Calendar.HOUR_OF_DAY));
			rv += 1000000000L * ((long) cal.get(Calendar.DAY_OF_MONTH));
			rv += 100000000000L * ((long) (1 + cal.get(Calendar.MONTH)));
			rv += 10000000000000L * ((long) cal.get(Calendar.YEAR));
		} catch (Exception exc) {
			RuntimeException up = new RuntimeException(
					"Something is really wrong.");
			throw up; // ha ha
		}

		return rv;
	}
}
