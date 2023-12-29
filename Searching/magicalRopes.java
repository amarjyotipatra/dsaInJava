import java.util.*;



public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long X = sc.nextLong();

        long K = sc.nextLong();

        

        long[] H = new long[N];

        long[] R = new long[N];

        

        for (int i = 0; i < N; i++) {

            H[i] = sc.nextLong();

        }

        

        for (int i = 0; i < N; i++) {

            R[i] = sc.nextLong();

        }

        

        long left = 0;

        long right = (long) 1e18;

        long result = Long.MAX_VALUE;

        

        while (left <= right) {

            long mid = left + (right - left) / 2;

            long totalLength = 0;

            boolean possible = true;

            

            for (int i = 0; i < N; i++) {

                if (H[i] + R[i] * mid >= K) {

                    totalLength += Math.max(K, H[i] + R[i] * mid);

                    if (totalLength >= X) {

                        break;

                    }

                }

            }

            

            if (totalLength >= X) {

                result = Math.min(result, mid);

                right = mid - 1;

            } else {

                left = mid + 1;

            }

        }

        

        System.out.println(result);

    }

}
