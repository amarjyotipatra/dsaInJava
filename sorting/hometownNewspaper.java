import java.util.*;

import java.io.*;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {

            int n = scanner.nextInt();

            String[] ht = new String[100000];

            int[] htp = new int[n];

            String[] ot = new String[100000];

            int[] otp = new int[n];

            int i = 0, j = 0;



            while (n-- > 0) {

                String v = scanner.next();

                int p = scanner.nextInt();

                int d = scanner.nextInt();



                if (d == 1) {

                    ht[p] = v;

                    htp[i] = p;

                    i++;

                } else {

                    ot[p] = v;

                    otp[j] = p;

                    j++;

                }

            }



            Arrays.sort(htp, 0, i);

            Arrays.sort(otp, 0, j);



            for (int k = i - 1; k >= 0; k--) {

                System.out.println(ht[htp[k]]);

            }



            for (int k = j - 1; k >= 0; k--) {

                System.out.println(ot[otp[k]]);

            }

        }



        scanner.close();

    }

}
