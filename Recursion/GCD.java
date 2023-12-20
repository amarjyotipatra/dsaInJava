import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(GCD(n,p));
      }
    }
    private static int GCD(int n,int p){
      if(p==0)
        return n;
      else
        return GCD(p,n%p);
    }
  }