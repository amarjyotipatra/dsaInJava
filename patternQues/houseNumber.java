import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    for (int i = 1; i <= testcase; i++) {
      long num = sc.nextInt();
      long count = 0;
      for (long j = 1; j <= num; j *= 10) {
        count += (num-j+1);
      }
      System.out.println(count);
    }
  }
}