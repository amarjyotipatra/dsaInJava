import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      sc.nextLine();
      while(t-->0){
        String str=sc.nextLine();
        System.out.println(checkString(str));
      }
    }
    
    public static String checkString(String str) {
        for (int i = 0;i<str.length(); i++) {
            char c=str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            } else if (c == 'n') {
                continue;
            } else if (i == str.length() - 1) {
                return "NO";
            } else {
                char next = str.charAt(i + 1);
                if (next != 'a' && next != 'e' && next != 'i' && next != 'o' && next != 'u') {
                    return "NO";
                }
            }
        }
        return "YES";
    }
  }