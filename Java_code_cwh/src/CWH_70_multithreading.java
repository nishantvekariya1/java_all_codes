class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while (i<10){
        System.out.println("My Thread 1 is Cooking");
        System.out.println("i am cooking!");
        i++;
        }
    }
}
class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while (i<10){
        System.out.println(" My Thread 2 is Chating");
        System.out.println("i am chating");
        i++;
        }
    }
}


public class CWH_70_multithreading
{
    public static void main(String[] args) {
        //void sum (int a , int b) // where a and b is parameter and But sum(5,7) 5 and 7 are actual arguments
        // Concurrency => is the task of running and managing the multiple computations at the same time
        // Parallelism => is the task of running multiple computations simultaneously

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start(); // start() for running thread class's method
        t2.start();

    }
}
