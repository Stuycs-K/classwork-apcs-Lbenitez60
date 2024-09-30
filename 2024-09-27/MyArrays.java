public class MyArrays{
  public static void main(String[] args){
    System.out.println("Testing for returnCopy");
    for (int i = 0; i < 10; i++) {
        int[] ary = {i, i + 1, i + 2};
        int[] ary2 = returnCopy(ary);
        // Test if they are the same array (should be false)
        System.out.println("Same array (reference equality): " + (ary == ary2));
        // Test if their contents match (should be true initially)
        System.out.println("Array contents match: " + arrayToString(ary).equals(arrayToString(ary2)));
        // Modify ary and test if the contents still match (should be false after modification)
        ary[0] = ary[0] + 1;
        System.out.println("Array contents are not syncing: " + !arrayToString(ary).equals(arrayToString(ary2)));
        // Print both arrays for visual comparison
        System.out.println("ary: " + arrayToString(ary) + " vs ary2: " + arrayToString(ary2));
    }
  }
  public static int[] returnCopy(int[] ary){
    int[] result;
    result = new int[ary.length];
    for (int i = 0; i < ary.length; i ++){
      result[i] = ary[i];
    }
    return result;
  }
  public static String arrayToString(int[] nums){
    String result = "[";
    for (int i = 0; i < nums.length; i++){
      result += nums[i];
      if (i < nums.length - 1) result += ", ";
    }
    result += "]";
    return result;
  }
}
