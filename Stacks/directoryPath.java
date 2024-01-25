import java.util.*;
  import java.io.*;
  
class SimplifyPath {
    public static String simplifyPath(String A) {
        Stack<String> stack = new Stack<>();
        String[] parts = A.split("/");
        
        for (String part : parts) {
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!part.equals(".") && !part.isEmpty()) {
                stack.push(part);
            }
        }
        
        StringBuilder result = new StringBuilder("/");
        for (String dir : stack) {
            result.append(dir).append("/");
        }
        
        if (result.length() > 1) {
            result.setLength(result.length() - 1); // Remove trailing '/'
        }
        
        return result.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(simplifyPath(s));
    }
}