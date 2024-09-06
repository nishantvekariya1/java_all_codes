public class SecondModulePartOne
{
    public static void main(String[] args) {
        //Question 1
        /*
            class CalcDist
            {
                public static void main(String[] args)
                {
                    Distance_1 p = new Distance_1();
                    System.out.println(p.calcDistance(7,5));

                }
            }
            class Distance_1
            {
                public int calcDistance(int endPoint, int startPoint)
                {
                        return endPoint - startPoint;
                }
            }
         */

        //Question 2
        /*
            public class Varlength
            {
                public static void display(int num, String... values)
                {
                    System.out.println("Number is "+num);
                    for(String s:values)
                    {
                        System.out.println(s);
                    }
                }
                public static void main(String[] args)
                {
                    display(50000,"Hello");
                    display(99999,"I","am","Boss");
                }
            }
         */

        //Question 3
        /*
            class Distance_3
            {
                private int startPoint; private int endPoint;
                public Distance_3(int sp, int ep)
                {
                    startPoint = sp;
                    endPoint = ep;
                }
                public int calcDistance()
                {
                    return endPoint - startPoint;
                }
            }
            class calcDist
            {
                public static void main(String[] args)
                {
                    Distance_3 p = new Distance_3(9,15);
                    System.out.println(p.calcDistance());
                }
            }
         */

        //Question 4
        /*
            class Distance_4
            {
                private int startPoint;
                private int endPoint;
                public Distance_4(int ep)
                {
                    startPoint = 0;
                    endPoint = ep;
                }
                public Distance_4(int sp, int ep)
                {
                    startPoint = sp;
                    endPoint = ep;
                }
                public Distance_4(Distance_4 p)
                {
                    this.endPoint = p.endPoint;
                    this.startPoint = p.startPoint;
                }
                public int calcDistance()
                {
                    return endPoint - startPoint;
                }
            }
            class calDist
            {
                public static void main(String[] args)
                {
                    Distance_4 p1 = new Distance_4(7,10);
                    System.out.println(p1.calcDistance());
                    Distance_4 p2 = new Distance_4(p1);
                    System.out.println(p2.calcDistance());
                    Distance_4 p3 = new Distance_4(5);
                    System.out.println(p3.calcDistance());
                }
            }
         */

        //Question 5
        /*
            class Pointer
            {
                private int num;
                public Pointer(int num)
                {
                    this.num = num;
                }
                public Pointer()
                {
                    this(7);
                }
                public String toString()
                {
                    return Integer.toString(this.num);
                }
            }

            class calcDist
            {
                public static void main(String[] args)
                {
                    Pointer p = new Pointer();
                    System.out.println(p);
                }
            }
         */

        //Question 6
        /*
            class Point_1
            {
                private double x;
                private double y;
                Point_1(double x, double y)
                {
                    this.x = x; this.y = y;
                }
                public static double distance(Point_1 p1, Point_1 p2)
                {
                    return Math.sqrt(Math.pow((p2.y-p1.y),2)+Math.pow((p2.x-p1.x),2));
                }
                public double distance(Point_1 p)
                {
                    return Math.sqrt(Math.pow((this.y-p.y),2)+Math.pow((this.x-p.x),2));
                }
                public static Point_1 midPoint(Point_1 p1, Point_1 p2)
                {
                    double x_mid = (p1.x + p2.x)/2;
                    double y_mid = (p1.y + p2.y)/2;
                    Point_1 p3 = new Point_1(x_mid, y_mid);
                    return p3;
                }
                public Point_1 midPoint(Point_1 p)
                {
                    double x_mid = (this.x + p.x)/2;
                    double y_mid = (this.y + p.y)/2;
                    Point_1 p3 = new Point_1(x_mid, y_mid);
                    return p3;
                }
                public String toString()
                {
                    return "("+Double.toString(this.x)+","+Double.toString(this.y)+")";

                }
            }
            class PointClass
            {
                public static void main(String[] args)
                {
                    Point_1 p1 = new Point_1(5,2);
                    Point_1 p2 = new Point_1(2,4);
                    System.out.println(Point_1.midPoint(p1,p2));
                    System.out.println(p1.distance(p2));
                }
            }
         */

        //Question 7
        /*
            public class SingleInheritance
            {
                public static void main(String[] args)
                {
                    Student_1 rohit = new Student_1("Rohit",18,9,"Oxford");
                    System.out.println(rohit);
                }
            }
            class Person
            {
                private String name; private int age;
                public Person(String name, int age)
                {
                    this.name = name; this.age = age;
                }
                public String toString()
                {
                    return this.name + ", "+ this.age+" Years.";
                }
            }
            class Student_1 extends Person
            {
                private int grade;
                private String schoolName;
                public Student_1(String name, int age, int grade, String schoolName)
                {
                    super(name, age); this.grade = grade;
                    this.schoolName = schoolName;
                }
                public String toString()
                {
                    return super.toString()+"\nGrade: "+this.grade+" School: "+this.schoolName;
                }
            }
         */
    }
}