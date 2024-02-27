import org.apache.tools.ant.taskdefs.Zip;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class FilesTasks {

    public static void main(String[] args) {
        List<String> ex = new ArrayList<String>();
        ex.add("file.txt");
        ex.add("file.txt");
        ex.add("file.txt");
        ex.add("file.txt");
        ex.add("file.txt");

        renameFiles(ex);
    }

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.err.println("it is not a number, try again");
            }
        }
    }

    public static void renameFiles(List<String> filePaths) {
        try {
            if (filePaths == null || filePaths.size() == 0) {
                throw new RuntimeException();
            }
            ListIterator<String> newFilePath = filePaths.listIterator();
            while (newFilePath.hasNext()) {
                newFilePath.set(String
                        .format("%s_%s", newFilePath.nextIndex() + 1, newFilePath.next()));
                System.out.println(newFilePath);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("no elements in List");
        }
    }
}
