import java.util.*;

import java.io.*;

import java.util.Scanner;





class Main {





    static void pow(String s, String a, int n, int j) {

        if (j == n) {

            return;

        }

        if (!a.isEmpty()) {

            System.out.println(a);

        }

        for (int i = j + 1; i < n; i++) {

            pow(s, a + s.charAt(i), n, i);

        }

    }





    public static void main(String[] args) {

        //write your code here

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int n = s.length();

        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        String a = "";

        pow(new String(chars), a, n, -1);

    }

}