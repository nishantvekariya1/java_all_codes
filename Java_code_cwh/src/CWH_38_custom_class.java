class Employee1
{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class CWH_38_custom_class
{
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry = new Employee1(); // Instantiating a new Employee Object
        Employee1 john = new Employee1(); // Instantiating a new Employee Object

        // Setting Attributes for harry
        harry.id=12;
        harry.salary = 34;
        harry.name="CodeWithHarry";

        // Setting Attributes for john
        john.id=14;
        john.salary = 12;
        john.name="john Tripathi";

        // Print the Attributes
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
