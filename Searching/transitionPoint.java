Transition Point
My Submissions
Time Submitted	Submission ID	Status	Runtime	Memory
11/8/2023 1:10 PM	54028601		0.15	50588
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
       Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        int index=-1;
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          if(arr[i]==1 && index == -1){
            index=i;
          }
        }
        System.out.println(index);
      }
    }
  }