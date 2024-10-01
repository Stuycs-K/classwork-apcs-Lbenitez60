//1. Write both your names + emails at the top of the document as a comment.\
// leonardob29"nycstudents.net Leonardo Benitez
// alexanderc367@nycstudents.net Alexander Chen

//2. Copy your arrToString method from before.
/**Return a String that represents the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public static String arrToString(int[] nums){
    String returnedString = "[";
    for(int i = 0; i < nums.length; i++){
        if(i == nums.length - 1){
            returnedString = returnedString + nums[i];
        }
        else{
            returnedString = returnedString + nums[i] + ", ";
        }
    }
    returnedString = returnedString + "]";
    return returnedString;
}
//3. Write arrToString with a 2D array parameter.
/**Return a String that represents the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  */
public static String arrToString(int[][] ary){
    String result = "[";
    for(int i = 0; i < ary.length; i++){
        result += arrToString(ary[i]);
        if (i < ary.length - 1) {
            result += ", ";
        }
    }
    result += "]";
    return result;
}
//4. Return the sum of all of the values in the 2D array
public static int arr2DSum(int[][] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            sum += nums[i][j];
        }
    }
    return sum;
}
/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][] nums){
    int rowCount = nums.length;
    int colCount = nums[0].length;
    int[][] swapped = new int[colCount][rowCount];
    for (int i = 0; i < rowCount; i++){
        for (int j = 0; j < colCount; j++){
            swapped[j][i] = nums[i][j];
        }
    }
    return swapped;
}
