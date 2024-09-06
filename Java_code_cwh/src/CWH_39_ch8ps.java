//class Employee
//{
//    int salary;
//    String name;
//
//    public int getSalary()
//    {
//        return salary;
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public void setName(String n)
//    {
//        name = n;
//    }
//}

//class CellPhone{
//    public void ring()
//    {
//        System.out.println("Ringing...");
//    }
//    public void vibrate()
//    {
//        System.out.println("Vibrating...");
//    }
//    public void callFriend()
//    {
//        System.out.println("Call Rahul...");
//    }
//}

//class Square
//{
//    int side;
//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//}

//class Rectangle
//{
//    int length,breadth;
//    public int area()
//    {
//        return length*breadth;
//    }
//    public int perimeter()
//    {
//        return (2*length)+(2*breadth);
//    }
//}

//class Tommy
//{
//    public void hit()
//    {
//        System.out.println("Hitting the enemy");
//    }
//    public void run()
//    {
//        System.out.println("Running from the enemy");
//    }
//    public void fire()
//    {
//        System.out.println("firing the enemy");
//    }
//}

class Circle
{
    double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}





public class CWH_39_ch8ps
{
    public static void main(String[] args) {
        // Problem 1
//        Employee harry = new Employee();
//        harry.setName("CodeWithHarry");
//        harry.salary = 233;
//        System.out.println(harry.getSalary());
//        System.out.println(harry.getName());

        // Problem 2
//        CellPhone asus = new CellPhone();
//        asus.callFriend();
//        asus.vibrate();
//        asus.ring();

        // Problem 3
//        Square sq = new Square();
//        sq.side=5;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        // Problem 4
//        Rectangle rc = new Rectangle();
//        rc.length=5;
//        rc.breadth=4;
//        System.out.println(rc.area());
//        System.out.println(rc.perimeter());

        // Problem 5
//        Tommy player1 = new Tommy();
//        player1.fire();
//        player1.run();
//        player1.hit();

        // Problem 6
        Circle cl = new Circle();
        cl.radius=5;
        System.out.println(cl.area());
        System.out.println(cl.perimeter());

    }
}
