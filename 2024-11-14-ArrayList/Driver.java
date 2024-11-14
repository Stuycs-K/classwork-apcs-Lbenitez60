import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    System.out.println(ArrayListPractice.createRandomArray(10));
    ArrayList<String> a1 = ArrayListPractice.createRandomArray(10);
    System.out.println(a1);
    ArrayListPractice.replaceEmpty(a1);
    System.out.println(a1);
    System.out.println(ArrayListPractice.makeReversedList(a1));
  }
}
