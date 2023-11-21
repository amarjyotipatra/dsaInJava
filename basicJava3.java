import java.util.*;
import java.io.*;
import java.text.*;
  
  public class Main {
    private static final DecimalFormat refac=new DecimalFormat("0.00");
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      double N=sc.nextDouble();
      System.out.print(refac.format(N));
    }
  }
