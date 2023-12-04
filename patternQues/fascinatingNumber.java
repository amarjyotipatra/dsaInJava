import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int j=0;j<testcase;j++){
        int num=sc.nextInt();
        int unique=num+1;
        while(!hasUniqueDigits(unique)){
          unique++;
        }
        System.out.println(unique);
      }
    }
     private static boolean hasUniqueDigits(int number) {
        boolean[] digits = new boolean[10];
        while (number > 0) {
            int digit = number % 10;
            if (digits[digit]) {
                return false;
            }
            digits[digit] = true;
            number /= 10;
        }
        return true;
    }
  }