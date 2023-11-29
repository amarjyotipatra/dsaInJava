import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int i=0;i<testcase;i++){
        int num=sc.nextInt();
            if (num % 10 == 0) {
                System.out.println(0);
            } else if (num % 10 == 5) {
                System.out.println(1);
            } else {
                    System.out.println(-1);
            }
      }
      
    }
  }