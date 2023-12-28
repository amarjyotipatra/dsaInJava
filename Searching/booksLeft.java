import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int i = 0, j = n - 1;
        int c = 0;
        while (i <= j) {
            if (a[i] > k && a[j] > k) {
                break;
            } else if (a[i] > k && a[j] <= k) {
                j--;
                c++;
            } else if (a[i] <= k && a[j] > k) {
                i++;
                c++;
            } else if (a[i] <= k && a[j] <= k) {
                i++;
                c++;
            }
        }
        
        System.out.println(n - c);
        
        scanner.close();
    }
}