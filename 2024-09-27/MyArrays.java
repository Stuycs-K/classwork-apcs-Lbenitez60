public class MyArrays{
  public static void main(String[] args){
    System.out.println("placeholder")
    int[] ary = {1,9,7};
    int[] ary2 = returnCopy(ary);
    ary[0] = 7;
    System.out.println(ary==ary2)
    System.out.println(arrayToString(ary).equals(arrayToString(ary2)))
  }
  public static int[] returnCopy(int[] ary){

  }
}
