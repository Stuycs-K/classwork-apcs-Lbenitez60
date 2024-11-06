import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class TriangleTester{
  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }
  public static int countTrianglesA(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      while (input.hasNextInt()){
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(triangleTest(a,b,c))
          count++;
      }
      return count;
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0;
    }
  }
  public static int countTrianglesB(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      ArrayList<Integer> numlist = new ArrayList<Integer>();
      while(input.hasNextInt()){
        numlist.add(input.nextInt());
      }
      int count = 0;
      for (int i = 0; i < numlist.size(); i+=9){
        for (int j = i; j < i + 3; j ++){
          if (triangleTest(numlist.get(j),numlist.get(j+3),numlist.get(j+6)))
            count++;
        }
      }
      return count;
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0;
    }
  }
  public static boolean triangleTest(int a, int b, int c){
    if ((a + b > c)&&(a + c > b)&&(b + c > a))
      return true;
    return false;
  }
}
