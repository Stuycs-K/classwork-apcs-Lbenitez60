public class MyArrays{
  public static void main(String[] args){
    System.out.println("placeholder");
    int[] ary = {1,9,7};
    // int[] ary2 = returnCopy(ary);
    // ary[0] = ary[0] + 1;
    // System.out.println(ary==ary2)
    // System.out.println(arrayToString(ary).equals(arrayToString(ary2)))
    // System.out.println(arrayToString(ary) + "vs" + arrayToString(ary2))
    System.out.println(arrayToString(ary));
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
