Sum of Digits
My Submissions
Time Submitted	Submission ID	Status	Runtime	Memory
23/7/2023 12:24 PM	53719329		0.83	118652
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t--!=0){
        int n=sc.nextInt();
        System.out.println(Sum(n));
      }
      
    }
    private static int Sum(int n){
      if(n<10)
        return n;
      else{
        int dig=n%10;
        int rem=n/10;
        return dig+Sum(rem);
      }
    }
  }