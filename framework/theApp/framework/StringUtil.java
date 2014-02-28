package theApp.framework;

/**
 * From http://thedailywtf.com/Articles/Stringing-a-Replacement.aspx, http://www.javacodegeeks.com/2011/07/funny-source-code-comments.html
 * @author unknown
 *
 */
public class StringUtil {
	
	// if i ever see this again i’m going to start bringing guns to work
	public static String replaceAll(String aReceiver, String anOldString,
			String aNewString) {
		int tmpIndex;
		int tmpLastIndex = 0;
		StringBuffer tmpResult;
		int tmpLength;

		if (null == aReceiver) {
			return null;
		}

		if ((null == anOldString) || (null == aNewString)) {
			return aReceiver;
		}

		tmpLength = anOldString.length();

		if (aReceiver.length() < 1) {
			if (tmpLength < 1) {
				return aNewString;
			}

			return "";
		}

		if (tmpLength < 1) {
			tmpResult = new StringBuffer();
			tmpResult.append(aNewString);
			tmpResult.append(aReceiver);

			return tmpResult.toString();
		}

		tmpIndex = aReceiver.indexOf(anOldString, 0);

		if (tmpIndex < 0) {
			return aReceiver;
		}

		tmpResult = new StringBuffer();

		while (tmpIndex > -1) {
			tmpResult.append(aReceiver.substring(tmpLastIndex, tmpIndex));
			tmpResult.append(aNewString);
			tmpIndex += tmpLength;
			tmpLastIndex = tmpIndex;

			tmpIndex = aReceiver.indexOf(anOldString, tmpIndex);
		}

		if (tmpLastIndex < aReceiver.length()) {
			tmpResult.append(aReceiver.substring(tmpLastIndex));
		}

		return tmpResult.toString();
	}
}