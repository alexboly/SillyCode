package theApp;

import java.util.Calendar;

/**
 * From http://www.javacodegeeks.com/2011/07/funny-source-code-comments.html
 * @author unknown
 *
 */

//If this code works, it was written by Paul. If not, I don’t know who wrote it
public class TheApp {

	public static void main(String[] args) {

		try {
			long yyyymmddhhmmss = MyDateString.getDateString(Calendar
					.getInstance().getTimeInMillis());

			System.out.println(String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS",
					yyyymmddhhmmss));
		} 
//		catch (SQLException ex) {
//			// Basically, without saying too much, you’re screwed. Royally and
//			// totally.
//		} 
		catch (Exception ex) {
			// If you thought you were screwed before, boy have I news for
			// you!!!
		}
	}
}
