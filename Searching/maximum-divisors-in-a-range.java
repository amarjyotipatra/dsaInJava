import java.util.Scanner;





class Main {

    public static int gcd(int a, int b) {

        while (a != 0 && b != 0) {

            if (b % a == 0)

                return a;

            int temp = a;

            a = b % a;

            b = temp;

        }

        return a;

    }





    public static int lowerBound(int[] a, int start, int end, int key) {

        if (start > end)

            return end;

        int mid = (start + end) / 2;

        if (a[mid] == key)

            return mid;

        else if (a[mid] > key)

            return lowerBound(a, start, mid - 1, key);

        else

            return lowerBound(a, mid + 1, end, key);

    }





    public static int upperBound(int[] a, int start, int end, int key) {

        if (start > end)

            return start;

        int mid = (start + end) / 2;

        if (a[mid] == key)

            return upperBound(a, mid + 1, end, key);

        else if (a[mid] > key)

            return upperBound(a, start, mid - 1, key);

        else

            return upperBound(a, mid + 1, end, key);

    }





    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);





        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int g = (a < b) ? gcd(a, b) : gcd(b, a);





        int[] divisors = new int[9999999];

        int count = 0;

        for (int i = 1; i <= g; i++) {

            if (g % i == 0) {

                divisors[count++] = i;

            }

        }





        int n = scanner.nextInt();

        while (n-- > 0) {

            int low = scanner.nextInt();

            int high = scanner.nextInt();





            int id1 = lowerBound(divisors, 0, count - 1, low);

            int id2 = upperBound(divisors, 0, count - 1, high);

            if (low > divisors[id1] || count == 0) {

                id1++;

            }

            int diff = id2 - id1;

            if (diff == 0) {

                System.out.println("-1");

            } else {

                System.out.println(divisors[id2 - 1]);

            }

        }

    }

}