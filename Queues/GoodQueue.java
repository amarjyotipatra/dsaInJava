import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class GoodQueue {
    public static boolean check(int n) {
        boolean[] vis = new boolean[10];
        while (n > 0) {
            if (vis[n % 10]) {
                break;
            }
            if (n % 10 > 5) {
                break;
            }
            vis[n % 10] = true;
            n = n / 10;
            if (n == 0) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            Queue<Integer> q = new LinkedList<>();
            for (int i = l; i <= r; i++) {
                if (check(i)) {
                    q.add(i);
                }
            }
            int ans = q.size();
            System.out.println(ans);
        }
    }
}

// Good Queue
// GoodQueue numbers are said to be numbers in which

// All the digits in the number are distinct.
// All the digits are less than or equal to 
// 5
// .
// You are given two numbers 
// L
//  and 
// R
// , and the task is to find the count of GoodQueue numbers in the range 
// [
// L
// ,
// R
// ]
//  inclusive of 
// L
//  and 
// R
// .

// Input format
// The first line of the input contains a variable 
// T
// , denoting the number of test cases.
// Each of the next 
// T
//  lines contains two integers 
// L
//  and 
// R
//  in string format.

// Output format
// For each test case print the count of GoodQueue numbers.

// Constraints
// 1
// <=
// T
// <=
// 5

// 1
// <=
// L
// <
// R
// <=
// 5
// ∗
// 10
// 5

// Time Limit
// 1 second

// Example
// Input
// 2
// 5 20
// 3 17

// Output
// 7
// 8

// Sample test case explanation
// L
// =
// 5
// ,
// R
// =
// 20

// GoodQueue numbers are 
// 5
// ,
// 10
// ,
// 12
// ,
// 13
// ,
// 14
// ,
// 15
// ,
// 20

// L
// =
// 3
// ,
// R
// =
// 17

// GoodQueue numbers are 
// 3
// ,
// 4
// ,
// 5
// ,
// 10
// ,
// 12
// ,
// 13
// ,
// 14
// ,
// 15