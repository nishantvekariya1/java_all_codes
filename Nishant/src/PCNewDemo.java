//import java.util.LinkedList;
//import java.util.Vector;
//
///**
// *
// * @author admin
// */
//public class PCNewDemo {
//
//    public static void main(String args[])
//    {
//        LinkedList<Integer>l = new LinkedList<>();
//        Producer p1 = new Producer(l,5);
//        Consumer c1 = new Consumer(l);
//        p1.start();
//        c1.start();
//    }
//}
//
//class Producer extends Thread{
//    final LinkedList<Integer> l;
//    int capacity;
//    int i = 0;
//    Producer(LinkedList<Integer> l, int capacity)
//    {
//        this.l = l;
//        this.capacity = capacity;
//    }
//
//    @Override
//    public void run()
//    {
//        while(true)
//        {
//            synchronized(l)
//            {
//                if(l.size()==capacity)
//                {try{  l.wait(); } catch(InterruptedException ie){}}
//                l.add(++i);
//                System.out.println(this.getName()+" : Value added "+i);
//                l.notify();
//            }
//        }
//    }
//}
//class Consumer extends Thread{
//    final LinkedList<Integer> l;
//    int i;
//    Consumer(LinkedList<Integer> l)
//    {
//        this.l = l;
//    }
//
//    public void run()
//    {
//        while(true)
//        {
//            synchronized(l)
//            {
//                if(l.isEmpty())
//                    try{  l.wait(); } catch(InterruptedException ie){}
//                i = l.removeFirst();
//                System.out.println("Elemet "+i+" Removed");
//                l.notify();
//            }
//        }
//    }
//}