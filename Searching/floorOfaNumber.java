import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        int index=-1;
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          if(arr[i]<=x){
            index=i;
          }
        }
        System.out.println(index);
      }
    }
  }