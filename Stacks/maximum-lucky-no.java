import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
         Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0)
     {
    	 int n=sc.nextInt();
    	 int []a=new int[n];
    	 for(int i=0;i<n;i++)
    		 a[i]=sc.nextInt();
    		 
    	 Stack<Integer> s=new Stack<Integer>();
    	 int mx=0;
    	 for(int i=0;i<n;i++)
    	 {