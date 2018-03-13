
/**
 * same as green tea
 * but kept in a different class 
 * for distinction
 * 
 * @author Ethan Silvas 
 */
public class BlackTea
{
    private boolean lemon;
    private boolean sugar;
    
    public BlackTea(boolean lemonOrNot, boolean sugarOrNot) {
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
        String blackTea = "";
        
        //make some strings for lemon and sugar
        String hasLemon = " with a lemon";
        String noLemon = " with no lemon";
        String hasSugar = " and sugar";
        String noSugar = " and no sugar";
        
        //if statements for all the different combos
        if (lemon = true) {
            if (sugar = true) {
                blackTea = "black tea" + hasLemon + hasSugar;
            } else if (sugar = false) {
                blackTea = "black tea" + hasLemon + noSugar;
            }
        } else if (lemon = false) {
            if (sugar = true) {
                blackTea = "black tea" + noLemon + hasSugar;
            } else if (sugar = false) {
                blackTea = "black tea" + noLemon + noSugar;
            }
        }
        
        return blackTea;
    }
}
