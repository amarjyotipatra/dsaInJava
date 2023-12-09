import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      while(T!=0){
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
          arr1[i]=arr[i]+i;
          arr2[i]=arr[i]-i;
        }
        int ans1,ans2;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ans1=arr1[n-1]-arr1[0];
        ans2=arr2[n-1]-arr2[0];
        int max = (ans1 > ans2) ? ans1 : ans2;
        System.out.println(max);
        T--;
      }
    }
  }