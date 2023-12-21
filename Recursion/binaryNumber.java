import java.util.*;

import java.io.*;



public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            String binary = Integer.toBinaryString(n);

            int count0 = 0, count1 = 0;

            for (int i = 0; i < binary.length(); i++) {

                if (binary.charAt(i) == '0')

                    count0++;

                else

                    count1++;

            }

            String accum = "";

            ArrayList<String> perm = new ArrayList<>();

            permutation(count1, count0, accum, perm);

            for (String str : perm) {

                System.out.print(str+" ");

            }

            System.out.println();

        }

    }

      static void permutation(int no_ones, int no_zeroes, String accum, ArrayList<String> perm) {

        if (no_ones == 0 && no_zeroes == 0) {

            perm.add(accum);

            return;

        }

         if (no_zeroes > 0) {

            permutation(no_ones, no_zeroes - 1, accum + "0", perm);

        }

        if (no_ones > 0) {

            permutation(no_ones - 1, no_zeroes, accum + "1", perm);

        }

    }

}
