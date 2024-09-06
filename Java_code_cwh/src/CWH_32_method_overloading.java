public class CWH_32_method_overloading
{
//    static void tellJoke()
//    {
//        System.out.println("I invented new word!\n"+ "Plagiarism");
//    }
////
//    static void change(int a)
//    {
//        a = 98;
//    }
//
//    static void change2(int[] arr)
//    {
//        arr[0] = 98;
//    }

    static void foo()
    {
        System.out.println("Good morning bro!");
    }

    static void foo(int a)
    {
        System.out.println("Good morning "+a+" bro!");
    }

    static void foo(int a,int b)
    {
        System.out.println("Good morning "+a+" bro!");
        System.out.println("Good morning "+b+" bro!");
    }

    public static void main(String[] args) {
//        tellJoke();

        //Case 1: Changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after change is: "+x);

        //Case 2: Changing the array
//        int[] marks = {52, 73, 77,89, 98, 94};
//        change2(marks);
//        System.out.println("The value after change is: "+marks[0]);

        //Method Overloading
        foo();
        foo(3000);
        foo(3000,4000);

    }
}
