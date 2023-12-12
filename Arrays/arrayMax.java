import java.util.*;
  import java.io.*;
  import java.lang.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t>0){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
        int large=0;
        for(int i=0;i<n;i++){
          int sum = 0;
          int temp=0;
          int j=i;
          while(j<n){
            sum+=arr[j];
            if(sum<0)
            sum=0;
            temp=Math.max(temp,sum);
            j+=k;
        }
        large=Math.max(temp,large);
        }
        System.out.println(large);
        t--;
      }
    }
  }