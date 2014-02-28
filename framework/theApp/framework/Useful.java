package theApp.framework;

import java.util.Random;

/** 
 * From http://thedailywtf.com/Articles/Coin-Toss-of-Doom.aspx and http://www.javacodegeeks.com/2011/07/funny-source-code-comments.html
 * @author unknown
 *
 */

public class Useful {
	// TODO make this work
	public void usefulStuff() throws Exception {
		Random r = new Random();
		int flip = r.nextInt(3);
		if (flip % 2 == 0) {
			return;
		} else {
			throw new Exception("Declined.");
		}
	}
}
