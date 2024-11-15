import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    System.out.println(ArrayListPractice.createRandomArray(10));
    ArrayList<String> a1 = ArrayListPractice.createRandomArray(10);
    System.out.println(a1);
    ArrayListPractice.replaceEmpty(a1);
    System.out.println(a1);
    System.out.println(ArrayListPractice.makeReversedList(a1));
    ArrayList<String> a2 = ArrayListPractice.createRandomArray(10);
    ArrayList<String> a3 = ArrayListPractice.createRandomArray(14);
    System.out.println(a2);
    System.out.println(a3);
    System.out.println(ArrayListPractice.mixLists(a2,a3));
  }
}
