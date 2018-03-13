
/**
 * make a green tea 
 * 
 * @author Ethan Silvas
 */
public class GreenTea
{
    private boolean lemon;
    private boolean sugar;
    
    //constructor that does all we need to do for tea
    public GreenTea(boolean lemonOrNot, boolean sugarOrNot) {
        //if statements for lemon and sugar
        if (lemonOrNot = true) {
            lemon = true;
        } else if (lemonOrNot = false) {
            lemon = false;
        }
        
        if (sugarOrNot = true) {
            sugar = true;
        } else if (sugarOrNot = false) {
            sugar = false;
        }
    }
    
    //toString method
    public String toString() {
        String greenTea = "";
        
        //make some strings for lemon and sugar
        String hasLemon = " with a lemon";
        String noLemon = " with no lemon";
        String hasSugar = " and sugar";
        String noSugar = " and no sugar";
        
        //if statements for all the different combos
        if (lemon = true) {
            if (sugar = true) {
                greenTea = "green tea" + hasLemon + hasSugar;
            } else if (sugar = false) {
                greenTea = "green tea" + hasLemon + noSugar;
            }
        } else if (lemon = false) {
            if (sugar = true) {
                greenTea = "green tea" + noLemon + hasSugar;
            } else if (sugar = false) {
                greenTea = "green tea" + noLemon + noSugar;
            }
        }
        
        return greenTea;
    }
}
