import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(n%2!=0 ? arr[n/2] : arr[n/2-1]);
      }
    }
  }