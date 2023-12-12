import java.util.*;
  import java.io.*;
  import java.lang.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int time[]=new int[n];
        for(int i=0;i<n;i++)
          time[i]=sc.nextInt();
        if(time.length==0){
          System.out.println(0);
        }
        else{
        int totalTime=0; 
        for(int i=0;i<n-1;i++){
            totalTime+=Math.min(time[i+1]-time[i],k);
          }
          System.out.println(totalTime+k);
        }
        t--;
      }
    }
  }