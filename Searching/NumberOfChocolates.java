import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int q = sc.nextInt();
        while (q-- > 0) {
            int val = sc.nextInt();
            int count = upperBound(arr, val);
            System.out.println(count);
        }
    }

    static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}