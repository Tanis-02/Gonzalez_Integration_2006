import java.util.ArrayList;

// Elizabeth Gonzalez

public class PlayingWithArrays {
    int myArray[] = {10,20,30,40,50};
    int total = 0;
    int winner = 10;
    int theTable[][] = {{1,3,5,7,9}, {2,4,6,8,10}};
    int x = 8;
    int y = 1;
   
  // enhanced for loop and getting sum of the values of an array using an accumulator
  public void oneDimentionalArrays(int[] myArray, int total){
    for(int first: myArray) {
        total += first;
    }
  
    System.out.println(total);

    // 1D Array, nothing fancy 
    int yaBoi[] = {10,20,30,40,50};
    System.out.println(yaBoi[0]);
  }
  
  
  public int oneDimentionalArrays(int[] myArray){
    // finding smallest value in an array
    int smallest = myArray[0];
    
    for (int small = 0; small < myArray.length; small++) {
      if (myArray[small] < smallest) {
        smallest = myArray[small];
      }
    }
    
    return smallest;
    
  }
    // Search an array and identify the index where a value was found
  public int oneDimentionalArrays(int[] myArray, int winner, int total) {  
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] == winner) {
        return i;
      }else {
        System.out.println("The number does not exist.");
      }
     }
    
    return winner;
  }
  
  //2D Arrays
  public int twoDimentionalArrays(int[][] theTable) {
    
    int sum = theTable[0][3] + theTable[1][2];
    return sum;
  }
  
  /*Search 2d array and id the coordinates where the value was found
  public int twoDimentionalArrays(int[][] theTable, int winner) {
    
    return answer;
  } */
  
  //ArrayList
  public void twoDimentionalArrays(int x, int y) {
    ArrayList<Integer> integerList = new ArrayList<Integer>(x);
    
    for (int i=1; i < (x+y); i++) {
      integerList.add(i);
    }
    System.out.println(integerList);
  }
}

