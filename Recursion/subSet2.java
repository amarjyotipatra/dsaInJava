import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int totalSum = subsetSum(arr, 0, 0);
            System.out.println(totalSum);
        }
    }

    private static int subsetSum(int[] arr, int index, int currentSum) {
        if (index == arr.length) {
            return currentSum;
        }
        int sumWithCurrent = subsetSum(arr, index + 1, currentSum + arr[index]);
        int sumWithoutCurrent = subsetSum(arr, index + 1, currentSum);

        return sumWithCurrent + sumWithoutCurrent;
    }
}