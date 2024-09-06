public class ThirdModulePartTwo
{
    public static void main(String[] args) {
        //Question 8
        /*

         */
        //Question 9
        /*

         */
        //Question 10
        /*

         */
        //Question 11
        /*
public class Eleventh
{
        public static void main(String[] args)
        {
                Thread t = new Thread("My first thread");
                t.start();
                String str = t.getName();
                System.out.println(str);
        }
}
         */
        //Question 12
        /*
public class Twelth implements Runnable
{
        public void run()
        {
                System.out.println("Now the thread is running ...");
        }
        public static void main(String[] args)
        {
                Runnable r1 = new Twelth();
                Thread th1 = new Thread(r1, "My new thread");
                th1.start();
                String str = th1.getName();
                System.out.println(str);
        }
}
         */
        //Question 13
        /*
        import java.lang.*;
public class Theertenth extends Thread
{
        public void run()
        {
                System.out.println("Inside run method");
        }
        public static void main(String[] args)
        {
                Theertenth t1 = new Theertenth();
                Theertenth t2 = new Theertenth();
                Theertenth t3 = new Theertenth();
                System.out.println("t1 thread priority : "+ t1.getPriority());
                System.out.println("t2 thread priority : "+ t2.getPriority());
                System.out.println("t3 thread priority : "+ t3.getPriority());
                t1.setPriority(2);
                t2.setPriority(5);
                t3.setPriority(8);
                System.out.println("t1 thread priority : "+ t1.getPriority());
                System.out.println("t2 thread priority : "+ t2.getPriority());
                System.out.println("t3 thread priority : "+ t3.getPriority());
                System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
                System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
                Thread.currentThread().setPriority(10);
                System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
        }
}
         */
        //Question 14
        /*
import java.util.LinkedList;
public class Fourtenth
{
        public static void main(String[] args) throws InterruptedException
        {
                final PC pc = new PC();
                Thread t1 = new Thread(new Runnable()
                {
                        @Override
                        public void run()
                        {
                                try {
                                pc.produce();
                                }
                                catch (InterruptedException e) {
                                e.printStackTrace();
                                }
                        }
                });
                Thread t2 = new Thread(new Runnable()
                {
                        @Override
                        public void run()
                        {
                                try {
                                pc.consume();
                                }
                                catch (InterruptedException e) {
                                e.printStackTrace();
                                }
                        }
                });
                t1.start();
                t2.start();
                t1.join();
                t2.join();
        }
        public static class PC
        {
                LinkedList<Integer>list = new LinkedList<>();
                int capacity = 2;
        public void produce() throws InterruptedException
        {
                int value = 0;
                while (true)
                {
                        synchronized (this)
                                {
                                while (list.size() == capacity)
                                wait();
                                System.out.println("Producer produced-"+ value);
                                list.add(value++);
                                notify();
                                Thread.sleep(10);
                                }
                }
        }
        public void consume() throws InterruptedException
        {
                while (true)
                {
                        synchronized (this)
                                {
                                while (list.size() == 0)
                                wait();
                                int val = list.removeFirst();
                                System.out.println("Consumer consumed-"+ val);
                                notify();
                                Thread.sleep(10);
                                }
                }
        }
        }
}
         */
    }
}
