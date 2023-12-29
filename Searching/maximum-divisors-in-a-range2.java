import java.util.*;



public class Main {

    static final int MAX = 1000005;

    

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        long b = sc.nextLong();

        

        long gcd = gcd(a, b);

        

        ArrayList<Long> divisors = new ArrayList<>();

        for (long i = 1; i * i <= gcd; i++) {

            if (gcd % i == 0) {

                divisors.add(i);

                if (i != gcd / i) {

                    divisors.add(gcd / i);

                }

            }

        }

        Collections.sort(divisors, Collections.reverseOrder());

        

        int q = sc.nextInt();

        while (q-- > 0) {

            long low = sc.nextLong();

            long high = sc.nextLong();

            long maxDivisor = -1;

            

            for (long divisor : divisors) {

                if (divisor >= low && divisor <= high) {

                    maxDivisor = divisor;

                    break;

                }

            }

            

            System.out.println(maxDivisor);

        }

    }

    

    static long gcd(long a, long b) {

        if (b == 0) {

            return a;

        }

        return gcd(b, a % b);

    }

}
