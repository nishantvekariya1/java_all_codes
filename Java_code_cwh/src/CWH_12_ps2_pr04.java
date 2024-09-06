import java.util.Scanner;

public class CWH_12_ps2_pr04
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of v,u,a and s accordingly : ");
        float v = sc.nextFloat();
        float u = sc.nextFloat();
        float a = sc.nextFloat();
        float s = sc.nextFloat();
        float exp = (v*v - u*u)/(2*a*s);
        System.out.println("your answer is "+exp);
    }
}
