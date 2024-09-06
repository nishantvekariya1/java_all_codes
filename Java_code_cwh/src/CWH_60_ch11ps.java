abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    void write() {
        System.out.println("Write");
    }
    void refill() {
        System.out.println("Refill");
    }
    void changeNib()
    {
        System.out.println("Changing the nib");
    }
}
// Question 3
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey {
    void jump()
    {
        System.out.println("Jumping...");
    }
    void bite()
    {
        System.out.println("Biting...");
    }
}
class Human extends Monkey implements BasicAnimal
{
    void Speak()
    {
        System.out.println("Hello sir..");
    }
    public void eat() {
        System.out.println("Eating");
    }
    public void sleep() {
        System.out.println("Sleeping");
    }
}
// Question 4
abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelePhone{

}
public class CWH_60_ch11ps
{
    public static void main(String[] args) {
        // P 1 and 2
//        fountainPen pen = new fountainPen();
//        pen.changeNib();
        // P 3
        Human harry = new Human();
        harry.sleep();

        // P 4


        // P 5
        Monkey m1 = new Human();
//        m1.speak(); //--> cannot use speak method because the reference is monkey which does not have speak method
        BasicAnimal lovish = new Human();
//        lovish.speak(); //--> throws an error
        lovish.eat();
        lovish.sleep();
        m1.jump();
        m1.bite();
    }
}
