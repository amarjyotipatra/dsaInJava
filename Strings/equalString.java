import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
          int n=sc.nextInt();
         
          String arr[]=new String[n]; 
          for(int i=0;i<n;i++)
          arr[i]=sc.next();
          System.out.println(Minimum(arr,n));
      }
    }
    static int Minimum(String arr[],int n){
      int min=Integer.MAX_VALUE;
      for(int i=0;i<n;i++){
        int count=0;
        String t="";
        for(int j=0;j<n;j++){
          t=arr[j]+arr[j];
          int index=t.indexOf(arr[i]);
          if(index==-1)
            return -1;
          else
            count+=index;
            
        }
        min=Math.min(count,min);
      }
      return min;
    }
  }