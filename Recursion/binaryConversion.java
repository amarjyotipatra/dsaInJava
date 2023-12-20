import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        arr[0]=0;
        Binary(n,1,arr);
        arr[0]=1;
        Binary(n,1,arr);
      }
    }
    static void Binary(int n,int k,int a[]){
      if(k==n){
        for(int i=0;i<n;i++)
          System.out.print(a[i]);
        System.out.println();
        return;
      }
      if(a[k-1]==0){
        a[k]=0;
        Binary(n,k+1,a);
        a[k]=1;
        Binary(n,k+1,a);
      }
      else{
       a[k]=0;
       Binary(n,k+1,a);
      }
    }
  }