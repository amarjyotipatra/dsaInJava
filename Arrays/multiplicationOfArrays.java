import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int i=0;i<testcase;i++){
        int size=sc.nextInt();
        int[] arr=new int[size];
        int mul=1;
        for(int j=0;j<size;j++){
          arr[j]=sc.nextInt();
          mul*=arr[j];
        }
        System.out.println(mul);
      }
      
    }
  }