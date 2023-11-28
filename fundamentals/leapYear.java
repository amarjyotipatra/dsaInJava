import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int i=0;i<testcase;i++){
        int num=sc.nextInt();
        if (num % 400 == 0 || (num % 4 == 0 && num % 100 != 0))
          System.out.println("Yes");
        else 
          System.out.println("No");
      }
      
    }
  }