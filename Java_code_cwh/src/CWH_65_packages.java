//import java.util.Scanner;
//import java.util.*; // All packages are imported

public class CWH_65_packages
{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in); // if you don't import any package you also write directly
        int a = sc.nextInt();
        System.out.println("This is my scanner "+a);
    }
}
