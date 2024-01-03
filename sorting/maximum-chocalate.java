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
            
            Arrays.sort(a);
            
            int sum = 0;
            for (int i = n - 1; i >= 0; i -= 2) {
                sum += a[i];
            }
            
            System.out.println(sum);
        }
    }
}