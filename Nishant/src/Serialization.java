import java.io.*;
import java.io.IOException;
public class Serialization
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
    Student_st s1 = new Student_st(); s1.name = "Prem"; s1.rollno = 1; s1.cpi = 9.7;
    Student_st s2 = new Student_st(); s2.name = "Kavit"; s2.rollno = 2; s2.cpi = 9.9;
    FileOutputStream f =new FileOutputStream("text.txt");
    ObjectOutputStream o = new ObjectOutputStream(f);
    o.writeObject(s1);
    o.writeObject(s2);
    o.close();
    f.close();
    FileInputStream fi = new FileInputStream("text.txt");
    ObjectInputStream oi = new ObjectInputStream(fi);
    Student_st st1 = (Student_st) oi.readObject();
    Student_st st2 = (Student_st) oi.readObject();
    System.out.println(st1.toString()); System.out.println(st2.toString());
    oi.close();
    fi.close();
}
}
class Student_st implements Serializable
{
    int rollno;
    String name; double cpi;
    public String toString(){ return "NAME : "+name+ "  ROLL NO : "+rollno+"  CPI : "+cpi;
    }
}
