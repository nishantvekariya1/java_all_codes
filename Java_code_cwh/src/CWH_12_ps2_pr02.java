public class CWH_12_ps2_pr02
{
    public static void main(String[] args) {

//        Question 2
        //Encrypting the grade
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        //Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
