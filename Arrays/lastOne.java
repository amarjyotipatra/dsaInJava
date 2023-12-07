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
       for(int j=0;j<N;j++){
         arr[j]=sc.nextInt();
       }
       int lastIndex=-1;
       for(int k=N-1;k>=0;k--){
         if(arr[k]==1 && lastIndex==-1){
           lastIndex=k;
         }
       }
       System.out.println(lastIndex);
      }
    }