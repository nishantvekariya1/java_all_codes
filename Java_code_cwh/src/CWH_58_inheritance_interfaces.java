interface sampleInterface{
    void math1();
    void math2();
}
interface childSampleInterface extends sampleInterface{
    void math3();
    void math4();
}
class MySampleClass implements childSampleInterface{
    public void math1() {
        System.out.println("Meth1");
    }
    public void math2() {
        System.out.println("Meth2");
    }
    public void math3(){
        System.out.println("Meth3");
    }
    public void math4(){
        System.out.println("Meth4");
    }
}

public class CWH_58_inheritance_interfaces
{
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.math1();
        obj.math2();
        obj.math3();
        obj.math4();
    }
}
