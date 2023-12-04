import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int i=0;i<testcase;i++){
        int seat=sc.nextInt();
        int berth=seat%8;
        int div=seat/8;
        int num=div*8+berth;
        if(berth==1)
            System.out.println(num+3+"LB");
        else if(berth==2)
            System.out.println(num+3+"MB");
        else if(berth==3)
            System.out.println(num+3+"UB");
        else if(berth==4)
            System.out.println(num-3+"LB");
        else if(berth==5)
            System.out.println(num-3+"MB");
        else if(berth==6)
            System.out.println(num-3+"UB");
        else if(berth==7)
            System.out.println(num+1+"SU");
        else
            System.out.println(num-1+"SL");
      }
    }
  }