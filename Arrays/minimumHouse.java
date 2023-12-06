import java.util.*;
  import java.io.*;
  import java.lang.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int i=0;i<testcase;i++){
       int N=sc.nextInt();
       int minRent=0;
       int[] arr=new int[N];
       for(int j=0;j<arr.length; j++){
         arr[j]=sc.nextInt();
         if(j>0 && arr[j]<arr[j-1])
              minRent=j;
       }
       System.out.println(minRent);
      }
    }
  }