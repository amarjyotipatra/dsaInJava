import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
        String ch = sc.next();

        if (ch.equals("P") || ch.equals("p"))
            System.out.println("PrepBytes");
        else if (ch.equals("Z") || ch.equals("z"))
            System.out.println("Zenith");
        else if (ch.equals("E") || ch.equals("e"))
            System.out.println("Expert Coder");
        else if (ch.equals("D") || ch.equals("d"))
            System.out.println("Data Structure");
    }
  }