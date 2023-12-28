import java.util.*;
import java.io.*;

public class Main {

  static void merge(long arr[], int start, int mid, int end){
    long left[] = new long[mid-start+1];
    long right[] = new long[end-mid];

    for(int i=start; i<mid+1; i++){
        left[i-start] =  arr[i];
    }
    for(int i=mid+1; i<=end; i++){
        right[i-(mid+1)] = arr[i];
    }
    int leftIndex=0, rightIndex=0, arrIndex=start;
    for( ; leftIndex<=mid-start && rightIndex<end-mid; arrIndex++){
        if(left[leftIndex]<right[rightIndex]){
            arr[arrIndex] = left[leftIndex++];
        }
        else{
            arr[arrIndex] = right[rightIndex++];
        }
    }

    while(leftIndex<=mid-start){
        arr[arrIndex++] = left[leftIndex++];
    }

    while(rightIndex<end-mid){
        arr[arrIndex++] = right[rightIndex++];
    }

  }

  static void mergeSort(long arr[], int start, int end){
      if(end==start)
          return;
      mergeSort(arr,start,(start+end)/2);
      mergeSort(arr,((start+end)/2)+1,end);
      merge(arr,start,(start+end)/2,end);
  }

  public static void main(String args[]) throws IOException {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), k = sc.nextInt();

    int i;
    long arr[] = new long[n+1];
    for(i=1;i<=n;i++)
          arr[i] = sc.nextLong();

    mergeSort(arr,1,n);    
    int mid = (n+1)/2;
    long cnt = 1;
    long moves = 0;
    while(moves <= k && mid <= n-1)
    {
        long diff = arr[mid+1] - arr[mid];
        if(moves + diff*cnt <= k)
        {
            moves += diff*cnt;
            cnt++;
            arr[mid] = arr[mid+1];
            mid++;
        }
        else
            break;
    }
    if(moves <= k)
    {
        long left = k - moves;
        arr[mid] += left/cnt;
    }

      System.out.println(arr[mid]);

  }
}