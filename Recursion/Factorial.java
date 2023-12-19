import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
         System.out.println(Factorial(n));
        }
    }

    private static long Factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else {
            return n * Factorial(n - 1);
        }
    }
}