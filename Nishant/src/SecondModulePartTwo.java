public class SecondModulePartTwo
{
    public static void main(String[] args) {
        //Question 8
        /*
            class Vehicle
            {
                private String companyName;
                private String model;
                private String type;
                public Vehicle(String companyName, String model, String type)
                {
                    this.companyName = companyName;
                    this.model = model;
                    this.type = type;
                }
                public String toString()
                {
                    return this.companyName+"\n"+this.model+" "+this.type;
                }
            }
            class Engine extends Vehicle
            {
                private int noOfCylinders;
                private int engineVolume;
                public Engine(String companyName, String model, String type, int noOfCylinders, int engineVolume)
                {
                    super(companyName, model, type);
                    this.noOfCylinders = noOfCylinders;
                    this.engineVolume = engineVolume;
                }
                public String toString()
                {
                    return super.toString()+"\n"+this.noOfCylinders+" "+this.engineVolume;
                }
            }
            class Safety extends Vehicle
            {
                private String abs; private String airbags;
                public Safety(String companyName, String model, String type, String abs, String airbags)
                {
                    super(companyName, model, type);
                    this.abs = abs;
                    this.airbags = airbags;
                }
                public String toString()
                {
                    return super.toString()+"\n"+"airbags: " +this.airbags+" abs: "+this.abs;
                }
            }
            class Features extends Vehicle
            {
                private String infotainment;
                private int ac_system;
                private String sunroof;
                public Features(String companyName, String model, String type, String infotainment, int ac_system, String sunroof)
                {
                    super(companyName, model, type);
                    this.infotainment = infotainment;
                    this.ac_system = ac_system;
                    this.sunroof = sunroof;
                }
                public String toString()
                {
                    return super.toString()+"\n"+"infotainment: "+this.infotainment+"\nac_system: "+this.ac_system+"\nsunroof: "+this.sunroof;
                }
            }
            class real
            {
                public static void main(String[] args)
                {
                    Vehicle carr = new Vehicle("BMW", "SX", "Germen");
                    System.out.println(carr);
                }
            }
         */

        //Question 9
        /*
            class SuperClass
            {
                private String greet;
                public SuperClass(String greet)
                {
                    this.greet = greet;
                }
                public String toString()
                {
                    return greet + " World!";
                }
            }
            class SubClass extends SuperClass
            {
                public SubClass()
                {
                    super("Hello");
                }
            }
            class MainClass
            {
                public static void main(String[] args)
                {
                    SubClass HelloWorld = new SubClass();
                    System.out.println(HelloWorld);
                }
            }
         */

        //Question 10
        /*
            class Animal
            {
                void eat()
                {
                    System.out.println("Eating...");
                }
            }
            class Dog extends Animal
            {
                void bark()
                {
                    System.out.println("Barking...");
                }
            }
            class BabyDog extends Dog
            {
                void weep()
                {
                    System.out.println("Weeping...");
                }
            }
            class MultilevelInheritance
            {
                public static void main(String args[])
                {
                    Dog d=new BabyDog();
                    d.bark();
                    d.eat();
                }
            }
         */

        //Question 11
        /*
            class Increment
            {
                private int a = 5;
                public int b = 10;
            }
            public class CallByRefAndVal
            {
                public static void main(String[] args)
                {
                    int a = 4; int b = 7;
                    System.out.println("Before swapping, a = "+a+" and b = "+b ); swap(a, b);
                    System.out.println("After swapping, a = "+a+" and b = "+b);
                    Increment obj = new Increment();
                    System.out.println("Before increment b = "+obj.b); callByref(obj);
                    System.out.println("After increment b = "+obj.b);
                }
                public static void swap(int a, int b)
                {
                    int temp = 0;
                    temp = a;
                    b = a;
                    b = temp;
                }
                public static int callByref(Increment obj)
                {
            //        Can't Access of a
            //        obj.a = obj.a + 1;
                    obj.b = obj.b + 1;
                    return obj.b;
                }
            }
         */

        //Question 12
        /*
            abstract class Shape
            {
                public abstract double area();
            }
            class Circle_1 extends Shape
            {
                private double radius;
                public Circle_1(double rad)
                {
                    this.radius = rad;
                }
                @Override
                public double area()
                {
                    return 3.14*this.radius*this.radius;
                }
            }
            class Rectangle extends Shape
            {
                private double length;
                private double breadth;
                public Rectangle(double len, double brd)
                {
                    this.length = len;
                    this.breadth = brd;
                }
                public double area()
                {
                    return this.length*this.breadth;
                }
            }
            class Triangle extends Shape
            {
                private double base;
                private double height;
                public Triangle(double base, double height)
                {
                    this.base = base;
                    this.height = height;
                }
                public double area()
                {
                    return 0.5*this.height*this.base;
                }
            }
            class AreaofShape
            {
                public static void main(String[] args)
                {
                Shape triangle = new Triangle(4,8);
                System.out.println(triangle.area());
                Shape rectangle = new Rectangle(2,5);
                System.out.println(rectangle.area());
                }
            }
         */

        //Question 13
        /*
            import java.util.ArrayList;
            interface Readable
            {
                String read();
            }
            class textMessage implements Readable
            {
                private String sender;
                private String content;
                public textMessage(String sender, String content)
                {
                    this.sender = sender;
                    this.content = content;
                }
                public String getSender()
                {
                    return this.sender;
                }
                public String read()
                {
                    return this.content;
                }
            }
            class Book implements Readable
            {
                private String name;
                private ArrayList<String> pages;
                private int pageNumber;
                public Book(String name, ArrayList<String> pages)
                {
                    this.name = name;
                    this.pages = pages;
                    this.pageNumber = 0;
                }
                public String getName()
                {
                    return this.name;
                }
                public int pages()
                {
                    return this.pages.size();
                }
                public String read()
                {
                    String page = this.pages.get(this.pageNumber);
                    nextPage();
                    return page;
                }
                private void nextPage()
                {
                    this.pageNumber = this.pageNumber + 1;
                    if(this.pageNumber % this.pages.size() == 0)
                    {
                        this.pageNumber = 0;
                    }
                }
            }
            class sampleInheritance
            {
                public static void main(String[] args)
                {
                    ArrayList<String> pages = new ArrayList<>();
                    pages.add("Hello,Friends");
                    pages.add("I am Nick");
                    pages.add("Java is a great Language");
                    pages.add("Bye");
                    Book java = new Book("Java Program",pages);
                    for(int i = 0; i<java.pages(); i++)
                        {
                            System.out.println(java.read());
                        }
                }
            }
         */

        //Question 14
        /*
            package a;
            class Hello_14
            {
                private void printMessage()
                {
                    System.out.println("Hello");
                }
                public void fun()
                {
                    printMessage();
                }
            }
            package b;
            import a.Hello_14;
            public class World_14 extends Hello_14
            {
                public void printMessage() {
                    System.out.println("World");
                }

                public void printMessage(String message) {
                    System.out.println(message);
                }

                public static void main(String[] args) {
                    World_14 greet = new World_14();
                    greet.fun();
                    World_14 greet_2 = new World_14();
                    greet_2.printMessage();
                    World_14 greet_4 = new World_14();
                    greet_4.printMessage("Hello World");
                    //cant access printMessage()
                    Hello_14 greet_3 = new World_14();
                    greet_3.printMessage();
                }
            }
         */

        //Question 15
        /*
            import java.util.Scanner;
            class Rotation
            {
                public static void main(String[] args)
                {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter a string: ");
                    String string1 = scanner.nextLine();
                    System.out.println("Enter a string to be checked for rotation: ");
                    String string2 = scanner.nextLine();
                    System.out.println(isRotation(string1,string2));
                }
                public static String isRotation(String str1,String str2)
                {
                    if(str1.length()==str2.length())
                    {
                        for (int i = 0; i <= str1.length() - 2; i++)
                        {
                            String subStr = str1.substring(str1.length() - i - 1, str1.length()) + str1.substring(0, str1.length() - i - 1);
                            if (subStr.equals(str2))
                                {
                                    return "Both the strings are a rotation of each other";
                                }
                        }
                    }
                    else
                    {
                        return "Both the strings are not a rotation of each other";
                    }
                    return "Both the strings are not a rotation of each other";
                }
            }
         */
    }
}