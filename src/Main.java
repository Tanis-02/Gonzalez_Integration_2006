// Elizabeth Gonzalez
// This is the Driver Class
import java.util.Scanner;

// CTRL + SHIFT + F : to format code

// Rule: any time you go from numbers to string you have to clear out the input string

/**
* @author Elizabeth Gonzalez
*My theme for my integration project is based off Dungeons and Dragons. This will be a choose your
*own adventure story based around a transfer student who is taking their placement test with
* their assigned group at SmigginHoles Academy, the premier adventurer finishing school in all of
* Auirial!
* The main goal of the quest is to deliver the goods(in this case yourselves) to a
* remote town in the Auirial desert and get in the top class!
* This program does not follow all the rules of D&D just because it's a story type of game and that
* would be too complicated. Several liberties have been taken with this game
*/
public class Main {

  // this is a header
  // public is an access mod
  // void is the return type, means this method doesn't return a value
  // method names should be in lowerCamelCase and be named with a verb

  /**
   * The main method is the method that contains all of the main runnable components
   * for my project. It houses all of the user input information and the information that the user
   * recieves back from the program as well.
   * 
   * @param args- args is the command line arguments for my main method
   */
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
    Scanner scan = new Scanner(System.in);
    String yourName = scan.next();


    System.out.println("Welcome " + yourName + " to the first year class."
        + " In a 2 days we will be having placement tests to see what class you will be put in./n"
        + "You are currently in our outpost township;/n your goal is to work together with your"
        + " 3 other party members to deliver the packs you're given to the school./n"
        + " We will be monitoring you as you progress through the Auirial desert and you will be"
        + " placed in class A, B or C depending on your performance./n Have fun!");

    System.out
        .println("Please take these few days to study, buy supplies, get to know your teammates"
            + " or get any other neccesities out of the way. \n");

    System.out.println("You have 32 hours, after taking out 8 hours each day for a full rest./n "
        + "What would you like to do first:");

    // Menu
    System.out.println("/n1. Study, takes 12 hours");
    System.out.println("/n2. Buy Supplies, takes 8 hours");
    System.out.println("/n3. Get to know your teammates?, takes 16 hours");
    System.out.println("/nPlease input a numbered choice.");

    try {
      while (true) {
        int select = scan.nextInt();
        if (select < 1 || select > 3) {
          System.out.println("The number you've chosen is not an option."
              + " Please input a value from the numbered choices above.");
          continue;
        }
        if (select == 1){
          System.out.println("After hours of intense studying"
              + " you've gained advantage on all healing spells,/n "
              + "if at any point you roll less than 6 on your healing roll"
              + " another dice will be automatically thrown for you/n"
              + " and the higher of the 2 numbers will be taken as your roll!");
        }else if (select == 2){
          System.out.println(
              "You've scoured the market place, fighting off other teams to get your goods "
                  + "and it's paid off!/n You've found 3 "
                  + "standard healing potions, 2 alchemists fire vials, 1 poison vial, "
                  + "2 daggers, and a shiny green pebble!/n");
        }else if (select == 3){
          System.out.println(
              "Spending time with your party members is important!/n You've laughed together, "
                  + "cried together, and a subset of you guys have already chosen who you're"
                  + " willing to throw in the middle of a goblin horde to make a quick escape./n "
                  + "You have gained the ability to heal your"
                  + " entire team ONCE back to full health./n");
        }else {

        }
        break;
      }
    }catch (Exception e){
      System.out.println("An error has occured.");
    }finally {

    }

    System.out.println(
        "/nAs the sun rises on the day of your departure, your team of 3 recieves a total of "
            + "3 medium sized packages to deliever to the school within 2 days./n"
            + "Your party members are waiting for you by the entrance gate and with that"
            + " your journey is set to begin.");
    System.out.println("/nYou start on the path through the Aurial desert," + " ");



    scan.close();
  } // closes main method
}// closes main class


