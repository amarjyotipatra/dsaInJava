import java.util.*;
  import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            long profit = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] > a[i - 1]) {
                    profit += a[i] - a[i - 1];
                }
            }
            
            System.out.println(profit);
        }
        
        scanner.close();
    }
}