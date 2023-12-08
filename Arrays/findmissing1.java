import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
       Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      while(T!=0){
        
        int N=sc.nextInt();
        int arr[]=new int[N-1];
        long total=((long)N*(N+1)/2);
        long sum=0;
        for(int i=0;i<N-1;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(total-sum);
        T--;
      }
       
      
    }
  }