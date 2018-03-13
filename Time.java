
/**
 * this class will dictate the time of day
 * so that the other classes will know whether or not 
 * to make a specific drink
 * 
 * @author Ethan Silvas
 */
public class Time
{
    //variables for hours, minutes, and am/pm
    private int hour;
    private int minute;
    private String timeOfDay;
    
    //constructor that sets up the current time 
    public Time(int hours, int minutes, String amOrPm) {
        hour = hours;
        minute = minutes;
        timeOfDay = amOrPm;
    }
    
    //method for checking if it is morning
    public boolean isMorning() {
        if (timeOfDay.equalsIgnoreCase("am")) {
            return true;
        }
        
        return false;
    }
    
    //method for checking if it is evening
    public boolean isEvening() {
        if (timeOfDay.equalsIgnoreCase("pm")) {
            return true;
        }
        
        return false;
    }
    
    public String toString() {
        String timeToString = hour + ":" + minute;
        return timeToString;
    }
}
