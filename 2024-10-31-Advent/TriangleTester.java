public class TriangleTester{
  public static void main(String[] args){
    countTrianglesA("inputTri.txt")
  }
  public static int countTrianglesA(String filename){
    File file = new File(filename);
    Scanner input = new Scanner(file);
    int count = 0;
    while (input.hasNextLine){
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
      if(triangleTest(a,b,c))
        count++;
    }
  }
  public static boolean triangleTest(int a, int b, int c){
    if ((a + b > c)&&(a + c > b)&&(b + c > a))
      return true;
    return false;
  }
}
