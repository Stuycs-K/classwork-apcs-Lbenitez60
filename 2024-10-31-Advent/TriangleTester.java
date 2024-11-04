import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriangleTester{
  public static void main(String[] args){
    countTrianglesA("inputTri.txt");
  }
  public static int countTrianglesA(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      while (input.hasNextLine()){
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
  public static boolean triangleTest(int a, int b, int c){
    if ((a + b > c)&&(a + c > b)&&(b + c > a))
      return true;
    return false;
  }
}
