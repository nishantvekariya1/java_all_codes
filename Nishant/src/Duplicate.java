import java.io.*;
public class Duplicate
{
    public static void main(String[] args) throws IOException
{
    PrintWriter pw = new PrintWriter("C:\\Users\\nissh\\Desktop\\Nishant\\SEM-3\\JAVA\\Lab\\Nonduplicate.txt");
    BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\nissh\\Desktop\\Nishant\\SEM-3\\JAVA\\Lab\\Duplicate.txt"));
    String line1 = br1.readLine();
// loop for Duplicates.txt file
    while(line1!=null)
    {
        boolean flag = false;
        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\nissh\\Desktop\\Nishant\\SEM-3\\JAVA\\Lab\\Nonduplicate.txt"));
        String line2 = br2.readLine();
        while(line2!=null)
        {
            if(line1.equals(line2))
            {
                flag = true; break;
            }
            line2 = br2.readLine();
        }
// if flag is false then copy the contents of Duplicates.txt into NonDuplicates.txt
        if(!flag)
        {
            pw.println(line1);
            pw.flush(); }
        line1 = br1.readLine();
    }
    br1.close();
    pw.close();
    System.out.println("File Operation performed Successfully");
    File f1 = new File("C:\\Users\\nissh\\Desktop\\Nishant\\SEM-3\\JAVA\\Lab\\Duplicate.txt");
    FileInputStream fis1 = new FileInputStream(f1);
    BufferedReader buff1 = new BufferedReader(new InputStreamReader(fis1));
    String st1;
    System.out.println("\nContents of the file with duplicates - 'Duplicate.txt'");
    while((st1= buff1.readLine())!=null)
    {
        System.out.println(st1);
    }
    File f2 = new File("C:\\Users\\nissh\\Desktop\\Nishant\\SEM-3\\JAVA\\Lab\\Nonduplicate.txt");
    FileInputStream fis2 = new FileInputStream(f2);
    BufferedReader buff2 = new BufferedReader(new InputStreamReader(fis2));
    String st2;
    System.out.println("\nContents of the file without duplicates - 'Nonduplicate.txt'");
    while((st2= buff2.readLine())!=null)
    {
        System.out.println(st2);
    }
}
}
