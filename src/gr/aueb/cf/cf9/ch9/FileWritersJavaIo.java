package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Demo of file writers in java.io package
 */
public class FileWritersJavaIo {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/nikol/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt");


        try (PrintStream ps = new PrintStream("/Users/nikol/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/fileps.txt")){
//            fileWriter(new File("/Users/nikol/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt"));
//            bufferedWriter(String.valueOf(file));

            // flexible usage of sayHello
            sayHello(System.out);
            sayHello(ps);
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη");
        }

    }

    public static void fileWriter(File file) throws IOException {
        try (FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8, true)) {
            fw.write("Hello World!");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedWriter(String file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8, true))) {
            bw.write("Hello World");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;

        }
    }

    public static void prinStream(String file) throws FileNotFoundException {
        try (PrintStream ps = new PrintStream(file)) {
                ps.println("Hello World!!");
                ps.flush();
            } catch (IOException e) {
                e.printStackTrace();
                throw e;
            }
        }

        public static void sayHello(PrintStream ps) {
            ps.println("Hello coding");
        }
    }

