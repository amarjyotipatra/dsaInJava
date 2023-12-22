import java.util.*;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        scanner.close();

        char arr[]=input.toCharArray();

        Arrays.sort(arr);

        String str=new String(arr);

        int index = 0;

        String curr = "";

        powerSet(str, index, curr);

    }



   static void powerSet(String str, int index, String curr)

    {

        int n = str.length();

          if (!curr.isEmpty()) {

            System.out.println(curr);

        }

        //generate subsets in lexicographically

          for (int i = index; i < n; i++) {

            curr += str.charAt(i);

            powerSet(str, i + 1, curr);

            curr = curr.substring(0, curr.length() - 1); // Backtrack

        }

    }

}
