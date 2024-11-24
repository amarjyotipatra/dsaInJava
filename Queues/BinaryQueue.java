import java.util.*;
  import java.io.*;
  
  public class BinaryQueue {
    public static void main(String args[]) throws IOException {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
             Queue<String> queue = new LinkedList<>();
            queue.offer("1");

            while (n-- > 0) {
                String currentBinary = queue.poll();
                System.out.print(currentBinary + " ");
                
                // Enqueue next binary numbers by appending '0' and '1' to the current binary number
                queue.offer(currentBinary + "0");
                queue.offer(currentBinary + "1");
            }
            System.out.println();
        }
    }
  }

//   Binary Queue
// PrepBuddy knows that Rahul is good with recursion and struggling with Queue topic, so he gave Rahul a question.
// Given a number 
// N
// , print all possible binary numbers with decimal values from 
// 1
//  to 
// N
// , but the catch is you have to do this using queue data structure and not recursion. (You have to use the minimum number of bits needed to represent the number).

// Input format
// The first line of the input contains a variable 
// T
// , denoting the number of test cases.
// Each of the next 
// T
//  lines contains one integer 
// N
//  denoting the input number.

// Output format
// For each test case print the required binary representation of the numbers from 
// 1
//  to 
// N
// .

// Constraints
// 1
// <=
// T
// <=
// 30

// 1
// <=
// N
// <=
// 10000

// Time Limit
// 1 second

// Example
// Input
// 2
// 4
// 5

// Output
// 1 10 11 100
// 1 10 11 100 101