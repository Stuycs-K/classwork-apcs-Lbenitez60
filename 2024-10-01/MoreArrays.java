public class MoreArrays {
    public static void replaceNegative(int[][] vals) {
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
    public static int[][] copy(int[][] nums) {
        int[][] copiedArray = new int[nums.length][]; // Create an array of rows.
        for (int row = 0; row < nums.length; row++) {
            copiedArray[row] = new int[nums[row].length]; // Create each row with appropriate size.
            for (int col = 0; col < nums[row].length; col++) {
                copiedArray[row][col] = nums[row][col]; // Copy each element manually.
            }
        }
        return copiedArray;
    }
}
