import java.util.Arrays;
public class Recursion{
  public static void main(String[] args) {
    // System.out.println(fib(Integer.parseInt(args[0])));
    makeWords(3,"","abc");
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
    else{
      String[] alpList = alphabet.split("");
      for(int i = 0; i < alpList.length; i++){
        makeWords(remainingLetters-1,result+alpList[i],alphabet);
      }
    }
  }
}
