// Elizabeth Gonzalez
// This is the Driver Class
import java.util.Scanner;

// My theme for my integration project is based off Dungeons and Dragons. This will be a choose your
// own
// adventure story based around a transfer student who is taking their placement test with
// their assigned group at SmigginHoles Academy, the premier adventurer finishing school in all of
// Auirial!

// The main goal of the quest is to deliver the goods(in this case yourselves) to a
// remote town in the Auirial desert and get in the top class!

// This program does not follow all the rules of D&D just because it's a story type of game and that
// would be too complicated. Several liberties have been taken with this game :)



// CTRL + SHIFT + F : to format code

// Rule: any time you go from numbers to string you have to clear out the input string

public class Main {
  // this is a header
  // public is an access mod
  // void is the return type, means this method doesn't return a value
  // method names should be in lowerCamelCase and be named with a verb

  public static void main(String[] args) {

    System.out.println("Welcome to Smiggin Holes Academy, the primier"
        + " training academy for all soon to be adventurers!\n");

    // Your Character Stats

    System.out
        .println("Character Stats: \n " + "\tClass, Level, Race: Druid, Lvl 3, Forest Gnome  \n"
            + "\tStrength:10, modifier 0 \n\tDexterity:11, modifier 0 \n\tConstitution:14, "
            + "modifier 2 \n\tIntelligence:15, modifier 2 \n\tWisdom:14,"
            + "modifier 2 \n\tCharisma:10, modifier 0 " + "\nProficiency Bonus: +2"
            + "\nProficiencies: Nature, Animal Handling" + "\nHP: 23" + "\nInitiative: +2");

    System.out.println("\nPlease input your name ");

    // Using this to get someone's name and input it to the next line
    Scanner name = new Scanner(System.in);
    String yourName = name.next();
    name.close();

    System.out.println("Welcome " + yourName + " to the first year class."
        + " In a 2 days we will be having placement tests to see what class you will be put in.");

    System.out
        .println("Please take these few days to study, buy supplies, get to know your teammates"
            + " or get any other neccesities out of the way. \n");

    System.out.println("You have 32 hours, after taking out 8 hours each day for a full rest. "
        + "What would you like to do first:");

    // Menu
    System.out.println("1. Study, takes 12 hours");
    System.out.println("2. Buy Supplies, takes 8 hours");
    System.out.println("3. Get to know your teammates?, takes 16 hours");
    System.out.println("Please input a numbered choice.");
    
    Scanner scan = new Scanner(System.in);
    try {
    int select = scan.nextInt();
    
    if (select == 1) {
      System.out.println(
          "After hours of intense studying" + "you've gained advantage on all healing spells, "
              + "if at any point you roll less than 6 on your healing roll"
              + " another dice will be automatically thrown for you"
              + " and the higher of the 2 numbers will be taken as your roll!");
    } else if (select == 2) {
      System.out
          .println("You've scoured the market place, fighting off other teams to get your goods "
              + "and it's paid off! You've found 3 "
              + "standard healing potions, 2 alchemists fire vials, 1 poison vial, "
              + "2 daggers, and a shiny green pebble!");
    } else if (select == 3) {
      System.out
          .println("Spending time with your party members is important! You've laughed together, "
              + "cried together, and a subset of you guys have already chosen who "
              + "you're willing to throw in the middle of a goblin horde to make a quick escape. "
              + "You have gained the ability to heal your entire team ONCE back to full health.");
    } else {
      System.out
          .println("Seriously my dude, do you even want to be here? Choose a number between 1 and 3"
              + " or get lost scrub. :P");
    }
    
    }catch (Exception e) {
      System.out.println("An error has occured.");
    }finally {
      scan.close();
    }
      
////////////////////////////////////////////////////////////////////////////////////////////////////    
}
}


