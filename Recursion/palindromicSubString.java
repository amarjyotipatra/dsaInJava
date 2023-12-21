import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer input

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            printPalindromeDivisions(s);
            System.out.println();
        }

        scanner.close();
    }

    public static void printPalindromeDivisions(String s) {
        generatePalindromeDivisions(s, 0, "");
    }

    private static void generatePalindromeDivisions(String s, int startIndex, String currentResult) {
        int n = s.length();
        if (startIndex == n) {
            System.out.println(currentResult.trim());
            return;
        }

        for (int i = startIndex; i < n; i++) {
            String subString = s.substring(startIndex, i + 1);
            if (isPalindrome(subString)) {
                generatePalindromeDivisions(s, i + 1, currentResult + subString + " ");
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}