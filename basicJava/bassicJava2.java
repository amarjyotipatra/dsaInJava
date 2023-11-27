import java.util.*;
  import java.io.*;
  import java.text.DecimalFormat;
  
  public class Main {
    private static final DecimalFormat defactor=new DecimalFormat("0.00");
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      float N;
      float M;
      N=sc.nextFloat();
      M=sc.nextFloat();
      System.out.print(defactor.format(N)+" "+defactor.format(M));
    }
  }
