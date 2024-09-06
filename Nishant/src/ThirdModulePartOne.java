public class ThirdModulePartOne
{
    public static void main(String[] args) {
        //Question 1
        /*
        import java.util.Scanner;
public class First
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("Enter first integer : ");
            x=input.nextInt();
            System.out.print("Enter second integer : ");
            y=input.nextInt();
            System.out.println(x + " / " + y +" = " + (x/y));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator Cannot be Zero while Division");
        }
    }
}
         */

        //Question 2
        /*
public class Second
{
        public static void main(String[] args)
        {
                String[] arr = {"ABC","EFG","PQR","XYZ"};
                for(int i=0;i<=arr.length;i++)
                {
                        System.out.println(arr[i]);
                }
        }
}
         */

        //Question 3
        /*
public class Third
{
        public static void main(String [] args)
        {
                try
                {
                int[] a =new int[10];
                // displaying element at index 12
                System.out.println(a[12]);
                // another try block
                try {
                System.out.println("Division");
                int res = 100/ 0;
                }
                catch (ArithmeticException ex2)
                {
                        System.out.println("Sorry! Division by zero isn't feasible!");
                }
                }
                catch (ArrayIndexOutOfBoundsException ex1)
                {
                        System.out.println("ArrayIndexOutOfBoundsException");
                }
        }
}
         */

        //Question 4
        /*
import java.util.Scanner;
public class Fourth
{
        static Scanner sc = new Scanner(System.in);
        String name, account;
        int bal;
        Tenth ()
        {
                name = "(Customer name)";
                account = "(account value)";
                bal = 1000;
        }
        public static void main(String[] args)
        {
                Fourth object1 = new Fourth();
                int selection;
                boolean check = true;
                int amount;
                do
                {
                        System.out.println("\nEnter a choice \n1: Withdraw \n2: Deposit \n3: Exit");
                        selection = sc.nextInt();
                        switch(selection)
                        {
                                case 1:
                                {
                                System.out.println("Please enter amount to be withdrawn");
                                amount = sc.nextInt();
                                if(checkBal(object1, amount))
                                {
                                        (object1).bal = (object1).bal - amount;
                                        System.out.println("Amount withdrawn: "+ amount +", New Balance: "+ (object1).bal);
                                }
                                else
                                {
                                        System.out.println("Insufficient balance to withdraw given amount");
                                }
                                break;
                                }
                                case 2:
                                {
                                        System.out.println("Please enter amount to be deposited");
                                        amount = sc.nextInt();
                                        (object1).bal = (object1).bal + amount;
                                        System.out.println("Amount deposited: "+ amount +", New Balance: "+ (object1).bal);
                                        break;
                                }
                                case 3:
                                {
                                        check = false; break;
                                }
                                default:
                                {
                                        System.out.println("Enter valid input");
                                }
                        }
                }
                while(check);
        }
        public static boolean checkBal(Fourth p1, int withdrawing)
        {
                if(p1.bal>= withdrawing)
                {
                        return true;
                }
                else
                {
                        return false;
                }
        }
}
         */

        //Question 5
        /*

         */

        //Question 6
        /*

         */

        //Question 7
        /*

         */

    }
}
