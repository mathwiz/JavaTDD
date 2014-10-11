package examples.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Yohan on 10/11/2014.
 */
public class WordList {
    public static void main(String[] args) throws FileNotFoundException {
        writeWords("words.data", args);
    }

    private static void writeWords(String filename, String[] words) throws FileNotFoundException {
        RandomAccessFile f = new RandomAccessFile(filename, "rw");

    }
}
