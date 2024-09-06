class Base
{
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting x now.");
        this.x = x;
    }
    public void printMe()
    {
        System.out.println("I am a Constructor.");
    }
}
// Using extend function you provide all base facilities to derived class
// But you also define different facilities to derived class means base ka beta derived hai.
// So base class => parent class,super class,base class
class Derived extends Base
{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_45_inheritance
{
    public static void main(String[] args) {
        //Creating an object of base class.
        Base b= new Base();
        b.setX(4); // Y is not access by base class.
        System.out.println(b.getX());

        //Creating an object of derived class.
        Derived d = new Derived();
        d.setX(43);
        d.setY(59);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}