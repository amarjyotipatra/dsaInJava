import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ind = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0 && arr[i] > arr[i + 1]) {
                    ind = i;
                }
                if (i < n - 1 && i > 0 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    ind = i;
                }
                if (i == n - 1 && arr[i] > arr[i - 1]) {
                    ind = i;
                }
            }
            System.out.println(ind);
        }
    }
}