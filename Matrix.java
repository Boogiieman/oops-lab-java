import java.util.Scanner;
class Matrix
{
 public static void main(String args[])
 {
  int row,col,i,j;
  Scanner ln=new Scanner(System.in);
  System.out.println("Enter the number of rows:");
  row=ln.nextInt();
  System.out.println("Enter the number of cols:");
  col=ln.nextInt();
  int mat1[][]=new int[row][col];
  int mat2[][]=new int[row][col];
  int res[][]=new int[row][col];
  System.out.println("Enter the elements of matrix 1:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    mat1[i][j]=ln.nextInt();
   }
  }
  System.out.println("Enter the elements of matrix 2:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    mat2[i][j]=ln.nextInt();
   }
  }
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    res[i][j]=mat1[i][j]+mat2[i][j];
   }
  }
  System.out.println("Sum of Matrices:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    System.out.print(res[i][j]+"\t");
   }
   System.out.println(" ");
  }
 }
}

