import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int testcase=sc.nextInt();
      for(int a=0;a<testcase;a++){
        long N = sc.nextInt();
        int count=0;
       for(int i=2;i<=N;i++){
         while(N%i==0){
             count +=i;
             N/=i;
         }
       }
        System.out.println(count); 
      }
    }
}