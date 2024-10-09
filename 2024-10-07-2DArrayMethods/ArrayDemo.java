import java.util.Arrays;
public class ArrayDemo {
  public static void main(String[] args) {
      // 1D and 2D array examples
      int[] oneDArray = {1, 2, 3, 4, 5};
      int[][] twoDArray = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 0}
      };

      int[][] twoDArrayWithNegatives = {
          {-1, -2, -3},
          {-4, -5, -6},
          {-7, -8, 0}
      };

      int[][] twoDArrayForCopy = {
          {10, 20, 30},
          {40, 50, 60}
      };

      // Test for arrToString (1D array)
      System.out.println("Testing arrToString (1D array):");
      String expected1D = "[1, 2, 3, 4, 5]";
      String result1D = arrToString(oneDArray);
      System.out.println("expected: " + expected1D + ", got: " + result1D);
      System.out.println(expected1D.equals(result1D));  // Boolean test case

      // Test for arrToString (2D array)
      System.out.println("\nTesting arrToString (2D array):");
      String expected2D = "[[1, 2, 3], [4, 5, 6], [7, 8, 0]]";
      String result2D = arrToString(twoDArray);
      System.out.println("expected: " + expected2D + ", got: " + result2D);
      System.out.println(expected2D.equals(result2D));  // Boolean test case

      // Test for countZeros2D
      System.out.println("\nTesting countZeros2D:");
      int expectedCountZeros = 1;
      int resultCountZeros = countZeros2D(twoDArray);
      System.out.println("expected: " + expectedCountZeros + ", got: " + resultCountZeros);
      System.out.println(expectedCountZeros == resultCountZeros);  // Boolean test case

      // Test for arr2DSum
      System.out.println("\nTesting arr2DSum:");
      int expectedSum = 36;
      int resultSum = arr2DSum(twoDArray);
      System.out.println("expected: " + expectedSum + ", got: " + resultSum);
      System.out.println(expectedSum == resultSum);  // Boolean test case

      // Test for replaceNegative
      System.out.println("\nTesting replaceNegative:");
      String expectedReplaceNegative = "[[1, 0, 0], [0, 1, 0], [0, 0, 0]]";
      replaceNegative(twoDArrayWithNegatives);
      String resultReplaceNegative = arrToString(twoDArrayWithNegatives);
      System.out.println("expected: " + expectedReplaceNegative + ", got: " + resultReplaceNegative);
      System.out.println(expectedReplaceNegative.equals(resultReplaceNegative));  // Boolean test case

      // Test for copy
      System.out.println("\nTesting copy:");
      String expectedCopy = "[[10, 20, 30], [40, 50, 60]]";
      int[][] copiedArray = copy(twoDArrayForCopy);
      String resultCopy = arrToString(copiedArray);
      System.out.println("expected: " + expectedCopy + ", got: " + resultCopy);
      System.out.println(expectedCopy.equals(resultCopy));  // Boolean test case
      copiedArray[0][0] = 100; // Modify the copy
      System.out.println("Modifying copy. Original should not change.");
      String resultOriginalAfterCopy = arrToString(twoDArrayForCopy);
      System.out.println("expected: " + expectedCopy + ", got: " + resultOriginalAfterCopy);
      System.out.println(expectedCopy.equals(resultOriginalAfterCopy));  // Boolean test case to ensure original unchanged

      // Test for swapRC
      System.out.println("\nTesting swapRC:");
      String expectedSwapRC = "[[1, 4, 7], [2, 5, 8], [3, 6, 0]]";
      int[][] swappedArray = swapRC(twoDArray);
      String resultSwapRC = arrToString(swappedArray);
      System.out.println("expected: " + expectedSwapRC + ", got: " + resultSwapRC);
      System.out.println(expectedSwapRC.equals(resultSwapRC));  // Boolean test case

      // Test for htmlTable
      System.out.println("\nTesting htmlTable:");
      String expectedHtmlTable = "<table><tr><td>1</td><td>2</td><td>3</td></tr><tr><td>4</td><td>5</td><td>6</td></tr><tr><td>7</td><td>8</td><td>0</td></tr></table>";
      String resultHtmlTable = htmlTable(twoDArray);
      System.out.println("expected: " + expectedHtmlTable + ", got: " + resultHtmlTable);
      System.out.println(expectedHtmlTable.equals(resultHtmlTable));  // Boolean test case
  }

    public static String arrToString(int[] ary) {
        String returnedString = "[";
        for (int i = 0; i < ary.length; i++) {
            if (i < ary.length - 1) {
                returnedString = returnedString + ary[i] + ", ";
            } else {
                returnedString = returnedString + ary[i];
            }
        }
        return returnedString + "]";
    }

    public static String arrToString(int[][] ary) {
        String result = "[";
        for (int i = 0; i < ary.length; i++) {
            result += arrToString(ary[i]);
            if (i < ary.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public static int countZeros2D(int[][] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 0)
                    count += 1;
            }
        }
        return count;
    }

    public static int arr2DSum(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        return sum;
    }

    public static void replaceNegative(int[][] vals) {
        for (int row = 0; row < vals.length; row++) {
            for (int col = 0; col < vals[row].length; col++) {
                if (vals[row][col] < 0) {
                    if (row == col) {
                        vals[row][col] = 1;
                    } else {
                        vals[row][col] = 0;
                    }
                }
            }
        }
    }

    public static int[][] copy(int[][] nums) {
        int[][] copiedArray = new int[nums.length][];
        for (int row = 0; row < nums.length; row++) {
            copiedArray[row] = new int[nums[row].length];
            for (int col = 0; col < nums[row].length; col++) {
                copiedArray[row][col] = nums[row][col];
            }
        }
        return copiedArray;
    }

    public static int[][] swapRC(int[][] nums) {
        int rowCount = nums.length;
        int colCount = nums[0].length;
        int[][] swapped = new int[colCount][rowCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                swapped[j][i] = nums[i][j];
            }
        }
        return swapped;
    }

    public static String htmlTable(int[][] nums) {
        String result = "<table>";
        for (int row = 0; row < nums.length; row++) {
            result += "<tr>";
            for (int col = 0; col < nums[row].length; col++) {
                result += "<td>" + nums[row][col] + "</td>";
            }
            result += "</tr>";
        }
        result += "</table>";
        return result;
    }
}
