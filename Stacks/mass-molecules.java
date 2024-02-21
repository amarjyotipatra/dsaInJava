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