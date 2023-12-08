import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
       int row=sc.nextInt();
      int col=sc.nextInt();
      int[][] matrix=new int[row][col];
      int[][] lowerTri=new int[row][col];
      int[][] upperTri=new int[row][col];
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          matrix[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<row;i++){
        for(int j=0;j<=i;j++){
          lowerTri[i][j]=matrix[i][j];
        }
      }
      for(int i=0;i<row;i++){
        for(int j=i;j<col;j++){
          upperTri[i][j]=matrix[i][j];
        }
      }
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          System.out.print(lowerTri[i][j]+" ");
        }
        System.out.println();
      }
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          System.out.print(upperTri[i][j]+" ");
        }
      System.out.println();
      }
    }
  }