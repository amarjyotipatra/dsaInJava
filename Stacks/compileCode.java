import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
       Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading 't'

        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading 'n'
            String s = scanner.nextLine();
            int maxi = 0;
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '<') {
                    sum++;
                } else {
                    sum--;
                }

                if (sum < 0) {
                    break;
                }

                if (sum == 0) {
                    maxi = i + 1;
                }
            }

            System.out.println(maxi);
        }
    }
  }