Good Number
My Submissions
Time Submitted	Submission ID	Status	Runtime	Memory
7/6/2023 11:51 AM	53020613		0.21	48096
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int a=0;a<testcase;a++){
        long N=sc.nextLong();
        long k=1,p=3;
        while(k<N){
          k+=p;
          p*=3;
        }
        while(p>=1){
          if(k-p>=N){
            k-=p;
          }
          p/=3;
        }
        System.out.println(k);
      }
    }
  }