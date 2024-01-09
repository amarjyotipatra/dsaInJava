import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(),k=sc.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
     System.out.println(mergeSortAndCount(arr,0,n-1,k));
    }
    static int mergeSortAndCount(int[] arr,int low,int high,int k){
        if(low<high){
         int mid = low + (high-low)/2;
         int count = 0;
          count+=mergeSortAndCount(arr,low,mid,k);
          count+=mergeSortAndCount(arr,mid+1,high,k);
          count+=mergeAndCount(arr,low,mid,high,k);
          return count;
        }
        return 0;
    }
    static int mergeAndCount(int[] arr,int low,int mid,int high,int v){
      int n1 = mid-low+1,n2=high-mid;
      
      int[] left = new int[n1];
      for(int i=0;i<n1;i++)
       left[i] = arr[low+i];
      
      int[] right = new int[n2];
      for(int i=0;i<n2;i++)
       right[i]=arr[i+mid+1];
       
      int k = low;
      int i=0,j=0;
      int count = 0;
      
      
      while(i<n1 && j<n2){
          if(left[i]>right[j]){
              int m = i;
              while(m<n1 && left[m]<=right[j]*v)
                m++;
              count += n1-m;
          
              arr[k++] = right[j++];
          }
          else
           arr[k++] = left[i++];
      }
      while(i<n1)
       arr[k++] = left[i++];
      
      while(j<n2)
       arr[k++] = right[j++];
      return count;
}
}