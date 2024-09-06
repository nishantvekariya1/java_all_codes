class Account{
    int balance;
    Account(int n){
        balance=n;//instance variable
    }
    synchronized void credit(int amt)
    {
        // by using "synchronized", this method can be accessed by one thread at a time So it lock
        //using synchronized
        System.out.println("Your Current Balance is"+balance);
        System.out.println("The Amount credited will be "+amt);
//        int bal = balance;
//        Thread.sleep(1000);
//        bal = bal+amt;
//        Thread.sleep(200);
//        balance = bal;
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){ }
        System.out.println("New balance will be"+balance);
    }
}
public class Hello {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        Account myacc= new Account(10000);
        MyThread m1= new MyThread(myacc,5000);//two thread means two process but work on same account
        MyThread m2= new MyThread(myacc,3000);
        m1.start();
        m2.start();
        // m1.join();
        System.out.println("Exit");
    }
}
class MyThread extends Thread{
    Account a1;
    int amount;

    MyThread(Account at,int amt){
        a1=at;
        amount=amt;
    }

    public void run(){
        a1.credit(amount);

        // for(int i =0;i<10;i++){
        //     System.out.println("HIII");

//           try
//            {
//                Thread.sleep(500);
//            }
//            catch(Exception e){
//
//            }

    }
}


/*
public class Hello {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        MyThread m1= new MyThread();
        MyThread m2= new MyThread();
        m1.start();
        m2.start();
        m1.join();
        System.out.println("Exit");
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("HIII");
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e){

            }

        }
    }
}
*/