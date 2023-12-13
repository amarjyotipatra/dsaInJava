import java.util.*;
import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
        Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        String s=sc.next();
        int n=s.length();
        int l=4,i=0;
        int total=0;
        while(i<n)
        {
          int j=i;
          i=s.indexOf("aman",i);
          if(i!=-1)
          {
            total+=(i-j+1)*(n-i-3);
            i++;
          }
          else
          {
            break;
          }
        }
        System.out.println(total);
      }
    }
  }