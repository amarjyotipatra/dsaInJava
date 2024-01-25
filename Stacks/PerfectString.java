import java.util.*;
  import java.io.*;
  
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = scanner.nextLine();
            Stack<Character> st = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                if (st.isEmpty()) {
                    st.push(s.charAt(i));
                } else {
                    if (Math.abs(st.peek() - s.charAt(i)) == 32) {
                        st.pop();
                    } else {
                        st.push(s.charAt(i));
                    }
                }
            }

            StringBuilder res = new StringBuilder();
            while (!st.isEmpty()) {
                res.append(st.pop());
            }
            System.out.println(res.reverse().toString());
        }

        scanner.close();
    }
}