import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int box=sc.nextInt();
      int count=0;
      for(int i=0;i<box;i++){
        int toy=sc.nextInt();
        int capacity=sc.nextInt();
        int value=capacity-toy;
        if(value>=2)
          count++;
      }
      System.out.print(count);
    }
  }