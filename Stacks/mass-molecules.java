import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int sum = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'C') {
                st.push(12);
            } else if (ch == 'O') {
                st.push(16);
            } else if (ch == 'H') {
                st.push(1);
            } else if (ch == '(') {
                st.push(100);
            } else if (ch == ')') {
                int v = 0;
                while (!st.isEmpty() && st.peek() != 100) {
                    v += st.pop();
                }
                st.pop();
                st.push(v);
            } else if (ch >= '1' && ch <= '9') {
              int k = st.pop();
                int x = k * (ch - '0');
                st.push(x);
            }
        }
        
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        System.out.println(sum);
    }
  }