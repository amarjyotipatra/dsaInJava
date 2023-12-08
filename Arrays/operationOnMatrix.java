import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int col=sc.nextInt();
      int[][] matrix1=new int[row][col];
      int[][] matrix2=new int[row][col];
      int[][] addition=new int[row][col];
      int[][] multiplication=new int[row][col];
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          matrix1[i][j]=sc.nextInt();
        }
        // System.out.println();
      }
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          matrix2[i][j]=sc.nextInt();
        }
        // System.out.println();
      }
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          addition[i][j]=matrix1[i][j]+matrix2[i][j];
          System.out.print(addition[i][j]+" ");
        }
        System.out.println();
      }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                multiplication[i][j] = 0;
                for (int k = 0; k < col; k++) {
                    multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(multiplication[i][j] + " ");
            }
            System.out.println();
        }
    }
  }