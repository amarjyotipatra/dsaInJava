import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
      Arrays.sort(arr);
      System.out.print(arr[n/2]);
    }
  }