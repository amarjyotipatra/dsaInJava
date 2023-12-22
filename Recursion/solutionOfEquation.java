import java.util.*;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {

            int n = scanner.nextInt();

            int z = scanner.nextInt();

            int count = findSolutions(n, z);

            System.out.println(count);

        }

        scanner.close();

    }



    public static int findSolutions(int n, int z) {

        if (n == 1) {

            return 1;

        }

        if (z == 0) {

            return 1;

        }

        if (z < 0) {

            return 0;

        }



        int totalSolutions = 0;

        for (int i = 0; i <= z; i++) {

            totalSolutions += findSolutions(n - 1, z - i);

        }

        return totalSolutions;

    }

}