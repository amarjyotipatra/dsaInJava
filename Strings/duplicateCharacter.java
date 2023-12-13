import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
      String s=sc.nextLine();
      int freq[]=new int[26];
      int flag=0;
      String output="";
      for(int i=0;i<s.length();i++)
         freq[s.charAt(i)-'a']++;
      for(int i=0;i<26;i++){
        if(freq[i]>1){
          flag=1;
          output+=((char)(i+'a'))+"="+freq[i]+" ";
        }
      }
      if(flag==0)
         System.out.println(-1);
      else
         System.out.println(output);
    }
  }
}