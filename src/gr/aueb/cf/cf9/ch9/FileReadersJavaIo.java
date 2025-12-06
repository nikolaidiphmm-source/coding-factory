package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Demo of file readers in the java.io package
 */
public class FileReadersJavaIo {
    public static void main(String[] args) {
        File file = new File("/Users/nikol/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file3.txt");

        try {
            bufferedReader(file);
        } catch (Exception e) {
            System.out.println("Κάποιο λάθος συνέβη ");
        }
    }

    //Scanner is useful for primitives and strings

    public static void fileReader(String file) throws IOException {
        try (FileReader fr = new FileReader(file, StandardCharsets.UTF_8)) {
            int bytesRead;
            while (( bytesRead = fr.read()) != -1) {        //while not EOF-end of file
                System.out.print((char) bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedReader (File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String line;

            while ((line = br.readLine()) !=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
