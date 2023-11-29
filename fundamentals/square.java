import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int i=0;i<testcase;i++){
        int len=sc.nextInt();
        int bredth=sc.nextInt();
        int area=len*bredth;
        System.out.println(area/2);
      }
    }
  }