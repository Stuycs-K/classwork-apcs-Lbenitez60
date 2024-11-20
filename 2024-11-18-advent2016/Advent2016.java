import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class Advent2016{
  public static void main (String[] args){
    System.out.println("Day1.1: "+day1(0));
    System.out.println("Day1.2: "+day1(1));
    System.out.println("Day2.1: "+day2(0));
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
    String[] steps = new String[5];
    try{
      File file = new File("d2input.txt");
      Scanner input = new Scanner(file);
      for (int i = 0; input.hasNextLine(); i++){
        steps[i] = input.nextLine();
      }
      int[] cell = new int[]{1,1};//0-2:up-down,,,,0-2:left-right
      String code = "";
      for (int i = 0; i < 5; i ++){
        for(int j = 0; j < steps[i].length(); j++){
          String x = steps[i].substring(j,j+1);
          if (x.equals("U"))
            cell[0]--;
            if (cell[0]<0) cell[0]=0;
          if (x.equals("D"))
            cell[0]++;
            if (cell[0]>2) cell[0]=2;
          if (x.equals("L"))
            cell[1]--;
            if (cell[1]<0) cell[1]=0;
          if (x.equals("R"))
            cell[1]++;
            if (cell[1]>2) cell[1]=2;
        }
        code+=keypad[cell[0]][cell[1]];
      }
      return Integer.parseInt(code);
    }catch(FileNotFoundException ex){
      System.out.println("File not found");
      return 0;
    }
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
