import java.util.*;
  import java.io.*;
  import java.lang.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int i=0;i<testcase;i++){
       int N=sc.nextInt();
       int[] arr=new int[N];
       for(int j=0;j<arr.length ; j++){
         arr[j]=sc.nextInt();
       }
       Arrays.sort(arr);
       System.out.println(arr[0]+" "+arr[N-1]);
      }
    }
  }