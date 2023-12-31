import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
         int start,end;
         for(start=0;start<n-1;start++){
           if(arr[start]>arr[start+1])
             break;
         }
         for(end=n-1;end>0;end--){
           if(arr[end]<arr[end-1])
             break;
         }
         int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
         for(int i=start;i<end;i++){
           if(max<arr[i])
             max=arr[i];
            if(min>arr[i])
             min=arr[i];
         }
         for(int i=0;i<start;i++){
           if(arr[i]>min)
              start=i;
         }
         for(int i=end;i<n;i++){
           if(arr[i]<max)
             end=i;
         }
         System.out.println(start+" "+end);
      }
    }
  }