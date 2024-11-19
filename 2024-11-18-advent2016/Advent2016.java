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
    ArrayList<String> steps = read("puzzleInput.txt");
    for (int i = 0; i < steps.size()-1; i ++){
      steps.set(i,steps.get(i).substring(0,steps.get(i).length()-1));
    }
    int x=0,y=0,dir=0;
    int[][]offset={{0,1},{1,0},{0,-1},{-1,0}};
    for (int i=0; i < steps.size();i++){
      if (steps.get(i).substring(0,1).equals("L"))
        dir=(dir-1)%4;
      if (steps.get(i).substring(0,1).equals("R"))
        dir=(dir+1)%4;
      if (dir<0) dir += 4;
      System.out.println("dir:"+dir);
      int dis = Integer.parseInt(steps.get(i).substring(1));
      System.out.println("dis"+dis);
      x += offset[dir][0] * dis;
      y += offset[dir][1] * dis;
      System.out.println("x:"+x);
      System.out.println("y:"+y);
    }
    return Math.abs(x)+Math.abs(y);
  }
}
