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
            int x = sc.nextInt();
            int index = findKey(arr, n, x);
            System.out.println(index);
        }
    }

    public static int binarySearch(int a[], int lo, int hi, int key) {
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (a[mid] == key)
            return mid;
        if (a[mid] > key)
            return binarySearch(a, lo, mid - 1, key);
        return binarySearch(a, mid + 1, hi, key);
    }

    public static int findPivot(int a[], int start, int end) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (mid < end && a[mid] > a[mid + 1])
            return mid + 1;
        if (mid > start && a[mid] < a[mid - 1])
            return mid;
        if (a[mid] < a[start])
            return findPivot(a, start, mid - 1);
        return findPivot(a, mid + 1, end);
    }

    public static int findKey(int a[], int n, int key) {
        int pivot = findPivot(a, 0, n - 1);
        if (pivot == -1)
            return binarySearch(a, 0, n - 1, key);
        if (a[pivot] == key)
            return pivot;
        if (a[0] <= key)
            return binarySearch(a, 0, pivot - 1, key);
        return binarySearch(a, pivot + 1, n - 1, key);
    }
}