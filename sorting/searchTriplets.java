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

            Arrays.sort(arr);

            boolean found = false;

            for (int i = n - 1; i >= 2; i--) {

                int left = 0;

                int right = i - 1;

                while (left < right) {

                    int sum = arr[left] + arr[right];

                    if (sum == arr[i]) {

                        System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);

                        found = true;

                        break;

                    } else if (sum < arr[i]) {

                        left++;

                    } else {

                        right--;

                    }

                }

                if (found) {

                    break; 

                }

            }

            if (!found) {

                System.out.println(-1);

            }

        }

    }

}
