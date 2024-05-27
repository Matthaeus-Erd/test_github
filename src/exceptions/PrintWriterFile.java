package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class PrintWriterFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            PrintWriter printWriter = new PrintWriter("test.txt");
            printWriter.println(LocalDateTime.now().toString());
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}