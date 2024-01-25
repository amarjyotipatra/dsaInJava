import java.util.*;
  import java.io.*;
  
 class NearestSmallerToLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        List<Integer> v = wtr(a, n);
        
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
    }
    
    public static List<Integer> wtr(int[] a, int n) {
        Stack<Integer> st = new Stack<>();
        List<Integer> v = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= a[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                v.add(-1);
            } else {
                v.add(st.peek());
            }
            
            st.push(a[i]);
        }
        
        return v;
    }
}