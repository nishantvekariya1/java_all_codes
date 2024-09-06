public class CWH_29_Practice_Set_6
{
    public static void main(String[] args)
    {
        // Problem 1
//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//        float sum = 0;
//        for (float element :marks)
//        {
//            sum = sum + element;
//        }
//        System.out.println("The sum is : "+sum);

        // Problem 2
//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//        float num = 45.7f;
//        float sum = 0;
//        boolean IsInArray = false;
//        for (float element :marks)
//        {
//            if(num==element)
//            {
//                IsInArray = true;
//                break;
//            }
//        }
//        if(IsInArray)
//        {
//        System.out.println("The num is present in array");
//        }
//        else
//        {
//        System.out.println("The num is not present in array");
//        }

        // Problem 3
//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//        float sum = 0;
//        for (float element :marks)
//        {
//            sum = sum + element;
//        }
//        System.out.println("The value of average marks is : "+sum/marks.length);

        // Problem 4
//        int [][] mat1 = { {1, 2, 3},
//                          {4, 5, 6} };
//        int [][] mat2 ={ {2, 6, 13 },
//                         {3, 7, 1} };
//        int [][] result ={ {0, 0, 0},
//                         {0, 0, 0} };
//
//        for(int i=0; i<mat1.length; i++) // row number of times
//        {
//            for(int j=0; j<mat1[i].length; j++) // column number of times
//            {
//                System.out.format("Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        //Printing the elements of 2-D arrays
//        for(int i=0; i<mat1.length; i++) // row number of times
//        {
//            for(int j=0; j<mat1[i].length; j++) // column number of times
//            {
//                System.out.print(result[i][j]+" ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(""); // Prints a new line
//        }

        // Problem 5
//        int [] arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for (int i=0; i<n; i++)
//        {
//            //Swap a[i] and a[l-1-i]
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//        for (int element :arr) {
//            System.out.print(element+" ");
//        }

        // Problem 6
//        int [] arr = {1,21,3,455,5,34,67};
//        int max = Integer.MIN_VALUE;
//        for(int e:arr)
//        {
//            if(e>max)
//            {
//                max = e;
//            }
//        }
//        System.out.println("The maximum number in array is : "+max);

        // Problem 7
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        int [] arr = {1,21,3,455,5,34,67};
//        int min = Integer.MAX_VALUE;
//        for(int e:arr)
//        {
//            if(e<min)
//            {
//                min = e;
//            }
//        }
//        System.out.println("The minimum number in array is : "+min);

        // Problem 8
        boolean isSorted = true;
        int [] arr = {1,2,3,4,5,34,67};
        for (int i=0; i< arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("The Array is sorted");
        }
        else
        {
            System.out.println("The Array is not sorted");
        }


    }
}