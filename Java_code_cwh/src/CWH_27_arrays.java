public class CWH_27_arrays
{
    public static void main(String[] args) {
        /*
        float [] marks = {98.5f,45.5f,79.57f,99.5f,80.5f};
        String [] students = {"Harry","Rohan","Shubham","Lovish"};
        System.out.println(students.length);
        System.out.println(students[2]);
        */

        int [] marks={98,45,79,99,80};
//        System.out.println(marks.length);
        // Displaying the array(Naive way)
        System.out.println("Printing using naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the array(For loop)
        System.out.println("Printing using for loop");
        for (int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        // Quick Quiz : Displaying the array in reverse order (For loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }

        // Quick Quiz : Displaying the array (For-each loop)
        System.out.println("Printing using for-each loop");
        for (int element : marks)
        {
            System.out.println(element);
        }

    }
}
