class MyEmployee
{
    private int id;
    private String name;
    public void setName(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int i)
    {
        this.id = i;
    }
    public int getId()
    {
        return id;
    }

}

//class Circle1
//{
//    private int radius;
//    private double area;
//    private double perimeter;
//    public void setRadius(int r)
//    {
//        this.radius=r;
//    }
//    public void getRadius()
//    {
//        System.out.println("The Radius of the circle is : "+ radius);;
//    }
//    public void setArea()
//    {
//        this.area = 3.14*radius*radius;
//    }
//    public double getArea()
//    {
//        return area;
//    }
//    public void setPerimeter()
//    {
//        this.perimeter=2*3.14*radius;
//    }
//    public double getPerimeter()
//    {
//        return perimeter;
//    }
//
//}

public class CWH_40_ch9
{
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id=45;
//        harry.name = "CodeWithHarry"; //-->Throws an error due to private access modifier means when we don't use set and get
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());

//        Circle1 cll = new Circle1();
//        cll.setRadius(4);
//        cll.getRadius();
//        cll.setArea();
//        System.out.println(cll.getArea());
//        cll.setPerimeter();
//        System.out.println(cll.getPerimeter());
    }
}