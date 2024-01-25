import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static int prec(char x) {
        if (x == '^') {
            return 6;
        }
        if (x == '/') {
            return 5;
        }
        if (x == '*') {
            return 4;
        }
        if (x == '-') {
            return 3;
        }
        if (x == '+') {
            return 2;
        } else {
            return 1;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character


        while (t-- > 0) {
            String s = scanner.nextLine();
            Stack<Character> st = new Stack<>();
            StringBuilder res = new StringBuilder();


            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    res.append(c);
                } else if (c == '(') {
                    st.push(c);
                } else if (c == ')') {
                    while (!st.isEmpty() && st.peek() != '(') {
                        res.append(st.pop());
                    }
                    st.pop(); // Pop the '('
                } else {
                    while (!st.isEmpty() && prec(st.peek()) >= prec(c)) {
                        res.append(st.pop());
                    }
                    st.push(c);
                }
            }


            while (!st.isEmpty()) {
                res.append(st.pop());
            }


            System.out.println(res.toString());
        }
    }
}