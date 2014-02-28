package theApp.framework;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/** 
 * From http://thedailywtf.com/Articles/Nine-Ways-to-Tuesday.aspx, http://www.javacodegeeks.com/2011/07/funny-source-code-comments.html
 * @author unknown
 *
 */

//If you’re reading this, that means you have been put in charge of my previous project.
//I am so, so sorry for you. God speed.
public class DateLibrary {
    //This doesn't roll across month boundaries correctly
    //public Date getTuesdayInWeek(Date in) {
    //    GregorianCalendar gc = new GregorianCalendar();
    //    gc.setTime(in);
    //    gc.add(Calendar.DATE,  Calendar.TUESDAY - gc.get(Calendar.DAY_OF_WEEK));
    //    return gc.getTime();
    //}

	// The magnitude of this hack compares favorably with that of the national debt.
    public Date getSundayInWeek(Date in) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(in);
        return new Date(in.getTime() + (Calendar.SUNDAY - gc.get(Calendar.DAY_OF_WEEK))*24*3600*1000);
    }

    public Date getMondayInWeek(Date in) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(in);
        return new Date(in.getTime() + (Calendar.MONDAY - gc.get(Calendar.DAY_OF_WEEK))*24*3600*1000);
    }

    // Not sure if this will work for leap years
    public Date getTuesdayInWeek(Date in) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(in);
        return new Date(in.getTime() + (Calendar.TUESDAY - gc.get(Calendar.DAY_OF_WEEK))*24*3600*1000);
    }

    public Date getWednesdayInWeek(Date in) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(in);
        return new Date(in.getTime() + (Calendar.WEDNESDAY - gc.get(Calendar.DAY_OF_WEEK))*24*3600*1000);
    }

    public Date getThursdayInWeek(Date in) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(in);
        return new Date(in.getTime() + (Calendar.THURSDAY - gc.get(Calendar.DAY_OF_WEEK))*24*3600*1000);
    }

    public Date getFridayInWeek(Date in) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(in);
        return new Date(in.getTime() + (Calendar.FRIDAY - gc.get(Calendar.DAY_OF_WEEK))*24*3600*1000);
    }

    public Date getSaturdayInWeek(Date in) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(in);
        return new Date(in.getTime() + (Calendar.SATURDAY - gc.get(Calendar.DAY_OF_WEEK))*24*3600*1000);
    }

    public Date getDateInWeek(Date in, int desiredDay) {
        switch (desiredDay) {
            case Calendar.SUNDAY:    return getSundayInWeek(in);
            case Calendar.MONDAY:    return getMondayInWeek(in);
            case Calendar.TUESDAY:   return getTuesdayInWeek(in);
            case Calendar.WEDNESDAY: return getWednesdayInWeek(in);
            case Calendar.THURSDAY:  return getThursdayInWeek(in);
            case Calendar.FRIDAY:    return getFridayInWeek(in);
            case Calendar.SATURDAY:  return getSaturdayInWeek(in);
            default: throw new IllegalArgumentException("unknown desired day: "+desiredDay);
        }
    }

    public Date getReleaseDateInWeek(Date in) {
        return getDateInWeek(in, Calendar.TUESDAY);
    }
}
