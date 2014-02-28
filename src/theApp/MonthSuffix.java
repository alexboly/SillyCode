package theApp;

import java.util.Calendar;

/**
 * From http://thedailywtf.com/Articles/Remember,-Remember-the-ThirtyThird-of-November.aspx, http://www.javacodegeeks.com/2011/07/funny-source-code-comments.html
 * @author unknown
 *
 */

//When I wrote this, only God and I understood what I was doing
//Now, God only knows
public class MonthSuffix {

	public String get(){
		String num = "th";

		int day = Integer.parseInt(new Integer(Calendar.getInstance().get(Calendar.DATE)).toString());
		switch(day)
		{
		    case 1:
		        num = "st";
		        break;
		    case 21:
		        num = "st";
		        break;
		    case 31:
		        num = "st";
		        break;
		    case 2:
		        num = "nd";
		        break;
		    case 22:
		        num = "nd";
		        break;
		    case 3:
		        num = "rd";
		        break;
		    case 33:
		        num = "rd";
		        break;
		    default:
		        num = "th";
		        break;
		}
		
		return num;
	}
}
