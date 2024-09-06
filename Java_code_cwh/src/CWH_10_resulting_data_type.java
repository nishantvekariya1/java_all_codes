public class CWH_10_resulting_data_type
{
    public static void main(String[] args) {
        /*
            byte x = 5;
            int y = 6;
            short z = 8;
            int a = y + z;
            float b = 6.24f + x;
            System.out.println(b);
         */

//         Increment and Decrement Operator
        int i = 56;
        //int b = i++; // first b is assigned i (56) then i is incremented
        //int j = 67;
        //int c = ++j; // first j is incremented then b is assigned j (68)

        System.out.println(i++);// First i use then increment
        System.out.println(i);
        System.out.println(++i);// First i increment then i use
        System.out.println(i);

//         Quick Quiz
        int y = 7;
        int x = ++y*8;
        System.out.println(x);
        char ch ='A';
        System.out.println(++ch);

    }
}