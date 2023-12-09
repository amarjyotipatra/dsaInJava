import java.util.*;
import java.io.*;
import java.lang.Math;


public class Main {
  static int solve(int arr[],int n,int start)
  {
    int res = 0;
    for(int i=start;i<n;i+=2)
    {
      int to = arr[i];
      if(i>0)
      // make sure current element is less than its left neighboor
        to = Math.min(to,arr[i-1]-1);
      if(i+1 != n)
      // make sure current element is less than its right neighboor
        to = Math.min(to,arr[i+1]-1);
      // if curr value was decreased to "to", add the difference
      res += arr[i] - to;
    }
    return res;
  }
  public static void main(String args[]) throws IOException {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();


    System.out.println(Math.min(solve(arr,n,0),solve(arr,n,1)));
  }
}