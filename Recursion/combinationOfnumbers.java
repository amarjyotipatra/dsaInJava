import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int current[] = new int[k];
        subSequence(arr, 0, n, k, current, 0);
    }

    static void subSequence(int arr[], int start, int end, int k, int current[], int currentIndex) {
        if (currentIndex == k) {
            for (int num : current) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        
        if (start == end) {
            return;
        }

        current[currentIndex] = arr[start];
        subSequence(arr, start + 1, end, k, current, currentIndex + 1);
        // Exclude the current element from the subsequence
        subSequence(arr, start + 1, end, k, current, currentIndex);
    }
}