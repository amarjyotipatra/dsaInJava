import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
           Scanner sc=new Scanner(System.in);
     int testcase=sc.nextInt();
     for(int i=0;i<testcase;i++){
     int num=sc.nextInt();
     int count=0;
     while(num>0){
       if(num % 10 ==5)
           count++;
       num /=10;
     }
     System.out.println(count);
     }
    }
  }