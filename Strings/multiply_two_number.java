import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger sum = BigInteger.ZERO;
            BigInteger[] arr = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextBigInteger();
                sum = sum.add(arr[i]);
            }
            System.out.println(sum);
        }
    }
}