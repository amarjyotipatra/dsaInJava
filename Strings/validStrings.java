import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        String s=sc.next();
        String isValid="No";
        int count=0,countBr=0;
        if(s.length()%2 != 0){
          isValid="No";
        }else{
          for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
              count++;
            else if(s.charAt(i)==')')
              count--;
            if(countBr<count)
              countBr=countBr;
            else 
              countBr=count ;
          }
          if(countBr<-1 || count>0)
             isValid="No";
          else
             isValid="Yes";
        }
        System.out.println(isValid);
      }
    }
  }