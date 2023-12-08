import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        
        for (int t = 0; t < testcase; t++) {
            int N = sc.nextInt();
            int shift = sc.nextInt();
            int[] arr = new int[N];
            int[] rightArr = new int[N];
            
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            for (int i = 0; i < N; i++) {
                int newIndex = (i + shift) % N;
                rightArr[newIndex] = arr[i];
            }
            
            for (int i = 0; i < N; i++) {
                System.out.print(rightArr[i] + " ");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}