import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
             int N=sc.nextInt();
             int ages[]=new int[N];
             for(int i=0;i<N;i++){
                 ages[i]=sc.nextInt();
                 
             }
             int count[]=new int[121];
             for(int i=0;i<N;i++){
                 count[ages[i]]++;
                 
             }
            
             int ans=0;
             for(int A=0;A<=120;A++){
                       int countA=count[A];
                 for(int B=0;B<=120;B++){
                     int countB=count[B];
                     if(B<=0.5*A+7){
                         continue;
                         
                     }else if(B>100&&A<100){
                         continue;
                         
                     }else if(B>A){
                         continue;
                        
                     }
                     ans+=countA*countB;
                    if(A==B){
                      ans-=countA;
                    }
                 }
             }
               System.out.println(ans);
    }
  }