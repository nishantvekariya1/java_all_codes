public class SampleNew
{
    public static void main(String[] args)
    {
        int a[] = new int[5];

        System.out.println("hello world");
        test(5);
        test();
        test(3,1,7);
        test(2,1,1,0,0,7);
    }
    static void test(int... ar)
//    static void test(int[] ar)
    {
        for (int i=0;i<=5;i++)
        {
            System.out.println(ar[i]);
        }

    }
}

