//import java.util.LinkedList;
//
//public class PCDemo
//{
//    public static void main(String[] args) {
//        MyList ml = new MyList();
//        consumer c1 = new consumer(ml);
//        producer p1 = new producer(ml);
//        p1.start();
//        c1.start();
//
//    }
//}
//class MyList
//{
//    LinkedList<Integer> ll = new LinkedList<>();
//    void produce() throws InterruptedException{
//        int value = 0;
//
//        while(true){
//            ll.add(++value);
//            System.out.println("Produce"+value);
//            Thread.sleep(1000);
//        }
//    }
//
//    void consume() throws InterruptedException{
//        int value;
//
//        while(true){
//            value = ll.removeFirst();
//            System.out.println("Consumed"+value);
//            Thread.sleep(1000);
//        }
//    }
//
//}
//class producer extends Thread
//{
//    MyList p1;
//    producer(MyList ll){
//        p1 = ll;
//
//        public void run()
//        {
//            try{ p1.produce();}
//            catch(InterruptedException ie) { }
//        }
//    }
//}
//class consumer extends Thread
//{
//    MyList p1;
//    consumer(MyList ll){
//        p1 = ll;
//
//        public void run()
//        {
//            try{
//                p1.consume();
//            }
//            catch(InterruptedException ie){
//
//            }
//        }
//    }
//}