package theApp;

import theApp.framework.StringUtil;

/**
 * From http://thedailywtf.com/Articles/Stringing-a-Replacement.aspx
 * @author unknown
 *
 */
public class FunctionLibrary {

	public static String replaceAll(String input, String toRepalce,
			String replacement) {
		return StringUtil.replaceAll(input, toRepalce, replacement);
	}
}
