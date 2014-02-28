package theApp;

/**
 * From http://thedailywtf.com/Articles/Dont-Wear-Out-Your-Methods.aspx
 * @author unknown
 *
 */
public class BooleanString {
	public static String HumanLogic(Object data) {
	    String result = "No";
	    if (Logic(data))
	    {
	        result = "Yes";
	    }
	    return result;
	}
	
	private static boolean Logic(Object data) {
		if(data == null){
			return false;
		}
		
		if(Boolean.parseBoolean(data.toString())) return true;
		else return false;
	}
}
