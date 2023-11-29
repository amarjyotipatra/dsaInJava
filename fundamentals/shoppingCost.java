import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
  public static void main(String args[]) throws IOException {
    //write your code here
    Scanner sc=new Scanner(System.in);
    // DecimalFormat df=new DecimalFormat("#.#");
    int testcase=sc.nextInt();
    for(int i=0;i<testcase;i++){
      int quantity=sc.nextInt();
      int price=sc.nextInt();
      if(quantity > 100) {
        System.out.println((float)(quantity*price*0.8));
      }else
        System.out.println((float)(quantity*price));
    }
  }
}