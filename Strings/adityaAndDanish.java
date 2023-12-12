import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int countA = 0;
            int countD = 0;
            sc.nextLine(); // Consume the newline character after reading an integer
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'A')
                    countA++;
                else if (str.charAt(i) == 'D')
                    countD++;
            }
            if (countA > countD)
                System.out.println("Aditya");
            else if (countA < countD)
                System.out.println("Danish");
            else
                System.out.println("AdiDan");
        }
    }
}