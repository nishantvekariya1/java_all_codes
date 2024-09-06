import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ElevatorDemo1 {
    public static void main(String args[])
    {
        Elevator el = new Elevator();
        ElevatorThread et = new ElevatorThread(el);
        PassengerThread pt1 = new PassengerThread(el,5,2);
        PassengerThread pt2 = new PassengerThread(el,5,3);
        PassengerThread pt4 = new PassengerThread(el,5,4);
        PassengerThread pt5 = new PassengerThread(el,5,1);
        PassengerThread pt6 = new PassengerThread(el,5,2);
        PassengerThread pt3 = new PassengerThread(el,3,6);

        Thread t1 = new Thread(et);
        Thread t2 = new Thread(pt1);
        Thread t3 = new Thread(pt2);
        Thread t4 = new Thread(pt3);
        Thread t5 = new Thread(pt4);
        Thread t6 = new Thread(pt5);
        Thread t7 = new Thread(pt6);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
class Elevator
{
    int status, floor,current_capacity;
    final int max_capacity = 4;
    {status = 1; floor = 0; current_capacity = 0;}
    void change_floor(){
        if(floor == 6 && status == 1) status = 2;
        if(floor == 0 && status == 2) status = 1;
        //try{Thread.sleep(1000);}catch(Exception e){}
        if(status == 1) floor++;  else floor--;
        System.out.println("Lift reaches to floor "+ floor);

    }


    synchronized void increase_capacity() throws InterruptedException{
        if(current_capacity<max_capacity)
            current_capacity++;
        else Thread.sleep(1000);
    }
    void decrease_capacity(){
        current_capacity--;
    }
}

class ElevatorThread implements Runnable{
    final Elevator el;

    ElevatorThread(Elevator el)
    {
        this.el = el;
    }
    public void run(){

        while(true)
        {
            synchronized(el)
            {
                try{el.wait(1000);}  catch(Exception e){}
                el.change_floor();
                //        System.out.println(Thread.activeCount());
                el.notifyAll();
            }


        }
    }
}
class PassengerThread implements Runnable{
    final Elevator el;
    int direction, currentfloor, destination;
    boolean in;
    PassengerThread(Elevator el,int currentfloor, int destination){
        this.el = el;
        this.currentfloor = currentfloor;
        this.destination = destination;
        if(destination > currentfloor) {direction = 1;}
        else {direction = 2;}
        System.out.println(Thread.currentThread().getName()+"has been created");
    }
    @Override
    public void run() {
        synchronized(el){
            System.out.println(Thread.currentThread().getName()+" : I am waiting on floor "+ currentfloor+". The lift is on the floor "+el.floor);
            while(this.direction != el.status || this.currentfloor != el.floor || el.current_capacity==el.max_capacity)
            {
                try {
                    el.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(PassengerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            try{el.increase_capacity();} catch(Exception e){}
            in = true;
            System.out.println(Thread.currentThread().getName()+" :Now I am in the lift at the floor"+el.floor);



            while(el.floor!=destination)
            {
                try {
                    el.wait();

                } catch (InterruptedException ex) {
                    Logger.getLogger(PassengerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            in = false;
            el.decrease_capacity();
            System.out.println(Thread.currentThread().getName() +" :Now I am out of lift at the floor"+ el.floor);

        }
    }
}
