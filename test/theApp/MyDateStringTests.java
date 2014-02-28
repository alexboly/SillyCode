package theApp;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Ignore;
import org.junit.Test;

public class MyDateStringTests {

	// If I from the future read this I’ll back in time and kill myself.
	@Test
	@Ignore()
	public void T22() {
		long yyyymmddhhmmss = MyDateString.getDateString(Calendar.getInstance()
				.getTimeInMillis());
		String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", yyyymmddhhmmss);
		// It worked the first time I ran it, but I don't know why it doesn't work anymore
		assertEquals("20140228201800", yyyymmddhhmmss);
	}
}
