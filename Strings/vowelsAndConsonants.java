import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      sc.nextLine();
      while(t-->0){
        String str=sc.nextLine();
        int vowel=0;
        int consonant=0;
         for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'A' || str.charAt(i) == 'E' ||
                str.charAt(i) == 'I' || str.charAt(i) == 'O' || 
                str.charAt(i) == 'U')
                    vowel++;
                else 
                    consonant++;
            }
        System.out.println(vowel+" "+consonant);
      }
    }
  }