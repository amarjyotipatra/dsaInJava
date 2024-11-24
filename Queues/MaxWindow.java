import java.util.*;
  import java.io.*;
  
  public class MaxWindow {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(int i=0;i<=(n-k);i++){
        int num=arr[i];
        for(int j=i;j<(i+k);j++){
          if(arr[j]>num)
            num=arr[j];
        }
        System.out.print(num+" ");
      }
    }
  }

//   Find Max in Window
// Finding a maximum element in an array must be an easy task for you by now. Let's make it a bit tricky. So, you are given an array 
// A
//  and an integer 
// K
// , you have to find the max element in all the contiguous subarray of size 
// K
// .

// Input format
// The input consists of two lines.
// The first line contains two integers, 
// N
//  denoting the size of the array and 
// K
//  denoting the size of the window.
// The second line contains 
// N
//  space-separated integers 
// A
// [
// i
// ]
// , denoting elements of the array.

// Output format
// The output contains maximum elements of all windows of size 
// K
//  in the array.

// Constraints
// 1
// <=
// N
// <=
// 10
// 7

// 1
// <=
// K
// <=
// N

// 0
// <=
// A
// [
// i
// ]
// <=
// 10
// 7

// Time Limit
// 1 second

// Example
// Input
// 7 3
// 12 1 78 90 57 89 56

// Output
// 78 90 90 90 89