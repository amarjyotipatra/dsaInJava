import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t--!=0){
        int n=sc.nextInt();
        pattern(n);
        System.out.println();
      }
    }
    private static void pattern(int n){
      System.out.print(n+" ");
      if(n<=0)
        return;
      pattern(n-5);
      System.out.print(n+" ");
    }
  }