import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0,i+1));
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.substring(i));
        }
    }
}