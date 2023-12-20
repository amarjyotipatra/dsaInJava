Same String
My Submissions
Time Submitted	Submission ID	Status	Runtime	Memory
24/7/2023 12:56 PM	53730842		0.19	39040
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        String str=sc.next();
        checkString(str,0,str.length()-1);
      }
    }
    static void checkString(String str,int start,int end){
      if(start>=end){
        System.out.println("Yes");
        return;
      }
      if(str.charAt(start)==str.charAt(end))
        checkString(str,start+1,end-1);
      else{
        System.out.println("No");
        return;
      }
      
    }
  }