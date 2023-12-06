import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] arr=new int[size];
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      for(int el:arr){
        if(el%2==0)
            System.out.print(el+" ");
      }
      System.out.println();
        for(int el:arr){
        if(el%2!=0)
            System.out.print(el+" ");
      }
    }
  }