import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
     Scanner sc=new Scanner(System.in);
     int X=sc.nextInt();
     int Y=sc.nextInt();
     if(X<Y)
        System.out.println(X+" is smaller than "+Y);
     else if(X>Y)
        System.out.println(X+" is greater than "+Y);
     else
       System.out.println(X+" is equal to "+Y);
    }
  }