package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Yohan on 1/26/14.
 */
public class FileIn {
    private File file;
    private Scanner scanner;

    public FileIn(String path) {
        this(new File(Thread.currentThread().getContextClassLoader().getResource(path).getFile()));
    }

    public FileIn(File file) {
        this.file = file;
        try {
            this.scanner = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public File getFile() {
        return file;
    }

    boolean hasNextInt() {
        return scanner.hasNextInt();
    }

    int nextInt() {
        if (scanner.hasNextInt()) return scanner.nextInt();
        else throw new RuntimeException("No more integer input");
    }
}
