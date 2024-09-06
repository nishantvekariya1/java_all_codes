import java.io.*;
import java.util.Scanner;
public class Student_Manager
{
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Roll Number, Name and Score of the Student: ");
    int roll = sc.nextInt();
    sc.nextLine();
    String st_name = sc.nextLine();
    int st_score = sc.nextInt();
// writing the data in our file using BufferedWriter
    FileWriter fw = new FileWriter("StudentData.txt");
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write("ROLL NUMBER : " + roll);
    bw.write("\nNAME : " + st_name);
    bw.write("\nSCORE : " + st_score);
    bw.close();
// Reading the data using BufferedReader
    FileReader fr = new FileReader("StudentData.txt");
    BufferedReader br = new BufferedReader(fr);
    String line;
    System.out.println("\nThe data of the student is: \n"); while ((line = br.readLine()) != null)
    {
        System.out.println(line);
    }
    br.close();
}
}
