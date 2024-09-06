interface Bicycle{
    int a = 45; // Property bhi daal sakte hai
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowhornmhn();
}
class AvonCycle implements Bicycle,HornBicycle
{
//    public int x = 5; // This is different from HornBicycle's x & we have permission to override there is no compulsory to write
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment) {
        System.out.println("Applying speedUp");
    }
    public void blowHornK3g() {
        System.out.println("Kabhi khushi kabhi gum pee pee");
    }
    public void blowhornmhn() {
        System.out.println("Main hoon na po po po po");
    }
}

public class CWH_54_interfaces
{
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in interfaces
        System.out.println(cycleHarry.a);
        // you can not modify the properties in interfaces as they are final
//        cycleHarry.a = 454;
//        System.out.println(cycleHarry.a);
        cycleHarry.blowHornK3g();
        cycleHarry.blowhornmhn();
    }
}
// Abstract => There is only one child of parent class
// Interface => Ek se zyada implements kar sakte ho yani bahot sare implents se ek class bana sakte ho
// uper se ek class extend kar sakte hai
// Interface ki sari properties final hi hogi.