
/**
 * a subclass of coffee with objects
 * that create a specific kind of espresso
 * 
 * @author Ethan Silvas 
 */
public class Espresso
{
    //variables for black/white and short/long
    private String color;
    private String amount;
    
    //make a variable for shots of espresso
    private int shots;
    
    //constructor for espresso
    public Espresso(String blackOrWhite, String shortOrLong) {
        color = blackOrWhite;
        amount = shortOrLong;
    }
    
    //constructor for shots
    public Espresso(int numberOfShots) {
        shots = numberOfShots;
    }
    
    //create methods to check for each variation
    
    //black
    public boolean isBlack() {
        if (color.equalsIgnoreCase("black")) {
            return true;
        }
        
        return false;
    }
    
    //white
    public boolean isWhite() {
        if (color.equalsIgnoreCase("white")) {
            return true;
        }
        
        return false;
    }
    
    //short
    public boolean isShort() {
        if (amount.equalsIgnoreCase("short")) {
            return true;
        }
        
        return false;
    }
    
    //long
    public boolean isLong() {
        if (amount.equalsIgnoreCase("long")) {
            return true;
        }
        
        return false;
    }
    
    //accessor method for shots
    //and to use in latte
    public int getNumberOfShots() {
        return shots;
    }
    
    //toString method for printing the results
    public String toString() {
        String drink = color + " " + "and " + amount + " espresso"; 
        return drink;
    }
}
