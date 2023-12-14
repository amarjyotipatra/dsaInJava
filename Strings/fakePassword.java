import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String o = sc.next();
            String f = sc.next();
            String lrotated = f.substring(2) + f.substring(0, 2); 
            String rrotated=f.substring(f.length()-2)+f.substring(0,f.length()-2);
            System.out.println(o.equals(lrotated) || o.equals(rrotated)  ? "Yes" : "No");
        }
    }
}