import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        System.out.println(Fibonacci(n));
      }
    }
    private static int Fibonacci(int n){
      if(n==0)
        return 0;
      else if(n==1)
        return 1;
      else{
        return Fibonacci(n-1)+Fibonacci(n-2);
      }
    }
  }