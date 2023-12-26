import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int k = sc.nextInt();
        if(k==1){
            System.out.println(arr[0]);
            return;
        }
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count == k) {
                    System.out.println(arr[i]);
                    break;
                }
            } else {
                count = 1;
            }
        }
    }
}
