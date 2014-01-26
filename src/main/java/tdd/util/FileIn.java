package tdd.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

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

    public void close() {
        scanner.close();
    }

    public boolean hasNext() {
        return scanner.hasNext();
    }

    public String next() {
        return scanner.next();
    }

    public boolean hasNext(String s) {
        return scanner.hasNext(s);
    }

    public String next(String s) {
        return scanner.next(s);
    }

    public boolean hasNext(Pattern pattern) {
        return scanner.hasNext(pattern);
    }

    public String next(Pattern pattern) {
        return scanner.next(pattern);
    }

    public boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    public String nextLine() {
        return scanner.nextLine();
    }

    public boolean hasNextBoolean() {
        return scanner.hasNextBoolean();
    }

    public boolean nextBoolean() {
        return scanner.nextBoolean();
    }

    public boolean hasNextDouble() {
        return scanner.hasNextDouble();
    }

    public double nextDouble() {
        return scanner.nextDouble();
    }

    public boolean hasNextFloat() {
        return scanner.hasNextFloat();
    }

    public float nextFloat() {
        return scanner.nextFloat();
    }

    public boolean hasNextInt() {
        return scanner.hasNextInt();
    }

    public int nextInt() {
        return scanner.nextInt();
    }
}
