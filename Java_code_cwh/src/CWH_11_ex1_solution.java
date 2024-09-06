import java.util.Scanner;

public class CWH_11_ex1_solution
{
    public static void main(String[] args) {
        // Calculate percentage of 5 subject
        System.out.println("Enter your 5 subject marks out of the 100");
        Scanner sc = new Scanner(System.in);
        float mark1 = sc.nextFloat();
        float mark2 = sc.nextFloat();
        float mark3 = sc.nextFloat();
        float mark4 = sc.nextFloat();
        float mark5 = sc.nextFloat();
        float total = mark1+mark2+mark3+mark4+mark5;
        float percentage = total/5;
        System.out.println("Your percentage is "+percentage+" %");
    }
}