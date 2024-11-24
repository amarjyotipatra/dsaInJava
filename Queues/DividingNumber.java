import java.util.PriorityQueue;
import java.util.Scanner;


class DividingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a1, a2) -> Integer.compare(a2, a1));


        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            pq.add(a[i]);
        }


        int[] b = new int[m];
        for (int j = 0; j < m; j++) {
            b[j] = scanner.nextInt();
        }


        int curr = 0;
        for (int i = 0; i < m; i++) {
            while (curr != b[i] && !pq.isEmpty()) {
                int top = pq.poll();
                int t = top / 2;
                if (curr == b[i] - 1) {
                    System.out.println(top);
                }
                if (t > 0) {
                    pq.add(t);
                }
                curr++;
            }
        }
    }
}

// Find The Dividing Number
// Asha has got a set of integers and he is thinking about what interesting problem statement could be formed from these integers.
// And Eureka! She found one!

// The problem statement goes as follow:

// You have to find the maximum integer among the set of integers and divide the integer by 2.
// Since this is an integer division the result of division will be an integer.
// After division if the integer is greater than 0, then we put the updated integer again in the set of integers.
// Asha gives you 
// m
//  queries, each query 
// q
// [
// i
// ]
//  means, that 
// q
// [
// i
// ]
// −
// 1
//  number of operations has already been performed and its time to perform 
// q
// [
// i
// ]
// t
// h
//  operation. Your task is to tell that for 
// q
// [
// i
// ]
// t
// h
//  operation which integer will get divided. 

// Input format
// The first line contains 2 space-separated integers 
// n
// ,
// m
//  denoting the number of integers and the number of queries respectively.
// The next line contains 
// n
//  space-separated integers followed by 
// m
//  lines.
// In the next 
// m
//  lines, the 
// i
// t
// h
//  line will contain 
// q
// [
// i
// ]
// .

// Output format
// Output 
// m
//  lines, the 
// i
// t
// h
//  of which contains the answer for the 
// i
// t
// h
//  query.

// Constraints
// 1
// <=
// n
// ,
// m
// <=
// 10
// 6

// For 
// 1
// <=
// i
// <=
// m
// ,
 
// q
// [
// i
// ]
// >
// q
// [
// i
// −
// 1
// ]

// For 
// 0
// <=
// i
// <=
// n
// ,
 
// 1
// <=
// a
// [
// i
// ]
// <=
// 10
// 9

// If no integer is present at the time of the query stop the program.

// Time Limit
// 1 second

// Example
// Input
// 4 6
// 8 5 3 1
// 1
// 2
// 3
// 4
// 6
// 8

// Output
// 8
// 5
// 4
// 3
// 2
// 1