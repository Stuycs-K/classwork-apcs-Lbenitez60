public class Recursion{
  public static void main(String[] args) {
    System.out.println(fib(Integer.parseInt(args[0])));
  }
  public static int fib(int n){
    if(n<2)
      return n;
    else
      return fib(n-1)+fib(n-2);
  }
}
