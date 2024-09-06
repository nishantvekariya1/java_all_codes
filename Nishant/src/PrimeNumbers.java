import java.util.Scanner;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
        int num, count;
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i=1; i<=num; i++)
        {
            count = 0;
            for (int j =2; j<= i/2; j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if (count==0)
            {
                System.out.println(i);
            }
        }
    }
}
/*
import java.util.Scanner;

public class primeNumber
{
    public static void main(String[] args)
    {
        int k = 2;
        boolean flag;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many prime numbers you want: ");
        int n = sc.nextInt();
        while(count<n)
        {
            flag = true;
            for (int i = 2; i <= Math.sqrt(k); i++)
            {
                if(k%i==0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag==true)
            {
                System.out.println(k+" is prime");
                count++;
            }
            k++;
        }
    }
}
 */