
/**
 * demo class that will use all of the classes
 * a lot of the lines are structured the same way
 * but could not be put into methods
 * due to slight changes in each one
 * 
 * @author Ethan Silvas 
 */
import java.util.*;
import java.io.*;
public class DrinkTester
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        Scanner input = null;
        PrintWriter output = null;
        try {
            output = new PrintWriter(new FileOutputStream("drinks.txt"));
            input = new Scanner(new FileInputStream("drinks.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found");
            System.exit(0);
        }
        
        //set choice to some number that wont be reachable
        int choice = 100;
        
        System.out.println("Welcome to drink maker!");
        //use a while loop to keep the program running
        //until the user decides to exit
        while (choice != 0) {
            menu();
            //now set choice to user input
            choice = keyboard.nextInt();
            
            //switch statement for the main menu
            switch (choice) {
                case 0:
                        System.out.println("Goodbye.");
                        System.exit(0);
                        break;
                        
                case 1:
                        drinkMenu();
                        int drinkChoice = keyboard.nextInt();

                        //switch statement for the drink menu
                        switch (drinkChoice) {
                            case 1:
                                    //set espresso to something random
                                    Espresso espresso = new Espresso("black","long");
                                    //make a variable to help with printing
                                    String newEspresso = "";
                                    //make variables to use as arguments
                                    String blackEspresso = "black";
                                    String whiteEspresso = "white";
                                    String shortEspresso = "short";
                                    String longEspresso = "long";
                                    System.out.println("Would you like it black or white? (b/w)");
                                    String blackOrWhite = keyboard.next();
                                    System.out.println("Would you like it short or long? (s/l)");
                                    String shortOrLong = keyboard.next();
                                    
                                    //if statement for the possible combos
                                    if (blackOrWhite.equalsIgnoreCase("b")) {
                                        if (shortOrLong.equalsIgnoreCase("s")) {
                                            espresso = makeEspresso(blackEspresso,shortEspresso);
                                        } else if (shortOrLong.equalsIgnoreCase("l")) {
                                            espresso = makeEspresso(blackEspresso,longEspresso);
                                        }
                                    } else if (blackOrWhite.equalsIgnoreCase("w")) {
                                        if (shortOrLong.equalsIgnoreCase("s")) {
                                            espresso = makeEspresso(whiteEspresso,shortEspresso);
                                        } else if (shortOrLong.equalsIgnoreCase("l")) {
                                            espresso = makeEspresso(whiteEspresso,longEspresso);
                                        }
                                    }
                                    
                                    //print the result
                                    System.out.println("Enjoy your " + espresso.toString() + "!");
                                    System.out.println();
                                    break;
                                    
                            case 2:
                                    //random espresso
                                    Espresso tempEspresso = new Espresso("black","long");
                                    //random latte
                                    Latte latte = new Latte(true,tempEspresso,100);
                                    System.out.println("Would you like foam? (y/n)");
                                    String foamOrNo = keyboard.next();
                                    System.out.println("How many shots of espresso would you like?");
                                    int numShots = keyboard.nextInt();
                                    tempMenu();
                                    int temp = keyboard.nextInt();
                                    tempEspresso = new Espresso(numShots);
                                    
                                    if (foamOrNo.equalsIgnoreCase("y")) {
                                        latte = makeLatte(true,tempEspresso,temp);
                                    } else if (foamOrNo.equalsIgnoreCase("n")) {
                                        latte = makeLatte(false,tempEspresso,temp);
                                    }
                                    
                                    System.out.println("Enjoy your " + latte.toString() + "!");
                                    System.out.println();
                                    break;
                                    
                            case 3:  
                                    //random green tea
                                    GreenTea greenTea = new GreenTea(true,true);
                                    System.out.println("Would you like lemon? (y/n)");
                                    String greenLemon = keyboard.next();
                                    System.out.println("Would you like sugar? (y/n)");
                                    String greenSugar = keyboard.next();
                                    
                                    if (greenLemon.equalsIgnoreCase("y")) {
                                        if (greenSugar.equalsIgnoreCase("y")) {
                                            greenTea = makeGreenTea(true,true);
                                        } else if (greenSugar.equalsIgnoreCase("n")) {
                                            greenTea = makeGreenTea(true,false);
                                        }
                                    } else if (greenLemon.equalsIgnoreCase("n")) {
                                        if (greenSugar.equalsIgnoreCase("y")) {
                                            greenTea = makeGreenTea(false,true);
                                        } else if (greenSugar.equalsIgnoreCase("n")) {
                                            greenTea = makeGreenTea(false,false);
                                        }
                                    }
                                    
                                    System.out.println("Enjoy your " + greenTea.toString() + "!");
                                    System.out.println();
                                    break;
                                    
                            case 4:
                                    //random black tea
                                    BlackTea blackTea = new BlackTea(true,true);
                                    System.out.println("Would you like lemon? (y/n)");
                                    String blackLemon = keyboard.next();
                                    System.out.println("Would you like sugar? (y/n)");
                                    String blackSugar = keyboard.next();
                                    
                                    if (blackLemon.equalsIgnoreCase("y")) {
                                        if (blackSugar.equalsIgnoreCase("y")) {
                                            blackTea = makeBlackTea(true,true);
                                        } else if (blackSugar.equalsIgnoreCase("n")) {
                                            blackTea = makeBlackTea(true,false);
                                        }
                                    } else if (blackLemon.equalsIgnoreCase("n")) {
                                        if (blackSugar.equalsIgnoreCase("y")) {
                                            blackTea = makeBlackTea(false,true);
                                        } else if (blackSugar.equalsIgnoreCase("n")) {
                                            blackTea = makeBlackTea(false,false);
                                        }
                                    }
                                    
                                    System.out.println("Enjoy your " + blackTea.toString() + "!");
                                    System.out.println();
                                    break;
                        }
                        break;
                        
                case 2: 
                        /**
                         * this case is mostly copy pasted from case 1 
                         * but instead of making the drink
                         * it prints to a file what kind of drink the user makes
                         */
                        drinkMenu();
                        int saveDrinkChoice = keyboard.nextInt();
                        
                        switch (saveDrinkChoice) {
                            case 1:
                                    //set espresso to something random
                                    Espresso espresso = new Espresso("black","long");
                                    //make a variable to help with printing
                                    String newEspresso = "";
                                    //make variables to use as arguments
                                    String blackEspresso = "black";
                                    String whiteEspresso = "white";
                                    String shortEspresso = "short";
                                    String longEspresso = "long";
                                    System.out.println("Would you like it black or white? (b/w)");
                                    String blackOrWhite = keyboard.next();
                                    System.out.println("Would you like it short or long? (s/l)");
                                    String shortOrLong = keyboard.next();
                                    
                                    //the only new variable
                                    String writeEspresso = "espresso";
                                    
                                    //if statement for the possible combos
                                    if (blackOrWhite.equalsIgnoreCase("b")) {
                                        if (shortOrLong.equalsIgnoreCase("s")) {
                                            output.println(writeEspresso);
                                            output.println(blackEspresso);
                                            output.println(shortEspresso);
                                        } else if (shortOrLong.equalsIgnoreCase("l")) {
                                            output.println(writeEspresso);
                                            output.println(blackEspresso);
                                            output.println(longEspresso);
                                        }
                                    } else if (blackOrWhite.equalsIgnoreCase("w")) {
                                        if (shortOrLong.equalsIgnoreCase("s")) {
                                            output.println(writeEspresso);
                                            output.println(whiteEspresso);
                                            output.println(shortEspresso);
                                        } else if (shortOrLong.equalsIgnoreCase("l")) {
                                            output.println(writeEspresso);
                                            output.println(whiteEspresso);
                                            output.println(longEspresso);
                                        }
                                    }
                                    break;
                                    
                            case 2:
                                    //random espresso
                                    Espresso tempEspresso = new Espresso("black","long");
                                    //random latte
                                    Latte latte = new Latte(true,tempEspresso,100);
                                    System.out.println("Would you like foam? (y/n)");
                                    String foamOrNo = keyboard.next();
                                    System.out.println("How many shots of espresso would you like?");
                                    int numShots = keyboard.nextInt();
                                    tempMenu();
                                    int temp = keyboard.nextInt();
                                    tempEspresso = new Espresso(numShots);
                                    
                                    if (foamOrNo.equalsIgnoreCase("y")) {
                                        output.println("latte");
                                        output.println("foam");
                                        output.println(numShots);
                                        output.println(temp);
                                    } else if (foamOrNo.equalsIgnoreCase("n")) {
                                        output.println("latte");
                                        output.println("no foam");
                                        output.println(numShots);
                                        output.println(temp);
                                    }
                                    break;
                                    
                            case 3:  
                                    //random green tea
                                    GreenTea greenTea = new GreenTea(true,true);
                                    System.out.println("Would you like lemon? (y/n)");
                                    String greenLemon = keyboard.next();
                                    System.out.println("Would you like sugar? (y/n)");
                                    String greenSugar = keyboard.next();
                                    
                                    if (greenLemon.equalsIgnoreCase("y")) {
                                        if (greenSugar.equalsIgnoreCase("y")) {
                                            output.println("green tea");
                                            output.println("lemon");
                                            output.println("sugar");
                                        } else if (greenSugar.equalsIgnoreCase("n")) {
                                            output.println("green tea");
                                            output.println("lemon");
                                            output.println("no sugar");
                                        }
                                    } else if (greenLemon.equalsIgnoreCase("n")) {
                                        if (greenSugar.equalsIgnoreCase("y")) {
                                            output.println("green tea");
                                            output.println("no lemon");
                                            output.println("sugar");
                                        } else if (greenSugar.equalsIgnoreCase("n")) {
                                            output.println("green tea");
                                            output.println("no lemon");
                                            output.println("sugar");
                                        }
                                    }
                                    break;
                                    
                            case 4:
                                    //random black tea
                                    BlackTea blackTea = new BlackTea(true,true);
                                    System.out.println("Would you like lemon? (y/n)");
                                    String blackLemon = keyboard.next();
                                    System.out.println("Would you like sugar? (y/n)");
                                    String blackSugar = keyboard.next();
                                    
                                     if (blackLemon.equalsIgnoreCase("y")) {
                                        if (blackSugar.equalsIgnoreCase("y")) {
                                            output.println("black tea");
                                            output.println("lemon");
                                            output.println("sugar");
                                        } else if (blackSugar.equalsIgnoreCase("n")) {
                                            output.println("black tea");
                                            output.println("lemon");
                                            output.println("no sugar");
                                        }
                                    } else if (blackLemon.equalsIgnoreCase("n")) {
                                        if (blackSugar.equalsIgnoreCase("y")) {
                                            output.println("black tea");
                                            output.println("no lemon");
                                            output.println("sugar");
                                        } else if (blackSugar.equalsIgnoreCase("n")) {
                                            output.println("black tea");
                                            output.println("no lemon");
                                            output.println("sugar");
                                        }
                                    }
                                    break;
                        }
                        System.out.println("Your drink for tomorrow has been saved");
                        System.out.println();
                        output.close();
                        break;
                
                case 3:
                        //random variables to declare later
                        Espresso morningEspresso = new Espresso("black","short");
                        Espresso morningShots = new Espresso(100);
                        Latte morningLatte = new Latte(true,morningShots,5);
                        GreenTea morningGreenTea = new GreenTea(true,true);
                        BlackTea morningBlackTea = new BlackTea(true,true);
                        //variables for espresso
                        String morningBlack = "black";
                        String morningWhite = "white";
                        String morningShort = "short";
                        String morningLong = "long";
                        
                        if (input.hasNextLine()) {
                        //read the first line and find out what type of drink it is
                        String morningDrink = input.nextLine();
                        
                        if (morningDrink.equalsIgnoreCase("espresso")) {
                            String morningColor = input.nextLine();
                            String morningAmount = input.nextLine();
                            
                            if (morningColor.equalsIgnoreCase("black")) {
                                if (morningAmount.equalsIgnoreCase("short")) {
                                    morningEspresso = makeEspresso(morningBlack,morningShort);
                                } else if (morningAmount.equalsIgnoreCase("long")) {
                                    morningEspresso = makeEspresso(morningBlack,morningLong);
                                }
                            } else if (morningColor.equalsIgnoreCase("white")) {
                                if (morningAmount.equalsIgnoreCase("short")) {
                                    morningEspresso = makeEspresso(morningWhite,morningShort);
                                } else if (morningAmount.equalsIgnoreCase("long")) {
                                    morningEspresso = makeEspresso(morningWhite,morningLong);
                                }
                            }
                            
                            System.out.println("Enjoy your " + morningEspresso + "!");
                            System.out.println();
                        } else if (morningDrink.equalsIgnoreCase("latte")) {
                            String morningFoam = keyboard.nextLine();
                            Espresso morningNumShots = new Espresso(keyboard.nextInt());
                            int morningTemp = keyboard.nextInt();
                            
                            if (morningFoam.equalsIgnoreCase("foam")) {
                                morningLatte = makeLatte(true,morningNumShots,morningTemp);
                            } else if (morningFoam.equalsIgnoreCase("no foam")) {
                                morningLatte = makeLatte(false,morningNumShots,morningTemp);
                            }
                            
                            System.out.println("Enjoy your " + morningLatte + "!");
                            System.out.println();
                        } else if (morningDrink.equalsIgnoreCase("green tea")) {
                            String morningGreenLemon = keyboard.nextLine();
                            String morningGreenSugar = keyboard.nextLine();
                            
                            if (morningGreenLemon.equalsIgnoreCase("lemon")) {
                                if (morningGreenSugar.equalsIgnoreCase("sugar")) {
                                    morningGreenTea = makeGreenTea(true,true);
                                } else if (morningGreenSugar.equalsIgnoreCase("no sugar")) {
                                    morningGreenTea = makeGreenTea(true,false);
                                }
                            } else if (morningGreenLemon.equalsIgnoreCase("no lemon")) {
                                if (morningGreenSugar.equalsIgnoreCase("sugar")) {
                                    morningGreenTea = makeGreenTea(false,true);
                                } else if (morningGreenSugar.equalsIgnoreCase("no sugar")) {
                                    morningGreenTea = makeGreenTea(false,false);
                                }
                            }
                            
                            System.out.println("Enjoy your " + morningGreenTea.toString() + "!");
                            System.out.println();
                        } else if (morningDrink.equalsIgnoreCase("black tea")) {
                            String morningBlackLemon = keyboard.nextLine();
                            String morningBlackSugar = keyboard.nextLine();
                            
                            if (morningBlackLemon.equalsIgnoreCase("lemon")) {
                                if (morningBlackSugar.equalsIgnoreCase("sugar")) {
                                    morningBlackTea = makeBlackTea(true,true);
                                } else if (morningBlackSugar.equalsIgnoreCase("no sugar")) {
                                    morningBlackTea = makeBlackTea(true,false);
                                }
                            } else if (morningBlackLemon.equalsIgnoreCase("no lemon")) {
                                if (morningBlackSugar.equalsIgnoreCase("sugar")) {
                                    morningBlackTea = makeBlackTea(false,true);
                                } else if (morningBlackSugar.equalsIgnoreCase("no sugar")) {
                                    morningBlackTea = makeBlackTea(false,false);
                                }
                            }
                            
                            System.out.println("Enjoy your " + morningBlackTea.toString() + "!");
                            System.out.println();
                        }
                    } else {
                        System.out.println("There is no saved drink yet.");
                    }
                        break;
                        
                case 4:
                        //use two delimiters to take in a time and am or pm
                        keyboard.useDelimiter("[:\n]");
                        System.out.println("Enter the time at which you want to pick up your order. ex: 12:51");
                        int hours = keyboard.nextInt();
                        int minutes = keyboard.nextInt();
                        System.out.println("Please enter am or pm");
                        String amOrPm = keyboard.next();
                        Time pickupTime = new Time(hours,minutes,amOrPm);
                        
                        drinkMenu();
                        int shopDrink = keyboard.nextInt();
                        /**
                         * copy pasted make a drink
                         * but change the println to incorporate the pickup time
                         */
                        switch (shopDrink) {
                            case 1:
                                    //set espresso to something random
                                    Espresso espresso = new Espresso("black","long");
                                    //make a variable to help with printing
                                    String newEspresso = "";
                                    //make variables to use as arguments
                                    String blackEspresso = "black";
                                    String whiteEspresso = "white";
                                    String shortEspresso = "short";
                                    String longEspresso = "long";
                                    System.out.println("Would you like it black or white? (b/w)");
                                    String blackOrWhite = keyboard.next();
                                    System.out.println("Would you like it short or long? (s/l)");
                                    String shortOrLong = keyboard.next();
                                    
                                    //if statement for the possible combos
                                    if (blackOrWhite.equalsIgnoreCase("b")) {
                                        if (shortOrLong.equalsIgnoreCase("s")) {
                                            espresso = makeEspresso(blackEspresso,shortEspresso);
                                        } else if (shortOrLong.equalsIgnoreCase("l")) {
                                            espresso = makeEspresso(blackEspresso,longEspresso);
                                        }
                                    } else if (blackOrWhite.equalsIgnoreCase("w")) {
                                        if (shortOrLong.equalsIgnoreCase("s")) {
                                            espresso = makeEspresso(whiteEspresso,shortEspresso);
                                        } else if (shortOrLong.equalsIgnoreCase("l")) {
                                            espresso = makeEspresso(whiteEspresso,longEspresso);
                                        }
                                    }
                                    
                                    //print the result
                                    System.out.println("Your " + espresso.toString() + " will be ready at " + pickupTime.toString());
                                    System.out.println();
                                    break;
                                    
                            case 2:
                                    //random espresso
                                    Espresso tempEspresso = new Espresso("black","long");
                                    //random latte
                                    Latte latte = new Latte(true,tempEspresso,100);
                                    System.out.println("Would you like foam? (y/n)");
                                    String foamOrNo = keyboard.next();
                                    System.out.println("How many shots of espresso would you like?");
                                    int numShots = keyboard.nextInt();
                                    tempMenu();
                                    int temp = keyboard.nextInt();
                                    tempEspresso = new Espresso(numShots);
                                    
                                    if (foamOrNo.equalsIgnoreCase("y")) {
                                        latte = makeLatte(true,tempEspresso,temp);
                                    } else if (foamOrNo.equalsIgnoreCase("n")) {
                                        latte = makeLatte(false,tempEspresso,temp);
                                    }
                                    
                                    System.out.println("Your " + latte.toString() + " will be ready at " + pickupTime.toString());
                                    System.out.println();
                                    break;
                                    
                            case 3:  
                                    //random green tea
                                    GreenTea greenTea = new GreenTea(true,true);
                                    System.out.println("Would you like lemon? (y/n)");
                                    String greenLemon = keyboard.next();
                                    System.out.println("Would you like sugar? (y/n)");
                                    String greenSugar = keyboard.next();
                                    
                                    if (greenLemon.equalsIgnoreCase("y")) {
                                        if (greenSugar.equalsIgnoreCase("y")) {
                                            greenTea = makeGreenTea(true,true);
                                        } else if (greenSugar.equalsIgnoreCase("n")) {
                                            greenTea = makeGreenTea(true,false);
                                        }
                                    } else if (greenLemon.equalsIgnoreCase("n")) {
                                        if (greenSugar.equalsIgnoreCase("y")) {
                                            greenTea = makeGreenTea(false,true);
                                        } else if (greenSugar.equalsIgnoreCase("n")) {
                                            greenTea = makeGreenTea(false,false);
                                        }
                                    }
                                    
                                    System.out.println("Your " + greenTea.toString() + " will be ready at " + pickupTime.toString());
                                    System.out.println();
                                    break;
                                    
                            case 4:
                                    //random black tea
                                    BlackTea blackTea = new BlackTea(true,true);
                                    System.out.println("Would you like lemon? (y/n)");
                                    String blackLemon = keyboard.next();
                                    System.out.println("Would you like sugar? (y/n)");
                                    String blackSugar = keyboard.next();
                                    
                                    if (blackLemon.equalsIgnoreCase("y")) {
                                        if (blackSugar.equalsIgnoreCase("y")) {
                                            blackTea = makeBlackTea(true,true);
                                        } else if (blackSugar.equalsIgnoreCase("n")) {
                                            blackTea = makeBlackTea(true,false);
                                        }
                                    } else if (blackLemon.equalsIgnoreCase("n")) {
                                        if (blackSugar.equalsIgnoreCase("y")) {
                                            blackTea = makeBlackTea(false,true);
                                        } else if (blackSugar.equalsIgnoreCase("n")) {
                                            blackTea = makeBlackTea(false,false);
                                        }
                                    }
                                    
                                    System.out.println("Your " + blackTea.toString() + " will be ready at " + pickupTime.toString());
                                    System.out.println();
                                    break;
                        }
                        break;
            }
        }
    }
    
    //make a menu for the user
    public static void menu() {
        System.out.println("Please make a selection.");
        System.out.println("0. Exit");
        System.out.println("1. Make a new drink right now");
        System.out.println("2. Save a drink for tomorrow morning");
        System.out.println("3. Make the currently saved drink from last evening"); 
        System.out.println("4. Place an order for pickup at your local coffee shop");
    }
    
    //menu for drink
    public static void drinkMenu() {
        System.out.println("Please choose your drink");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Green Tea");
        System.out.println("4. Black Tea");
    }
    
    //make individual methods that make each drink
    public static Espresso makeEspresso(String blackOrWhite, String shortOrLong) {
        Espresso freshEspresso = new Espresso(blackOrWhite,shortOrLong);
        return freshEspresso;
    }
    
    public static Espresso espressoShots(int numShots) {
        Espresso freshEspresso = new Espresso(numShots);
        return freshEspresso;
    }
    
    public static Latte makeLatte(boolean someFoam, Espresso numShots, int temp) {
        Latte freshLatte = new Latte(someFoam,numShots,temp);
        return freshLatte;
    }
    
    public static GreenTea makeGreenTea(boolean lemon, boolean sugar) {
        GreenTea freshGreenTea = new GreenTea(lemon,sugar);
        return freshGreenTea;
    }
    
    public static BlackTea makeBlackTea(boolean lemon, boolean sugar) {
        BlackTea freshBlackTea = new BlackTea(lemon,sugar);
        return freshBlackTea;
    }
    
    //small method for temperature
    public static void tempMenu() {
        System.out.println("What temperature would you like it?");
        System.out.println("1. Iced");
        System.out.println("2. Cold");
        System.out.println("3. Warm");
        System.out.println("4. Hot");
        System.out.println("5. Very Hot");
    }
}
