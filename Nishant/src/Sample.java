import java.util.Scanner;

//Oracle.com for any information regard to java
public class Sample
{
    public static void main(String[] args)
    {
        point p1 = new point(3,5);
        point p2 = new point(2,8);

        System.out.println(point.calculate(p1,p2));
        System.out.println(p1.calculate(p2));

        point mp = point.mid_point(p1,p2);

    }
}
class point
{
    int x,y;
    point()
    {

    }
    point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    static double calculate(point p1,point p2)
    {
        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
    }
    double calculate(point p2)
    {
        return Math.sqrt(Math.pow(this.x-p2.x,2)+Math.pow(this.y-p2.y,2));
    }
    static point mid_point(point p1,point p2)
    {
        point rp = new point();
        rp.x=(p1.x+p2.x)/2;
        rp.y=(p1.y+p2.y)/2;

        return rp;
    }
}