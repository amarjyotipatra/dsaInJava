import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t =sc.nextInt();
      while(t>0){
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
         if (a == b)
        {
            System.out.println("YES");
        }
 
        else if(a>b && c>0){
          
          System.out.println("NO");
        }
        
        else if(a<b && c<0){
          
          System.out.println("NO");
        }
        else if(c==0)//this case was missing
        {
          System.out.println("NO");
        }
        
        else if(b>a && (b-a) % c==0)
          {
          System.out.println("YES");}
          
          else if (a>b && (a-b) %c ==0)
          {
            System.out.println("YES");
            
          }
          else {
            System.out.println("NO");
          }
          t--;
        }
      
    }
  }