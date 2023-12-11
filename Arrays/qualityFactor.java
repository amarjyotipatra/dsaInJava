import java.util.*;
  import java.io.*;
  import java.lang.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
         Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long arr [] = new long [n];
      
      for (int i=0; i<n; i++){
         arr[i] = sc.nextLong();
      }
      
      //output
      
      long steps = Math.abs(arr[0]);//the first bag can also have -ve value
      
      for (int i=1; i<n; i++){
        
        steps += Math.abs(arr[i] - arr[i-1]);
        
      }
      
      System.out.println(steps);
    }
  }