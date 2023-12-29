import java.util.Scanner;





class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        

        while (q-- > 0) {

            int fa = scanner.nextInt();

            int fb = scanner.nextInt();

            int fc = scanner.nextInt();

            

            int m = Math.min(fa, fb);

            int t = (fa + fb + fc) / 3;

            int ans = Math.min(m, t);

            

            System.out.println(ans);

        }

    }

}