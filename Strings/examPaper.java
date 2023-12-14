import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            char[] chars=new char[str.length()];
            for(int i=0;i<str.length();i++){
                chars[i]=str.charAt(i);
            }
            int count=0;
            for(int i=0;i<str.length()/2;i++){
                count+=Math.abs(chars[str.length()-1-i]-chars[i]);
            }
            if(count==0){
                System.out.println(0);
            }else{
                System.out.println(count);
            }
        }
    }
}