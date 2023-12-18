import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int count = longestUniqueSubstring(s);
            System.out.println(count);
        }
    }

    public static int longestUniqueSubstring(String s) {
        int n = s.length();
        int count = 0;
        int[] visited = new int[256];
        Arrays.fill(visited, -1);
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (visited[s.charAt(i)] != -1) {
                start = Math.max(start, visited[s.charAt(i)] + 1);
            }
            visited[s.charAt(i)] = i;
            count = Math.max(count, i - start + 1);
        }

        return count;
    }
}
