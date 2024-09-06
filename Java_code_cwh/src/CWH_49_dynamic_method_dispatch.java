class Phone
{
    public void showTime(){
        System.out.println("Time is 8");
    }
    public void on(){
        System.out.println("Turning on phone..");
    }
}
class SmartPhone extends Phone
{
    public void music(){
        System.out.println("Aapka seagat hai");
    }
    public void on(){
        System.out.println("Turning on smartphone..");
    }
}


public class CWH_49_dynamic_method_dispatch
{
    public static void main(String[] args) {
//        Phone obj = new Phone(); // Allowed
//        SmartPhone smobj = new SmartPhone(); // Allowed
//        obj.name();

        Phone obj = new SmartPhone(); // Phone (reference) to obj (smartphone) koi bhi smartphone phone hai.
//        SmartPhone obj2 = new Phone(); // this give error and koi bhi phone smartphone hai So it is wrong
        obj.on(); // Obj means Reference hai vo phone ka hai lekin jo actual obj jo create ho raha hai vo smartphone
        // yani obj ka run hoga
        //obj ka creation[new SmartPhone();] run time pe hoga
//        obj.music(); // Not allowed
    }
}