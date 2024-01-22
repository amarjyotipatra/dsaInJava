import java.util.*;
import java.io.*;
  
class Main {
    static int mini;
    static Stack<Integer> s = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        while (q-- > 0) {
            int p = scanner.nextInt();
            if (p == 1) {
                int p1 = scanner.nextInt();
                push(p1);
            } else if (p == 2) {
                pop();
            } else if (p == 3) {
                System.out.println(TOP());
            } else if (p == 4) {
                System.out.println(getmin());
            }
        }
        scanner.close();
    }

    public static void push(int x) {
        if (s.isEmpty()) {
            s.push(x);
            mini = x;
        } else {
            if (mini <= x) {
                s.push(x);
            } else {
                s.push(2 * x - mini);
                mini = x;
            }
        }
    }


    public static void pop() {
        if (s.isEmpty()) {
            System.out.println("-1");
            return;
        }
        if (s.peek() >= mini) {
            s.pop();
        } else {
            mini = 2 * mini - s.peek();
            s.pop();
        }
    }


    public static int TOP() {
        if (s.isEmpty()) {
            return -1;
        }
        if (s.peek() >= mini) {
            return s.peek();
        } else {
            return mini;
        }
    }


    public static int getmin() {
        if (s.isEmpty()) {
            return -1;
        }
        return mini;
    }

}