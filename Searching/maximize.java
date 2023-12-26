import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int totalTime = 240 - k;
        int maxProblems = 0;
        
        for (int i = 1; i <= n; i++) {
            int problemTime = 5 * i;
            if (totalTime >= problemTime) {
                totalTime -= problemTime;
                maxProblems++;
            } else {
                break;
            }
        }
        
        System.out.println(maxProblems);
    }
  }