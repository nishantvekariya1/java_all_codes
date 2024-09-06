//class Cylinder
//{
//    private int radius;
//    private int height;
//
//    public Cylinder(int r, int h)
//    {
//        this.radius = r;
//        this.height = h;
//    }
//
//    public void setRadius(int r)
//    {
//        radius = r;
//    }
//    public int getRadius()
//    {
//        return radius;
//    }
//    public void setHeight(int h)
//    {
//        height = h;
//    }
//    public int getHeight()
//    {
//        return height;
//    }
//    public double surfaceArea()
//    {
//        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
//    }
//    public double volume()
//    {
//        return Math.PI*radius*radius*height;
//    }
//}

//class Rectangle
//{
//    private int length;
//    private int breadth;
//    public Rectangle()
//    {
//        this.length = 4;
//        this.breadth = 5;
//    }
//    public Rectangle(int l,int b)
//    {
//        this.length = l;
//        this.breadth = b;
//    }
//    public int getLength()
//    {
//        return length;
//    }
//    public int getBreadth()
//    {
//        return breadth;
//    }
//}

class Sphere
{
    private int radius;

    public void setRadius(int r)
    {
        radius = r;
    }
    public int getRadius()
    {
        return radius;
    }
    public double surfaceArea()
    {
        return 4*Math.PI*radius*radius;
    }
    public double volume()
    {
        return (4*Math.PI*radius*radius*radius)/3;
    }
}


public class CWH_44_ps09
{
    public static void main(String[] args) {
        //Problem 1
//        Cylinder cy = new Cylinder();
//        cy.setRadius(5);
//        cy.setHeight(15);
//        System.out.println("The Radius of Cylinder is :"+cy.getRadius());
//        System.out.println("The Height of Cylinder is :"+cy.getHeight());

        //Problem 2
//        System.out.println("The surface Area of Cylinder is :"+cy.surfaceArea());
//        System.out.println("The Volume of Cylinder is :"+cy.volume());

        //Problem 3
//        Cylinder cy = new Cylinder(9,12);
//        System.out.println("The surface Area of Cylinder is :"+cy.surfaceArea());
//        System.out.println("The Volume of Cylinder is :"+cy.volume());

        //Problem 4
//        Rectangle r = new Rectangle();
//        System.out.println(r.getLength());
//        System.out.println(r.getBreadth());

        //Problem 5
        Sphere sp = new Sphere();
        sp.setRadius(5);
        System.out.println("The Radius of Sphere is : "+sp.getRadius());
        System.out.println("The Surface Area of Sphere is :"+sp.surfaceArea());
        System.out.println("The Volume of Sphere is :"+sp.volume());

        //Problem 6


    }
}
