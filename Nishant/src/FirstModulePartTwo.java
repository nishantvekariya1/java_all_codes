public class FirstModulePartTwo
{
    public static void main(String[] args) {
        //        Question8
        /*
import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String stce = "";

        do {
            System.out.println("Enter a sentence: ");
            stce = sc.nextLine();

            if(stce.equals("quit"))
            {
                System.exit(0);
            }

            int count_vow = 0;

            for (int i = 0; i < stce.length(); i++)
            {
                boolean flag1 = stce.charAt(i)=='a' || stce.charAt(i)=='e' || stce.charAt(i)=='i' || stce.charAt(i)=='o'
                        || stce.charAt(i)=='u';

                boolean flag2 = stce.charAt(i)=='A' || stce.charAt(i)=='E' || stce.charAt(i)=='I' || stce.charAt(i)=='O'
                        || stce.charAt(i)=='U';

                if(flag1||flag2)
                {
                    count_vow++;
                }
            }
            System.out.println("The number of vowels in given above sentence are: "+count_vow+"\n");
        }while(!(stce.equals("quit")));
    }
}
         */

        //        Question9
        /*
import java.util.Scanner;

public class StreamPattern
{
    public static void main(String[] args)
    {
        int i,j,len,k;

        String str = new String();
        char ch[]=new char[25];
        Scanner s=new Scanner(System.in);

        System.out.print("\nEnter your string: ");
        str=s.nextLine();

        len=str.length();
        ch=str.toCharArray();
        k=len;

        for(i=len;i>=0;i--)
        {
            for(j=0;j<=len;j++)
            {
                if(i < j)
                {
                    System.out.print(ch[len-k] +" ");
                    k--;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
            k=len;
        }
    }
}
         */

        //        Question10
        /*
import java.util.Scanner;

public class StarPattern
{
    public static void main(String ar[])
    {
        int t,i,j;
        Scanner in= new Scanner(System.in);

        String s;
        int k;
        System.out.println("With Which Symbol you want to make Diamond??(Enter single char):");
        s=in.next();
        System.out.println("How many max "+s.charAt(0)+" :: ");
        t=in.nextInt();
        t--;
        for(i=0;i<t;i++)
        {
            System.out.print("\t\t\t\t");
            for(k=0;k<t-i;k++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print(s.charAt(0)+" ");
            }
            System.out.println(" ");
        }
        for(i=t;i>=0;i--)
        {
            System.out.print("\t\t\t\t");
            for(k=t-i;k>0;k--)
            {
                System.out.print(" ");
            }

            for(j=i;j>=0;j--)
            {
                System.out.print(s.charAt(0)+" ");
            }
            System.out.println(" ");
        }

    }
}
         */

        //        Question11
        /*
import java.util.Scanner;

public class IntegerToRoman
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the decimal number between 1 to 99: ");
        int num = sc.nextInt();

        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        String roman = tens[num%100/10]+units[num%10];

        System.out.println("The roman number of "+num+" is: "+roman);
    }
}
         */

        //        Question12
        /*
import java.util.Scanner;

public class AreaOfGeometric
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the radius of the circle: ");
        double r = sc.nextDouble();
        System.out.println("Enter the value of length of the square: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of length and breadth of the rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        double circ_area = findArea(r);
        int square_area = findArea(a);
        int rect_area = findArea(l, b);

        System.out.println("The area of the circle is: "+circ_area);
        System.out.println("The area of the rectangle is: "+square_area);
        System.out.println("The area of the rectangle is: "+rect_area);
    }
    static double findArea(double radius)
    {
        return Math.PI*radius*radius;
    }
    static int findArea(int length)
    {
        return (length*length);
    }
    static int findArea(int length, int breadth)
    {
        return (length*breadth);
    }
}
         */

        //        Question13
        /*
import java.util.Scanner;

public class SceintificCalculator
{
    public static void main(String[] ar)
    {
        double x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        x = sc.nextInt();
        System.out.println("Enter the value of y : ");
        y = sc.nextInt();

        System.out.println("Square of x is : " + Math.pow(x,2));
        System.out.println("Square root of x : "+ Math.sqrt(x));
        System.out.println("For power x^y is : " + Math.pow(x,y));
        System.out.println("Logarithm of x with base e is : "+ Math.log(x));
        System.out.println("Logarithm of x with base 10 is : "+ Math.log10(x));
        System.out.println("exponential of x is : "+ Math.exp(x));
    }
}
         */

        //        Question14
        /*
import java.util.Scanner;

public class Ascending_Order
{
    public static void main(String[] ar)
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}
         */

        //        Question15
        /*
import java.util.Scanner;

public class Matrix
{
    public static void main(String[] ar)
    {
        int A[][]=new int[2][2];
        int B[][]=new int[2][2];
        int C[][]=new int[2][2];
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[i].length;j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of B : ");
        for(i=0;i<B.length;i++)
        {
            for(j=0;j<B[i].length;j++)
            {
                B[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<C.length;i++)
        {
            for(j=0;j<C[i].length;j++)
            {
                C[i][j] = 0;
                for(k=0;k<C[i].length;k++)
                    C[i][j]=C[i][j]+A[i][j]*B[i][j];
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
         */
    }
}
