import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
     Scanner sc=new Scanner(System.in);
     int testcase=sc.nextInt();
     for(int i=0;i<testcase;i++){
       int num=sc.nextInt();
       int sum=0;
       for(int j=1;j<=num/2;j++){
         if(num%j==0)
           sum+=j;
       }
       if(sum==num)
           System.out.println(true);
        else
           System.out.println(false);
     }
    }
  }