interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber)
    {
        System.out.println("Call Number "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
    public void takeSnap() {
        System.out.println("Taking Snap");
    }
    public void recordVideo() {
        System.out.println("Recording Video");
    }
//    public void record4KVideo() {
//        System.out.println("Taking snap and recording in 4K video");
//    }
    public String[] getNetworks() {
        System.out.println("Getting List of NetWorks");
        String[] networkList = {"Harry","Proper4G","Bob5G"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }
    public void sampleMeth(){
        System.out.println("Meth");
    }
}

public class CWH_59_polymorphism
{
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); //This is a smartphone but use it as a camera
//        cam1.getNetworks(); //--> Not allowed
//        cam1.sampleMath(); //--> Not allowed
        cam1.record4KVideo();
        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.getNetworks();
        s.recordVideo();
        s.callNumber(108);
    }
}