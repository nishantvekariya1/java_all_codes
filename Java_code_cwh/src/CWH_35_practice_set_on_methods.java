public class CWH_35_practice_set_on_methods
{
//    static void multiplication(int n)
//    {
//        for (int i=1;i<=10;i++)
//        {
//            System.out.format("%d X %d = %d\n",n,i,n*i);
//        }
//    }

//    static void pattern1(int n)
//    {
//        for (int i=0;i<n;i++){
//            for (int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


    //sum(n) = 1+2+3+...+n
    //sum(n) = 1+2+3+...+n-1+n
    //sum(n) = sum(n-1)+n
//    static int sumRec(int n)
//    {
//        //Base Condition
//        if (n==1){
//            return 1;
//        }
//        else
//        {
//            return n + sumRec(n-1);
//        }
//    }

//    static void pattern2(int n)
//    {
//        for (int i=n-1;i>=0;i--){
//            for (int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static int fib(int n)
//    {
//        if(n==1){
//            return 0;
//        }
//        else if (n==2){
//            return 1;
    /*
    if(n==1 || n==2)
    {
        return n-1;
    }
     */
//        }
//        else{
//            return fib(n-1) + fib(n-2);
//        }
//
//    }

//    static double sum(double ...arr)
//    {
//        double result=0;
//        for (double a : arr) {
//            result += a;
//        }
//        return result/ arr.length;
//    }


    //pattern1_rec(3)
    //pattern1_rec(2) + 3 times star and new line
    //pattern1_rec(1)+ 2 times star and new line + 3 times star and new line
    //pattern1_rec(0)+ 1 times star and new line + 2 times star and new line + 3 times star and new line
//    static void pattern1_rec(int n)
//    {
//        if(n>0){
//            pattern1_rec(n-1);
//            for (int i=0;i<n;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    Please check this question again that's wrong'
//    static void pattern2_rec(int n)
//    {
//        if(n>0){
//            pattern2_rec(n-1);
//            for (int i=n-1;i>=0;i--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static double temp(double c)
//    {
//        return (c * 9/5) + 32;
//    }

    static int sum(int n){
        int product = 0;
        for (int i=0;i<=n;i++)
        {
            product += i;
        }
        return product;
    }




    public static void main(String[] args) {
        //Problem 1
//        multiplication(5);

        //Problem 2
//        pattern1(4);

        //Problem 3
//        int c = sumRec(5);
//        System.out.println(c);

        //Problem 4
//        pattern2(4);

        //Problem 5
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//        int result = fib(7);
//        System.out.println(result);

        //Problem 6
//        System.out.println("The sum of 2, 4, 3 and 5 is : "+sum(2,4,5,3));

        //Problem 7
//        pattern1_rec(4);

        //Problem 8
//        pattern2_rec(4);

        //Problem 9
//        System.out.println(temp(26));

        //Problem 10
        System.out.println(sum(5));
    }
}