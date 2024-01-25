import java.util.*;

class RPNCalculator {
    public static int evalRPN(String[] A) {
        Stack<Integer> S = new Stack<>();
        for (String token : A) {
            if (token.length() > 1 || (token.charAt(0) >= '0' 
            && token.charAt(0) <= '9')) {
                S.push(Integer.parseInt(token));
                continue;
            }


            int op2 = S.pop();
            int op1 = S.pop();
            char op = token.charAt(0);
            int result;
            if (op == '+') {
                S.push(op1 + op2);
            } else if (op == '-') {
                S.push(op1 - op2);
            } else if (op == '*') {
                S.push(op1 * op2);
            } else if (op == '/') {
                S.push(op1 / op2);
            }
        }
        return S.peek();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        System.out.println(evalRPN(s));
    }
}