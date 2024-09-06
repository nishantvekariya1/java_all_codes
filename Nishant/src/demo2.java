package pack2;
import pack1.*;
public class demo2 extends demo1

{

    public void printMessage()

    {
        System.out.println("Printing message from - package p2");
    }

    public static void main(String[] args)

    {

        demo1 obj = new demo2();

        obj.printMessage();
    }
}