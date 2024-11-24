import java.util.Scanner;

class TruckAndCircularRoute {
    public static long petrol(long[] gas, long[] cost, long n) {
        long s = 0;
        long e = 1;
        long cp = gas[(int) s] - cost[(int) s];

        while (cp < 0 || s != e) {
            while (cp < 0 && s != e) {
                cp -= gas[(int) s] - cost[(int) s];
                s = (s + 1) % n;
                if (s == 0) {
                    return -1;
                }
            }

            cp += gas[(int) e] - cost[(int) e];
            e = (e + 1) % n;
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long[] gas = new long[(int) n];
        for (int i = 0; i < n; i++) {
            gas[i] = scanner.nextLong();
        }
        long[] cost = new long[(int) n];
        for (int i = 0; i < n; i++) {
            cost[i] = scanner.nextLong();
        }

        long a = petrol(gas, cost, n);
        System.out.println(a);
    }
}

// Truck and Circular Route
// You have a truck that has to cover a circular route and along this route are 
// N
//  gas stations and the amount of gas at each station is 
// g
// a
// s
// [
// i
// ]
// .

// You are also given a cost array where 
// c
// o
// s
// t
// [
// i
// ]
//  denotes the amount of gas required to travel from station 
// i
//  to station 
// i
// +
// 1
// . The tank of the truck has unlimited capacity to store gas but if at any point the amount of gas in the truck is less than the 
// c
// o
// s
// t
// [
// i
// ]
// , then the truck can not move further.

// Consider gas stations are from index 
// 0
//  to 
// N
// −
// 1
//  and you can start the ride from any index such that the truck completes the ride along the circular route once in the clockwise direction.

// Print the index from where the truck can start if there is no such route possible print 
// −
// 1
// .

// Input format
// The input consists of three lines. The first line contains 
// N
//  i.e. number of gas stations.
// The second line contains the amount of gas at each gas-station, and the third line contains the cost to go from that station to the next station.

// Output format
// Print the index from where the truck can start if there is no such route possible print 
// −
// 1
// .

// Constraints
// 1
// <=
// N
// <=
// 10
// 6

// 1
// <=
// g
// a
// s
// [
// i
// ]
// ,
// c
// o
// s
// t
// [
// i
// ]
// <=
// 10
// 9

// Time Limit
// 1 second

// Example
// Input
// 5
// 1 2 3 4 5
// 3 4 5 1 2

// Output
// 3