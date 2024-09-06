import java.io.*;
public class Uppercase
{
    public static void main(String[] args) throws IOException
    {
    File file1 = new File("C:\\Users\\nissh\\Desktop\\Nishant\\SEM-3\\JAVA\\Lab\\Hello.txt");
    FileInputStream fis = new FileInputStream(file1);
    File file2 = new File("C:\\Users\\nissh\\Desktop\\Nishant\\SEM-3\\JAVA\\Lab\\UpperCaseFile.txt");
    FileOutputStream fos = new FileOutputStream(file2);
    int n1; while((n1=fis.read())!=-1)
    {
        char c = (char)n1; if( ((char)n1>='a' && (char)n1<='z') || ((char)n1>='A' && (char)n1<='Z'))
    {
//writing the contents of our file into new file in UPPERCASE
   fos.write(Character.toUpperCase((char)n1));
    }
    else
    {
        fos.write(n1);
    }
    }
    fis.close();
    fos.close();
    System.out.println("File Copied Successfully \n");
    FileInputStream file1cont = new FileInputStream(file1);
    BufferedReader br1 = new BufferedReader(new InputStreamReader(file1cont));
    String line1;
    System.out.println("Contents of the source file - 'Hello.txt': ");
    while((line1=br1.readLine())!=null)
    {
        System.out.println(line1);

    }
    FileInputStream file2cont = new FileInputStream(file2);
    BufferedReader br2 = new BufferedReader(new InputStreamReader(file2cont));
    String line2;
    System.out.println("\nContents of the destination file - 'UpperCaseFile.txt': ");
    while((line2=br2.readLine())!=null)
    {
        System.out.println(line2);
    }
}
}