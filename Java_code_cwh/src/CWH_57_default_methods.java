interface MyCamera{
    void takeSnap();
    void recordVideo();
    // When default logic is so big then it is use and that is private so we can't use in MySmartPhone
    // But it is use in default method So we have to calling into the default method
    // We can not use this private method directly
    private void greet()
    {
        System.out.println("Good Morning");
    }
    // By using default we have implement method here So we don't need to implement compulsory to in MySmartPhone
    // We can not force this method to use that's why here default method use
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber)
    {
        System.out.println("Call Number "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
    public void takeSnap() {
        System.out.println("Taking Snap");
    }
    public void recordVideo() {
        System.out.println("Recording Video");
    }
    // We can override method here
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
}
public class CWH_57_default_methods
{
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
//        ms.greet(); // --> Throws an error
        ms.record4KVideo();
        String[] ar = ms.getNetworks();
        for (String item:ar) {
            System.out.println(item);
        }
    }
}
