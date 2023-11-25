import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
       Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int i=0;i<testcase;i++){
        int num=sc.nextInt();
        if(num==1){
         System.out.println(2);
        }else{
          System.out.println(num+1);
        }
      }
      
    }
  }