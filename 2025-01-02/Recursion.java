import java.util.Arrays;
public class Recursion{
  public static void main(String[] args) {
    // System.out.println(fib(Integer.parseInt(args[0])));
    makeWords(0,"","abc");
  }
  public static int fib(int n){
    if(n<2)
      return n;
    else
      return fib(n-1)+fib(n-2);
  }
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if(remainingLetters==0)
      System.out.println(result);
    String[] alpList = alphabet.split("");
    System.out.println(Arrays.toString(alpList));
  }
}
