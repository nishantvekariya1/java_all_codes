import java.util.Scanner;

public class CWH_18_elseif
{
    public static void main(String[] args) {
        String str = "Shubham";
        switch (str) {
            case "Shubham" -> System.out.println("You are going to become an adult!");
            case "Saurav" -> System.out.println("You are going to join a job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy your life!");
        }

        /*
        char var = 'r';
        switch(var){
            case 'r':
                System.out.println("You are going to become an adult!");
                break;
            case 'c':
                System.out.println("You are going to join a job!");
                break;
            case 'd':
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
         */

        /*
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced");
        }
        else if (age>46){
            System.out.println("You are semi experienced");
        }
        else if (age>36){
            System.out.println("You are semi semi experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
         */

        System.out.println("Thanks for using my java code!");
    }
}
