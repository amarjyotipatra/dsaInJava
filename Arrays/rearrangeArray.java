import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] result = new int[N];
            int start = 0;
            int end = N - 1;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j = 0; j < N; j += 2) {
              if(start<=end){
                result[j] = arr[end--];
              }
              if(start<=end){
                result[j + 1] = arr[start++];
              }
            }
            for (int k = 0; k < N; k++) {
                System.out.print(result[k] + " ");
            }
            System.out.println();
            T--;
        }
    }
}