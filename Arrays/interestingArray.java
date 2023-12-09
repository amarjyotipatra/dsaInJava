import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      while(T!=0){
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
          arr[i]=sc.nextInt();
        }
        int count=0;
        int K=sc.nextInt();
           int flag=0;
        int start = 0, end = N-1;
        while(start<end) {
          if(arr[start] + arr[end] == K){
           System.out.println(start+" "+end);
           flag=1;
            break;
          } else if((arr[start] + arr[end]) < K){
            start++;
          } else {
            end--;
          }
        }
        if(flag!=1){
          System.out.println("no answer");
        }
        T--;
      }
    }
  }