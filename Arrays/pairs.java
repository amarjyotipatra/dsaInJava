import java.util.*;

public class Main {
    static int n, m;
    static int[] l = new int[300001];
    static int[] r = new int[300001];
    static int[] c = new int[300001];

    static boolean check(int x) {
        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if (x == l[i] || x == r[i]) {
                cnt++;
            } else {
                c[l[i]]++;
                c[r[i]]++;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (cnt + c[i] == m) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }
        if (check(l[0]) || check(r[0])) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}