import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[] test;
    int[][] test2D;
    System.out.println(" Arrays.toString() and arrToString()");
    System.out.println();
    test = new int[] {1, 2, -3, 5, 6, 7};
    System.out.println("Expected: " + Arrays.toString(test) + ", Received: " + arrToString(test));
    System.out.println();
    System.out.println(" countZeros2D()");
    test2D = new int[][] {{0}, {2, 3}, {0, -5, 6, 0}};
    System.out.println();
    System.out.println("Expected: 3, Received: " + countZeros2D(test2D));
    test2D = new int[][] {{1}, {2, 3}, {3, -5, 6, 7}};
    System.out.println("Expected: 0, Received: " + countZeros2D(test2D));
    System.out.println();
    System.out.println(" arr2DSum()");
    test2D = new int[][] {{0}, {2, 3}, {0, -5, 6, 0}};
    System.out.println();
    System.out.println("Expected: 6, Received: " + arr2DSum(test2D));
    test2D = new int[][] {{1}, {2, 3}, {3, -5, 6, 7}};
    System.out.println("Expected: 17, Received: " + arr2DSum(test2D));
    System.out.println();
    System.out.println("Tests replaceNegative");
    System.out.println();
    test2D = new int[][] {{0, 0, 3, 1}, {1, -10, 20, 4, -5}, {-4, -6, 9}};
    System.out.println("Expected [[0, 0, 3, 1], [1, 1, 20, 4, 0], [0, 0, 9]], Received: " + Arrays.deepToString(replaceNegative(test2D)));
    System.out.println();
    System.out.println("Tests copy()");
    System.out.println();
    test2D = new int[][] {{0, 0, 3, 1}, {1, -10, 20, 4, -5}, {-4, -6, 9}};
    int[][] test2DCopy = copy(test2D);
    System.out.println("Expected [[0, 0, 3, 1], [1, -10, 20, 4, -5], [-4, -6, 9]], Received: " + Arrays.deepToString(test2DCopy));
    test2D[0][0] = 100;
    System.out.println("Changed Original: " + Arrays.deepToString(test2D) + ", Copy: " + Arrays.deepToString(test2DCopy));
    System.out.println();
    System.out.println("testing swapRC()");
    System.out.println();
    test2D = new int[][] {{1, 2},{1, 2},{5, 6}};
    test2D = new int[][] {{1, -2},{-1, 2},{3, 11}};
    System.out.println("Expected: [[1, -1, 3], [-2, 2, 11]], Received: " + Arrays.deepToString(swapRC(test2D)));
    System.out.println();
    System.out.println("esting htmlTable()");
    System.out.println();
    test2D = new int[][]{{1,2},{3}};
    System.out.println("Expected: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>, Received: " + htmlTable(test2D));
    System.out.println();
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String returnedString = "[";
    for(int i = 0; i < ary.length; i++){
        if(i < ary.length - 1){
            returnedString = returnedString + ary[i] + ", ";
        }
        else{
            returnedString = returnedString + ary[i];
        }
    }
    return returnedString + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
    for(int i = 0; i < ary.length; i++){
        // Use the arrToString for 1D arrays to handle each row
        result += arrToString(ary[i]);
        if (i < ary.length - 1) {
            result += ", "; // Add comma and space between arrays
        }
    }
    result += "]";
    return result;
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    // Use nested loops to go through each element in the 2D array
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            if (nums[i][j] == 0)
              count += 1; // Add each element to the sum
        }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    // Use nested loops to go through each element in the 2D array
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            sum += nums[i][j]; // Add each element to the sum
        }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int row = 0; row < vals.length; row++) {
        for (int col = 0; col < vals[row].length; col++) {
            if (vals[row][col] < 0) {
                if (row == col) {
                    vals[row][col] = 1;  // Replace with 1 if it's a diagonal element.
                } else {
                    vals[row][col] = 0;  // Replace with 0 otherwise.
                }
            }
        }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] copiedArray = new int[nums.length][]; // Create an array of rows.
    for (int row = 0; row < nums.length; row++) {
        copiedArray[row] = new int[nums[row].length]; // Create each row with appropriate size.
        for (int col = 0; col < nums[row].length; col++) {
            copiedArray[row][col] = nums[row][col]; // Copy each element manually.
        }
    }
    return copiedArray;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int rowCount = nums.length;
    int colCount = nums[0].length;
    int[][] swapped = new int[colCount][rowCount]; // Create a new array with swapped dimensions
    for (int i = 0; i < rowCount; i++){
        for (int j = 0; j < colCount; j++){
            swapped[j][i] = nums[i][j]; // Swap rows and columns
        }
    }
    return swapped;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int row = 0; row < nums.length; row++){
      result += "<tr>";
      for (int col = 0; col < nums[row].length; col++){
        result += "<td>" + nums[row][col] + "</td>";
      }
      result += "</tr>";
    }
    result += "</table>";
    return result;
  }
}
