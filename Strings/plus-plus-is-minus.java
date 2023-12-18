import java.util.*;
  import java.io.*;

  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
       Scanner sc=new Scanner(System.in);
             int T=sc.nextInt();
             while(T-->0){
                 int flag=0;
                 String s=sc.next();
                 String t=sc.next();
                 int i=0;
                 int j=0;
                 while(i<s.length()&&j<t.length()){
                     if(s.charAt(i)!=t.charAt(j)){
                         if(s.charAt(i)=='+' &&t.charAt(j)=='-'){
                         System.out.println("NO");
                         flag=1;
                         break;
                     }
                         
                     else if(s.charAt(i)=='-'&& s.charAt(i+1)=='-'&& t.charAt(j)=='+'){
                         i++;
                     }
                     }   
                 i++;
                 j++;
             }
              if(flag==0){
                  if(i!=s.length()||j!=t.length()){
                      System.out.println("NO");
                  }else{
                      System.out.println("YES");
                  }
             }          
        }
    }
  }