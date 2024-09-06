public class DistaceConstructor
{
    public static void main(String[] ar)
    {
        DistaceConstructor obj1 = new DistaceConstructor();
        DistaceConstructor obj2 = new DistaceConstructor(78);
        DistaceConstructor obj3 = new DistaceConstructor(78,45);
    }
    DistaceConstructor()
    {
        System.out.println("Default value");
    }
    DistaceConstructor(int a)
    {
        int sp = a;
        System.out.println("Endpoint is "+sp);
    }
    DistaceConstructor(int a,int b)
    {
        int sp = b;
        int ep = a;
        int distance = ep - sp;
        System.out.println("Distance is "+distance);
    }
}