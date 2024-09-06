public class CWH_17_logical
{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("For Logical AND...");
        if (a && b)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        System.out.println("For Logical OR...");
        if (a || b)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        System.out.println("For Logical NOT...");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
