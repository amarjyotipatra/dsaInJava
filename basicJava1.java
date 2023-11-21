import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc =new Scanner(System.in);
      int a=sc.nextInt();
      float floNum=sc.nextFloat();
      String b=String.format("%.2f",floNum);
      String c=sc.next();
      System.out.print(a+"$"+b+"$"+c);
    }
  }
