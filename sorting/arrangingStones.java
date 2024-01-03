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

        int left=0,right=n-1;

        Merge(arr,left,right);

        for (int i = 0; i < n; i++)

          System.out.print(arr[i] + " ");

        System.out.println();

      }

    }

    static void Merge(int arr[],int left,int right){

      if(left>=right)

         return;

      int mid=left+(right-left)/2;

      Merge(arr,left,mid);

      Merge(arr,mid+1,right);

      MergeSort(arr,left,right,mid);

    }

    static void MergeSort(int arr[],int left,int right,int mid){

      int n1=mid-left+1,n2=right-mid;

      int leftArr[]=new int[n1];

      for(int i=0;i<n1;i++)

        leftArr[i]=arr[left+i];

      int rightArr[]=new int[n2];

      for(int i=0;i<n2;i++)

        rightArr[i]=arr[mid+i+1];

      int i=0,j=0,k=left;

      while(i<n1 && j<n2){

        if(leftArr[i]<=rightArr[j])

         arr[k++]=leftArr[i++];

        else arr[k++]=rightArr[j++];

      }

      while(i<n1)

       arr[k++]=leftArr[i++];

      while(j<n2)

       arr[k++]=rightArr[j++];

    }

  }