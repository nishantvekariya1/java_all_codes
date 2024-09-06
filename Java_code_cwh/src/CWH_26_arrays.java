public class CWH_26_arrays {
    public static void main(String[] args) {
        /*
        Classroom of 500 students - you have to store marks of these 500 students
        you have 2 operations
        1. Create 500 variables
        2. Use Arrays (recommended)
        */

        //There are three main ways to create an array in java.
        //1. Declaration and memory allocation.
        //int [] marks = new int[5];

        //2. Declaration and then memory allocation.
//        int [] marks;
//        marks = new int[5];

        //initialization
//        marks[0]=98;
//        marks[1]=45;
//        marks[2]=79;
//        marks[3]=99;
//        marks[4]=80;
//        marks[5]=96; Throws an error

        //3.Declaration,memory allocation and initialization together
        int [] marks={98,45,79,99,80};

        System.out.println(marks[4]);
    }
}
