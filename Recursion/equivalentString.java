import java.util.*;

  import java.io.*;

  

  public class Main {

    public static boolean isEquivalent(String a, String b) {

        int n = a.length();

        if (a.equals(b))

            return true;

        // Case 2: Check if the length is odd

        if (n % 2 != 0)

            return false;

        // Case 3: Check possible splits and equivalency

        String a1 = a.substring(0, n / 2);

        String a2 = a.substring(n / 2, n);

        String b1 = b.substring(0, n / 2);

        String b2 = b.substring(n / 2, n);



        return (isEquivalent(a1, b1) && isEquivalent(a2, b2))

        || (isEquivalent(a1, b2) && isEquivalent(a2, b1));

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();

        String b = scanner.next();

        if (isEquivalent(a, b))

            System.out.println("YES");

        else

            System.out.println("NO");



        scanner.close();

    }

  }