package theApp.framework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * From http://thedailywtf.com/Articles/InternettoLowerCase.aspx
 * @author unknown
 *
 */

public class HTMLAnalyzer {
	public String analyze(File page) throws Exception{
	    BufferedReader bw = new BufferedReader(new FileReader(page)); 
	    String pageHTML = ""; 
	    while(bw.ready()){ 
	        pageHTML += bw.readLine() + "\n"; 
	    } 
	    int index = 0;
	    String result = "";
	    for(index = pageHTML.indexOf("<"); index != -1; index = pageHTML.indexOf("<",index+1)){ 
	        if(pageHTML.toLowerCase().regionMatches(index, "<a", 0, 2)){
	        	result += "has <a> \n"; 
	        }
	        if(pageHTML.toLowerCase().regionMatches(index, "<br", 0, 3)){
	        	result += "has <br> \n"; 
	        }
	        if(pageHTML.toLowerCase().regionMatches(index, "<img", 0, 4)){ 
	        	result += "has <img> \n";
	        } 
	    } 
	    return result; 
	}
}
