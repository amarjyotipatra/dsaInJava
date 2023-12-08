import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        
        for (int t = 0; t < testcase; t++) {
            int N = sc.nextInt();
            int count=0;
            String greater="";
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for(int j=0;j<N;j++){
              if(j==0){
                 if(arr[j]>arr[j+1]){
                   count+=1;
                   greater+=j+" ";
                 }
              }else if(j==N-1){
                if(arr[j]>arr[j-1]){
                   count+=1;
                   greater+=j+" ";
                }
              }
              else{
                if(arr[j]>arr[j-1] && arr[j]>arr[j+1]){
                  count+=1;
                  greater+=j+" ";
                }
              }
            }
            if(count==0)
            System.out.println(-1);
            else
            System.out.println(greater);
        }
    }
  }