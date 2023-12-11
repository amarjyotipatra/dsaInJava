import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int larr[]=new int[n];
    int rarr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    larr[0]=arr[0];
    for(int i=1;i<n;i++)
      larr[i]=min(arr[i],larr[i-1]);
    rarr[n-1]=arr[n-1];
    for(int j=n-2;j>=0;j--)
      rarr[j]=max(arr[j],rarr[j+1]);
    int i=0;
    int j=0;
    int maxDiff=-1;
    while(i<n && j<n){
      if(larr[i]<rarr[j]){
        maxDiff=max(maxDiff,(j-i));
        j++;
      }else{
        i++;
      }
    }
    System.out.println(maxDiff);
  }
  static int min(int x,int y){
    return x<y?x:y;
  }
  static int max(int x,int y){
    return x>y?x:y;
  }
}