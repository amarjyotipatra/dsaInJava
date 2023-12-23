import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
       Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=1;
        int h=0;
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          if(i>0 && arr[i]>arr[h]){
            count++;
            h=i;
          }
        }
        System.out.println(count);
      }
    }
  }