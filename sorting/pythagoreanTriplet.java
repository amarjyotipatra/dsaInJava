import java.util.*;
import java.io.*;

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

            Arrays.sort(arr);

            boolean found = false;

            for (int i = n - 1; i >= 2; i--) {
                int left = 0;
                int right = i - 1;
                
                while (left < right) {
                    int sumOfSquares = arr[left] * arr[left] + arr[right] * arr[right];
                    int squareOfHypotenuse = arr[i] * arr[i];
                    
                    if (sumOfSquares == squareOfHypotenuse) {
                        System.out.println("Yes");
                        found = true;
                        break;
                    } else if (sumOfSquares < squareOfHypotenuse) {
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
                System.out.println("No");
            }
        }
    }
}