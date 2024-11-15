public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<Integer> queue = new LinkedList<>();
            Stack<Integer> stack = new Stack<>();
            
            // Enqueue elements into the queue
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                queue.offer(num);
            }

            // Push elements from the queue to the stack
            while (!queue.isEmpty()) {
                stack.push(queue.poll());
            }

            // Pop elements from the stack and print
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
    }
}