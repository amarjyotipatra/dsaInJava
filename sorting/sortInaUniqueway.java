import java.util.*;



public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();

            }

            int len = LargestSortedArrayLength(arr, 0, n - 1);

            System.out.println(len);

        }

    }



    static int LargestSortedArrayLength(int arr[], int start, int end) {

        if (sorted(arr, start, end))

            return end - start + 1;

        

        int mid = start + (end - start) / 2;

        int leftLen = LargestSortedArrayLength(arr, start, mid);

        int rightLen = LargestSortedArrayLength(arr, mid + 1, end);

        

        return Math.max(leftLen, rightLen);

    }



    static boolean sorted(int a[], int lo, int hi) {

        boolean sort = true;

        for (int i = lo; i < hi; i++) {

            if (a[i] > a[i + 1]) {

                sort = false;

                break;

            }

        }

        return sort;

    }

}
