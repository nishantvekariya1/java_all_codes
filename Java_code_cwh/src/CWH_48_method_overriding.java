class A
{
    public int a;
    public int harry()
    {
        return 4;
    }
    public void meth2()
    {
        System.out.println("I am  method 2 from class A");
    }
}
class B extends A
{
    @Override
    public void meth2()
    {
        System.out.println("I am  method 2 from class B");
    }
    public void meth3()
    {
        System.out.println("I am  method 3 from class B");
    }
}


public class CWH_48_method_overriding
{
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
