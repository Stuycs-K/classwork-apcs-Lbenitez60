import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
public class Advent2016{
  public static void main (String[] args){
    System.out.println(day1());
  }
  public static ArrayList<String> read(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      ArrayList<String> result = new ArrayList<String>(0);
      while (input.hasNext()){
        result.add(input.next());
      }
      input.close();
      return result;
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return new ArrayList<String>();
    }
  }
  public static int day1(){
    ArrayList<String> steps = read("puzzleinput.txt");
    for (int i = 0; i < steps.size(); i ++){
      
    }
    return 0;
  }
}
