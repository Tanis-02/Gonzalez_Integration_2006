// Elizabeth Gonzalez
// This is the class for all of the requirements of this project that don't quite fit in with my
// theme just yet. As I go further along with my actual themed portion of the project, I will take
// off things from this class that are used in the main project and update the READ ME as necessary
import java.lang.Math;

/**
 * @author Elizabeth Gonzalez
 * This class holds all of the requirements from the course that I could not work into the main 
 * project.
 */
public class Requirments {

  /**
   * This is a method that houses all of the elements of my PSI that I have yet to work into my
   * main method in my main class. It has most of the requirements from the previous 3 PSIs.
   */
  public static void required() {

    /*List & description of Java built-in data types:
      Byte: 8 bit, min of -127 to max 127 value, useful for saving memory into large arrays

      Short: 16 bit, -32,768 min to 32,767 max value, good for saving memory in large arrays but
      has more space than a byte

      Int: 32 bits, min -2^31 to 2^32 -1 max value, uses class int, good for mathematical
      operations

      Long: 64 bit, -2^63 min and 2^63 -1 max value, good for large values that int can't handle

      Float: really good for saving memory in big arrays of fractional numbers, it does round
      the numbers out though so it is not 100% accurate for that type of arithmetic, needs an f at
      the end of the number

      Double: usually used for decimals but just like float is not 100% accurate

      Boolean: true, false data, only gives these 2 values and it used to track true and false
      conditions

      Char: single 16bit unicode character, basically just 1 character

      Variable: a location in memory

      Scope: a variable is only accessible in the variable where it was declared */

    int sample1 = 4;
    int sample2 = 6;

    System.out.println(sample1 > sample2);

    double itsADecimal = 150.23;

    System.out.println(itsADecimal);

    boolean myTimeManagementIsAwful = true;
    boolean iFeelGreat = false;

    System.out.println(myTimeManagementIsAwful);
    System.out.println(iFeelGreat);
    int grade = 90;

    // ? is the ternary operator
    // https://www.tutorialspoint.com/Java-Ternary-Operator-Examples
    char endGrade = (grade >= 90) ? 'A' : '8';

    if (grade >= 90) {
      endGrade = 'A';
    } else if (grade >= 80) {
      endGrade = 'B';
    } else if (grade >= 70) {
      endGrade = 'C';
    } else if (grade >= 60) {
      endGrade = 'D';
    } else {
      endGrade = 'F';
    }
    
    System.out.println(endGrade);
    
    // Using Math Class
    double mathClassExample = Math.pow(4, 7);
    System.out.println("The result of 4 to the power of 7 is " + mathClassExample);

    // Use +, -, *, /, %, ++, --, +=
    int funnierThan = 24 + 1;
    System.out.println("Know what's funnier than 24? " + funnierThan);

    int oof = 25;
    System.out.println("Know what's old news? " + oof);

    int referencesRule = (24 * 2) - 6; // OPERATOR PRECEDENCE: gives the order that something
    // exectues, like PEMDASs
    System.out.println("What is the meaning of life? " + referencesRule);

    int beerAndWine = 42 / 2;
    System.out.println("What's a good age? " + beerAndWine);

    int divorceJokesAreDark = 33 % 2;
    System.out.println("What's left after you've split your things? " + divorceJokesAreDark);

    funnierThan++;
    System.out.println("Oh My! It's " + funnierThan);

    funnierThan--;
    System.out.println("I miss " + funnierThan);

    // Relational and Conditional Operators
    int numOfMonstersToday = 2;
    System.out.println(numOfMonstersToday < 5); // less than, eval true
    System.out.println(numOfMonstersToday > 5); // more than, eval false
    System.out.println(numOfMonstersToday <= 5); // more than or equal to, eval false
    System.out.println(numOfMonstersToday >= 5); // less tan or equal to, eval true

    int myDude = 1;
    int woahBro = 5;
    if ((myDude == 4) && (woahBro == 5)) {
      System.out.println("That's dope.");
    }
    if ((myDude == 4) || (woahBro == 5)) {
      System.out.println("That's cool too.");
    }

    // While Loop
    int hoursOfSleepIWant = 0;

    while (hoursOfSleepIWant <= 8) {
      System.out.println(hoursOfSleepIWant);
      hoursOfSleepIWant++;
      if (hoursOfSleepIWant < 4) {
        System.out.println("Another sleepless night");
        continue; // this skips 1 iteration of a loop and moves to the end of the loop
      }
    }

    // do while Loops
    int treatsMyDogsGet = 1;

    do {
      System.out.println(treatsMyDogsGet);
      treatsMyDogsGet++;
      break; // this stops the program immedietly and then forces it to just move on to the next
    // statement without checking the one it's on
    } while (treatsMyDogsGet < 3); // I love my puppies, they deserve all the treats but gotta keep
    // 'em healthy too <3

    /*
     * Inheritance: classes that inherit fields and methods from other classes. Inheritance makes it
     * easy to create an object like Dog from a more general class like Animal. The parent class
     * would give the child class everything they have in common which saves time and space when
     * you're creating multiple objects from the same class
     */
    

  }
}
