import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
          if(arr[i]==arr[n/2])
            count++;
        }
        System.out.println(count>n/2?arr[n/2]:-1);
      }
    }
  }