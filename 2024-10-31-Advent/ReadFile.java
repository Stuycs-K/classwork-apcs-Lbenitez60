import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile{
  public static void main(String[] args){
    Scanner sc1 = new Scanner("This is a bunch of words");
    while (sc1.hasNext())
      System.out.println(sc1.next());
    Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
    double sum = 0;
    while(sc2.hasNextDouble())
      sum+=sc2.nextDouble();
    System.out.println(sum);
    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      while (input.hasNextLine())
        System.out.println(input.nextLine());
      input.close();
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        System.out.println(input.nextLine());
        if(input.hasNextLine())input.nextLine();
      }
      input.close();
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        String placeholder = input.nextLine();
        if(placeholder.indexOf("{")>-1)
          System.out.println(placeholder);
        }
        input.close();
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }
}
