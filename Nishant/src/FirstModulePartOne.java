public class FirstModulePartOne
{
    public static void main(String[] args) {
//        Question1
        /*public class EnjoyCoding
        {
            public static void main(String[] ar)
            {
                //Whatever you write in this brackets that can be print by this statement.
                System.out.print("CODING IS FUN , ENJOY IT!");
            }
        }*/

//        Question2
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

//        Question3
        /*
        import java.util.Scanner;

public class maths
{
    public static void main(String[] args) {
        int a, b, add, sub, mul;
        float div;
        Scanner scanner = new Scanner(System.in);
        //Here new is allocating memory

        System.out.println("Enter your first number : ");
        a = scanner.nextInt();
        System.out.println("Enter your second number : ");
        b = scanner.nextInt();

        add = a + b;
        sub = a - b;
        mul = a * b;
        div = (float) a / b;
        //int/int answer is integer but here write float to convert integer into float

        System.out.println("addition is : " + add);
        System.out.println("subtraction is :" + sub);
        System.out.println("multiplication is :" + mul);
        System.out.println("division is :" + div);
    }
}
         */

//        Question4
        /*
        import java.util.Scanner;

public class Marksheet
{
    public static void main(String[] args)
    {
        float a,b,c,d,e,f,marks;
        float percentage;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your 1 subject mark : ");
        a = scanner.nextInt();
        System.out.print("Enter your 2 subject mark : ");
        b = scanner.nextInt();
        System.out.print("Enter your 3 subject mark : ");
        c = scanner.nextInt();
        System.out.print("Enter your 4 subject mark : ");
        d = scanner.nextInt();
        System.out.print("Enter your 5 subject mark : ");
        e = scanner.nextInt();
        System.out.print("Enter your 6 subject mark : ");
        f = scanner.nextInt();

        marks = a+b+c+d+e+f;
        System.out.println("your total marks is : "+marks);
        percentage = marks/6;
        System.out.print("your percentage is : "+percentage);
    }
}
         */

//        Question5
        /*
import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] ar)
    {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        num3 = sc.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println("The largest number is : "+num1);
        } else if (num2>num1 && num2>num3)
        {
            System.out.println("The largest number is : "+num2);
        }
        else
        {
            System.out.println("the largest number is : "+num3);
        }
    }
}
         */

//        Question6
        /*
import java.util.Scanner;

public class ConsonantVowel
{
    public static void main(String[] args)
    {
        int vCount = 0, cCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)

        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                vCount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                cCount++;
            }
        }
        System.out.println("Number of vowels : "+vCount);
        System.out.println("Number of consonant : "+cCount);
    }
}
         */

//        Question7
        /*
import java.util.Scanner;

public class Cap
{
    public static void main(String[] args)
    {
        System.out.println("Enter line : ");
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        char c;
        int ct=0;
        for (int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>=65 && c<=90)
            {
                ct++;
            }
        }
        System.out.println("Total number of words start with capital letters are : "+ ct);
    }
}

         */

    }
}
