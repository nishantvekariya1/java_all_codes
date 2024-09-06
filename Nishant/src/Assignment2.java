import java.util.*;

class Course {
    int coursecode;
    String coursename;
    double marks;

    Course(int a, String b, double c) {
        this.coursecode = a;
        this.coursename = b;
        this.marks = c;
    }
}

class Student {
    Scanner sc = new Scanner(System.in);
    int roll_no;
    String name;
    static int i = 0;
    ArrayList<Course> courses = new ArrayList<>();
    int total_marks;
    static int highest_marks;

    Student(int a, String b) {
        this.name = b;
        this.roll_no = a;
        int z = 0;
        int tl = 0;
        while (z < Student.i) {
            System.out.println("For " + (z + 1) + " course please provide:");
            System.out.print("Course Name: ");
            String w = sc.next();
            System.out.print("Course Code: ");
            int x = sc.nextInt();
            System.out.print("Marks achieved: ");
            double y = sc.nextDouble();
            this.courses.add(new Course(x, w, y));
            tl += y;
            z++;
        }
        this.total_marks = tl;
    }

    static void High_marks(ArrayList<Student> s) {
        Student.highest_marks = 0;
        for (Student a : s) {
            if (Student.highest_marks < a.total_marks) {
                Student.highest_marks = a.total_marks;
            }
        }
        System.out.println("The highest marks in given student list is " + Student.highest_marks);
    }
}

public class Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of students in space given below: ");
        int t = sc.nextInt();
        System.out.println("Write the number of courses in space given below: ");
        Student.i = sc.nextInt();
        ArrayList<Student> arraystu = new ArrayList<>();
        for (int j = 0; j < t; j++) {
            System.out.println("Write the name of " + (j + 1) + " student here: ");
            String m = sc.next();
            System.out.println("Write the roll number here: ");
            int n = sc.nextInt();
            arraystu.add(new Student(n, m));
        }
        System.out.println("To check the highest marks type(Y/N): ");
        String yn = sc.next();
        switch (yn) {
            case "Y" -> Student.High_marks(arraystu);
            case "N" -> System.out.println("Thanks for visiting the app...");
            default -> System.out.println("Wrong chracter. Terminating.....");
        }
    }

}
