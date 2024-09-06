import java.util.Scanner;

public class CWH_13_strings
{
    public static void main(String[] args) {
        //String name = new String("Harry");
        //String name = "Harry";
        //System.out.print("The name is : ");
        //System.out.print(name);

        int a = 6;
        float b = 5.4568f;
        System.out.printf("The value of a is %d and The value of b is %f\n",a,b);
        System.out.printf("The value of a is %d and The value of b is %.2f\n",a,b); //Consider only 2 number after point
        System.out.printf("The value of a is %d and The value of b is %8.2f\n",a,b); //Total 8 number count
        System.out.format("The value of a is %d and The value of b is %f\n",a,b);

//        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();
//        System.out.println(st);
    }
}
