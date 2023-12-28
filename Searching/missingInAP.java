import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int diff = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (i > 0) {
                    diff = arr[i] - arr[i - 1];
                }
            }
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] != diff) {
                    System.out.println(arr[i - 1] + diff);
                    break;
                }
            }
        }
    }
}