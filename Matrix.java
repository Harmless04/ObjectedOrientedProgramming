import java.util.Scanner;
public class Matrix 
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter R1 ");
        int r1= sc.nextInt();
        System.out.println("Enter C1 ");
        int c1= sc.nextInt();
        System.out.println("Enter R2 ");
        int r2= sc.nextInt();
        System.out.println("Enter C2 ");
        int c2= sc.nextInt();
        int i,j,k,l;
        int [][] first = new int[r1][c1];
        int [][] second=new int[r2][c2];
        System.out.println("Enter elements of matrix1");
        for(i=0;i<r1;i++)
        {
         for(j=0;j<c1;j++) 
         {
            first[i][j]=sc.nextInt();
         }
        }
        System.out.println("Enter elements of matrix2");
        for(k=0;k<r2;k++)
        {
         for(l=0;l<c2;l++) 
         {
            second[k][l]=sc.nextInt();
         }
        }
        int[][] product = new int[r1][c2];
        for(int m = 0; m < r1; m++) 
        {
            for (int n = 0; n < c2; n++) 
            {
                for (int o= 0; o < c1; o++) 
                {
                    product[m][n] += first[m][o] * second[o][n];
                }
            }
        }

        System.out.println("Multiplication of two matrices is: ");
        for(int[] row : product) 
        {
            for (int column : row) 
            {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
