import java.util.*;
  import java.io.*;
  
  public class Main {
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
