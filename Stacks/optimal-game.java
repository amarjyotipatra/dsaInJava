import java.util.*;

  import java.io.*;

  

  public class Main {

    public static void main(String args[]) throws IOException {

      

      Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();

      Stack <Integer> s1=new Stack<>();

      Stack <Integer> s2=new Stack<>();

      for(int i=0;i<n;i++)

        {

          int a=sc.nextInt();

          s1.push(a);

          s2.push(a);

        }

      Stack <Integer> s3=new Stack<>();

      while(!s2.isEmpty())

      {

        s3.push(s2.pop());

      }

      while(!s1.isEmpty() && !s3.isEmpty())

      {

          int fe=s1.peek();

          int se=s3.peek();

          if(fe>se)

          {

            System.out.print(2+" ");

            s3.pop();

          }

          else if(se>fe)

          {

            System.out.print(1+" ");

            s1.pop();

          }

          else{

            System.out.print(0+" ");

            s1.pop();

            s3.pop();

          }

      }  

    }

  }