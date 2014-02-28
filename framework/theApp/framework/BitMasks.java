package theApp.framework;

//I am not responsible of this code.
//They made me write it, against my will.

/** 
 * From http://thedailywtf.com/Articles/A-Bit-Misguided.aspx and http://www.javacodegeeks.com/2011/07/funny-source-code-comments.html
 * @author unknown
 *
 */
public class BitMasks {
	public void bitMask(int inputInt) {
		int[] rules = new int[8];
		if (inputInt == 0) {
			rules[0] = 0;
			rules[1] = 0;
			rules[2] = 0;
			rules[3] = 0;
			rules[4] = 0;
			rules[5] = 0;
			rules[6] = 0;
			rules[7] = 0;
		} else if (inputInt == 1) {
			rules[0] = 0;
			rules[1] = 0;
			rules[2] = 0;
			rules[3] = 0;
			rules[4] = 0;
			rules[5] = 0;
			rules[6] = 0;
			rules[7] = 1;
		} else if (inputInt == 2) {
			rules[0] = 0;
			rules[1] = 0;
			rules[2] = 0;
			rules[3] = 0;
			rules[4] = 0;
			rules[5] = 0;
			rules[6] = 1;
			rules[7] = 0;
		} /* SNIP */
		else if (inputInt == 255) {
			rules[0] = 1;
			rules[1] = 1;
			rules[2] = 1;
			rules[3] = 1;
			rules[4] = 1;
			rules[5] = 1;
			rules[6] = 1;
			rules[7] = 1;
		}
	}
}
