import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
       Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     String sum="";
     while(num>0){
       sum+= num%10;
       num /=10;
     }
     System.out.println(Integer.parseInt(sum));
    }
  }