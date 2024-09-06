import java.io.*;
public class File_Read
{
        public static void main(String[] args) throws IOException {
                File file = new
                        File("C:\\Users\\nissh\\Desktop\\Nishant\\SEM-3\\JAVA\\Lab\\Hello.txt");
                FileInputStream fis = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                int cnt_sents = 0;
                int cnt_word = 0;
                int cnt_chars = 0;
                String line;
                System.out.println("THE CONTENTS OF THE FILE ARE: ");
                while ((line = br.readLine()) != null) {
                        System.out.println(line); // printing the contents of the file one by one
                        for (int i = 0; i < line.length(); i++) {
                                if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z' || line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                                        cnt_chars++;
                                }

                        }
                        String words[] = line.split(" ");
                        cnt_word += words.length;
                        String sentence[] = line.split("[.]");
                        cnt_sents += sentence.length;
                }
                System.out.println();
                System.out.printf("%5s %10s 15s", "CHARACTERS", "WORDS", "SENTENCES\n");
                System.out.printf("%5s %13s %12s", cnt_chars, cnt_word, cnt_sents);
        }
}