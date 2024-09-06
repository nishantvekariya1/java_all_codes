public class CWH_42_constructor
{
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
//        MyMainEmployee harry = new MyMainEmployee("Tony");
//        MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry",45);
        harry.setId(234);
        harry.setName("CodeWithHarry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());

        //Overloading Method
//        MainEmployee harry1 = new MainEmployee();
        MainEmployee harry1 = new MainEmployee(2000000);
        System.out.println(harry1.getSalary());
    }
}
class MyMainEmployee
{
    private int id;
    private String name;
    public MyMainEmployee()
    {
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName)
    {
        id = 1;
        name = myName;
    }
    public MyMainEmployee(String myName,int myId)
    {
        id = myId;
        name = myName;
    }
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
//Salary Overloading using Constructor
class MainEmployee
{
    private int salary;
    public MainEmployee()
    {
        salary = 10000;
    }
    public MainEmployee(int income)
    {
        salary = income;
    }
    public int getSalary()
    {
        return salary;
    }
}