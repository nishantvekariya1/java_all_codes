import java.util.Scanner;

public class MatrixMultiple
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows of the first matrix: ");
        int rows1 = sc.nextInt();

        System.out.println("Enter the number of columns of the first matrix: ");
        int cols1 = sc.nextInt();

        System.out.println("Enter the number of rows of the second matrix: ");
        int rows2 = sc.nextInt();

        System.out.println("Enter the number of columns of the second matrix: ");
        int cols2 = sc.nextInt();

        if(cols1==rows2)
        {
            int[][] arr1 = new int[rows1][cols1]; // Defining an array of the first matrix
            int[][] arr2 = new int[rows2][cols2]; // Defining an array for the second matrix

            int[][] mul = new int[rows1][cols2];

            System.out.println("Enter the elements of the first matrix: ");
            for (int i = 0; i < rows1; i++)
            {
                for (int j = 0; j < cols1; j++)
                {
                    arr1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elements of the second matrix: ");
            for (int i = 0; i < rows2; i++)
            {
                for (int j = 0; j < cols2; j++)
                {
                    arr2[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < rows1; i++)
            {
                for (int j = 0; j < cols2; j++)
                {
                    mul[i][j] = 0;
                    for (int k = 0; k < cols1; k++)
                    {
                        mul[i][j] = mul[i][j] + (arr1[i][k]*arr2[k][j]);
                    }
                }
            }



            System.out.println("\n The first matrix is: \n");
            for (int i = 0; i < rows1; i++)
            {
                for (int j = 0; j < cols1; j++)
                {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("\n The second matrix is: \n");
            for (int i = 0; i < rows2; i++)
            {
                for (int j = 0; j < cols2; j++)
                {
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("\n The multiplied matrix is: \n");
            for (int i = 0; i < mul.length; i++)
            {
                for (int j = 0; j < mul[i].length; j++)
                {
                    System.out.print(mul[i][j]+"  ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("\n Multiplication of the matrices CANNOT BE PERFORMED for the given dimensions");
        }

    }
}