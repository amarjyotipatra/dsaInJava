import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String result = findNumberAtSequence(n);
            System.out.println(result);
        }
    }
    
    public static String findNumberAtSequence(int n) {
        String current = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            
            for (int j = 0; j < current.length(); j++) {
                char currentChar = current.charAt(j);
                
                if (j + 1 < current.length() && current.charAt(j + 1) == currentChar) {
                    count++;
                } else {
                    sb.append(count).append(currentChar);
                    count = 1;
                }
            }
            
            current = sb.toString();
        }
        
        return current;
    }
}