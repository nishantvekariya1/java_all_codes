abstract class Parent2{
    public Parent2(){
        System.out.println("Mai Parent2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am Good");
    }
}
public class CWH_53_abstract
{
    public static void main(String[] args) {
//        //abstract class ke child class ko ya vo abstract method contain kare ya to vo class khud abstract ban jaye
//        Parent2 p = new Parent2(); // This is not run becoz it is abstract class
//        //and if you run so whatever class that is child of parent2 usko run karva sakte ho.
        Child2 c = new Child2();
//        Child3 c2 = new Child3(); // This is also give error becoz this class also abstract
        }
}