import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        String s="1";
        pre(s,n,1,0);
        System.out.println();
      }
    }
    
    static void pre(String s,int n,int x,int y){
      if(n==1){
        System.out.print(s+" ");
        return;
      }
      pre(s+'1',n-1,x+1,y);
      if(x>y){
        pre(s+'0',n-1,x,y+1);
      }
    }
  }