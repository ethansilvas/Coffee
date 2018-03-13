
/**
 * a subclass of Coffee with
 * objects that create a specific kind 
 * of latte
 * 
 * @author Ethan Silvas 
 */
public class Latte
{
    //create variables for foam, espresso shots, and temperature
    private boolean foam;
    private Espresso shots;
    private int temperature;
    
    //an array of string values that correspond with integers
    private final String[] tempString = { "iced", "cold", "warm", "hot", "very hot" };
    
    //constructor that takes in the 3 types of 
    //*int should only be 1-5 so that it can be converted to string later*
    public Latte(boolean someFoam, Espresso numShots, int temp) {
        if (someFoam = true) {
            foam = true;
        } else if (someFoam = false) {
            foam = false;
        }
        
        shots = numShots;
        temperature = temp;
    }
    
    //toString method 
    public String toString() {
        //make a string variable to return
        String latteString = "";
        String tempToString = "";
        
        //switch statement for the changing temperature to its corresponding string
        switch (temperature) {
            case 1:
                    tempToString = tempString[0];
                    break;
                   
            case 2:
                    tempToString = tempString[1];
                    break;
                   
            case 3:
                    tempToString = tempString[2];
                    break;
                    
            case 4: 
                    tempToString = tempString[3];
                    break;
                    
            case 5:
                    tempToString = tempString[4];
                    break;
        }
        
        //use tempToString and getNumberOfShots() from the espresso class to create a string for printing
        if (foam = true) {
            latteString = tempToString + " latte with foam and " + shots.getNumberOfShots() + " shots of espresso";
        } else if (foam = false) {
            latteString = tempToString + " latte with no foam and " + shots.getNumberOfShots() + " shots of espresso";
        }
        
        return latteString;
    }
}
