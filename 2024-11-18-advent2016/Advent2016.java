import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class Advent2016{
  public static void main (String[] args){
    System.out.println("Day1.1: "+day1(0));
    System.out.println("Day1.2: "+day1(1));
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

  public static int day2(int p){
    int[][] keypad = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    ArrayList<String> steps = read("puzzleInput.txt");
    return 0;
  }




  public static int day1(int p){
    ArrayList<String> steps = read("d1input.txt");
    for (int i = 0; i < steps.size()-1; i ++){
      steps.set(i,steps.get(i).substring(0,steps.get(i).length()-1));
    }
    int x=0,y=0,dir=0;
    int[][]offset={{0,1},{1,0},{0,-1},{-1,0}};
    // int[][] locations = new int[10000][2];
    ArrayList<int[]> locations= new ArrayList<int[]>();
    int count = 0;
    for (int i=0; i < steps.size();i++){
      if (steps.get(i).substring(0,1).equals("L"))
        dir=(dir-1)%4;
      if (steps.get(i).substring(0,1).equals("R"))
        dir=(dir+1)%4;
      if (dir<0) dir += 4;
      int dis = Integer.parseInt(steps.get(i).substring(1));
      //x += offset[dir][0] * dis;
      for (int j = 0; j < dis; j ++){
        x+=offset[dir][0];
        y+=offset[dir][1];
        for (int k = 0; k < count; k++){
          if (x==locations.get(k)[0]&&y==locations.get(k)[1]&&p==1){
            return Math.abs(x)+Math.abs(y);
          }
        }
        locations.add(new int[] {x,y});
        count++;
      }
    }
    return Math.abs(x)+Math.abs(y);
  }
}
