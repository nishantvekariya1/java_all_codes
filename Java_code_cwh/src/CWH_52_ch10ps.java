class Circle1
{
    public int radius;
    Circle1()
    {
        System.out.println("i am not param of circle");
    }
    Circle1(int r)
    {
        System.out.println("i am circle parameterized constructor");
        this.radius = r;
    }
    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder1 extends Circle1
{
    public int height;
    Cylinder1(int r,int h){
        super(r);
        System.out.println("i am cylinder1 parameterized constructor");
        this.height = h;

    }
    public double volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }
}

class Rectangle
{
    public int length;
    public int width;
    Rectangle(int l,int w)
    {
        this.length = l;
        this.width = w;
        System.out.println("i am from Rectangle class.");
    }
    public int area()
    {
        return this.length*this.width;
    }
}
class Cuboid extends Rectangle
{
    Cuboid(int l,int w)
    {
        super(l,w);
        System.out.println("i am from cuboid class");
    }
    public int area()
    {
        return 6*this.length*this.width;
    }
}
public class CWH_52_ch10ps
{
    public static void main(String[] args) {
        // Problem 1
//        Circle1 objc = new Circle1(12);
//        Cylinder1 obj = new Cylinder1(12,4);

        // Problem 2
//        Cuboid cob = new Cuboid(5,8);
//        System.out.println(cob.area());

        // Problem 3
        // Create methods for area and volume in Q1

        // Problem 4
        // Create methods for area and volume in Q2 also create getters and setters.

    }
}