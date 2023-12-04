import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    int space=8;
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
     for(int k=1;k<=space;k++){
      System.out.print(" ");
    }
     space -=2;
     for(int j=i;j>=1;j--){
       System.out.print(j);
     }
    System.out.println();
    }
    }
  }