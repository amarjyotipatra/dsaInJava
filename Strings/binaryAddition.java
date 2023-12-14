import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String A = sc.next();
            BigInteger num1 = new BigInteger(A, 2);
            String B = sc.next();
            BigInteger num2 = new BigInteger(B, 2);
            BigInteger total = num1.add(num2);
            String result = total.toString(2);
            System.out.println(result);
        }
    }
}