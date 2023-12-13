import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      sc.nextLine();
      while(t-->0){
        String str=sc.nextLine();
        char[] chars=str.toCharArray();
        
        for (int i = 0; i < chars.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] > chars[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                char temp = chars[i];
                chars[i] = chars[maxIndex];
                chars[maxIndex] = temp;
            }
        }
        System.out.println(new String(chars));
      }
      }
  }