class MyThreadRunnable1 implements Runnable
{
    public void run()
    {
        int i=0;
        while (i<20) {
            System.out.println("I am a Thread 1 not a thread");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable
{
    public void run()
    {
        int i=0;
        while (i<20) {
            System.out.println("I am a Thread 2 not a thread");
            i++;
        }
    }
}

public class CWH_71_runnable
{
    public static void main(String[] args) {
//        MyThreadRunnable1 t1 = new MyThreadRunnable1();
//        MyThreadRunnable1 t2 = new MyThreadRunnable2();
//        t1.start(); // Here we cannot directly(imply this start()) start
//        t2.start(); // Here we cannot directly(imply this start()) start

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
