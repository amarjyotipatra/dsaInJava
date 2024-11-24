import java.util.*;
  import java.io.*;
  
  public class StoneNumber {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<Integer> queue = new LinkedList<>();
            for(int i=1;i<=n;i++)
              queue.offer(i);
            while(queue.size()>1){
              int firstElement = queue.poll();
              queue.offer(firstElement);
              queue.poll();
            } 
            System.out.println(queue.poll());
        }
    }
  }

//   Stone Number
// PrepBuddy gave Tina a pile of 
// N
//  stones. Each stone has a number written on it from 
// 1
//  to 
// N
// . Pile is ordered according to the number written on the stone, i.e, stone with the number 
// 1
//  is at the top of the pile and stone with the number 
// N
//  is at the bottom of the pile.
// Tina needs to perform tasks in given sequence,

// Take the topmost stone and insert it at the bottom.
// Remove the current topmost stone from the pile.
// These operations need to be performed until a single stone remains. Tina has to print the number that is written on the last stone remaining in the pile.

// Input format
// The first line of the input contains a variable 
// T
// , denoting the number of test cases.
// Each of the next 
// T
//  lines contains one integer 
// N
//  denoting the number of stones in the pile.

// Output format
// For each test case print the number that is written on the remaining stone.

// Constraints
// 1
// <=
// T
// <=
// 20

// 2
// <=
// N
// <=
// 100

// Time Limit
// 1 second

// Example
// Input
// 2
// 4
// 5

// Output
// 1
// 3

// Sample test case explaination
// In the first test case
// N
// =
// 4
// , that means we have stone with number 
// 1
// ,
// 2
// ,
// 3
// ,
// 4

// Operation is

// First take 
// 1
//  and move it at the end 
// 2
// ,
// 3
// ,
// 4
// ,
// 1
 
// then remove 
// 2
//  -> 
// 3
// ,
// 4
// ,
// 1
// Take 
// 3
//  and move it at the end 
// 4
// ,
// 1
// ,
// 3

// remove 
// 4
//  -> 
// 1
// ,
// 3
// Take 
// 1
//  and move it at the end 
// 3
// ,
// 1
 
// remove 
// 3
//  -> 
// 1
// Last remaining stone is with number 
// 1
// . 