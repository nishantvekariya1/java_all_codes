public class CWH_16_conditionals
{
    public static void main(String[] args) {
        int age = 26;
        boolean cond = age==18;
//        if (age>18)
        if (cond)
        {
            System.out.println("Yes boy you can drive.");
        }
        //else block is optional
        else
        {
            System.out.println("No boy you cannot drive yet!");
        }
    }
}