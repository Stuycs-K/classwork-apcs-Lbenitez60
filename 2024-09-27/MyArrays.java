public class MyArrays{
  public static void main(String[] args){
    System.out.println("----------------------");
    System.out.println("Testing for returnCopy");
    System.out.println("----------------------");
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
    System.out.println("-----------------------");
    System.out.println("Testing for concatArray");
    System.out.println("-----------------------");
    for (int i = 0; i < 10; i++) {
        int[] ary1 = {i, i + 1, i + 2};
        int[] ary2 = {i + 3, i + 4, i + 5};
        int[] result = concatArray(ary1, ary2);
        System.out.println("Correct length: " + (result.length == ary1.length + ary2.length));
        boolean contentsMatch = true;
        for (int j = 0; j < ary1.length; j++) {
            if (result[j] != ary1[j]) {
                contentsMatch = false;
            }
        }
        for (int j = 0; j < ary2.length; j++) {
            if (result[ary1.length + j] != ary2[j]) {
                contentsMatch = false;
            }
        }
        System.out.println("Array contents match: " + contentsMatch);
        System.out.println("ary1: " + arrayToString(ary1));
        System.out.println("ary2: " + arrayToString(ary2));
        System.out.println("result: " + arrayToString(result));
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
  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] result = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) {
        result[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++) {
        result[ary1.length + i] = ary2[i];
    }
    return result;
  }
}
