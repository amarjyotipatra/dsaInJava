import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      while(testcase!=0){
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int j=0;j<N;j++){
          arr[j]=sc.nextInt();
        }
        int max=arr[N-1];
        System.out.print(max+" ");
        for(int i=N-2;i>=0;i--){
            if(arr[i]>=max){
              max=arr[i];      
          System.out.print(max+" ");
            }
        }
        System.out.println();
        testcase--;
      }
    }
  }