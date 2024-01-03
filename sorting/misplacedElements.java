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

            int sorted[] = Arrays.copyOf(arr, n); // Copy the original array

            Arrays.sort(sorted);



            int count = 0;

            for (int i = 0; i < n; i++) {

                if (arr[i] != sorted[i]) {

                    count++;

                }

            }

            System.out.println(count);

        }

    }

}
