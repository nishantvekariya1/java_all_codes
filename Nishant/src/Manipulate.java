import java.io.*;
public class Manipulate
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("ReaderAndWriter.txt");
        fw.write("This is the text.\n");
        fw.write("We are using FileWriter and FileReader class to do the task.\n");
        fw.write("I am From Third Unit Of Java\n");
        fw.close();
        FileReader fr = new FileReader("ReaderAndWriter.txt");
        int chr;
        while((chr=fr.read())!=-1)
        {
            System.out.print((char)chr);
        }
        fr.close();
    }
}