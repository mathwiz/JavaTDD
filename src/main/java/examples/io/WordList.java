package examples.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Yohan on 10/11/2014.
 */
public class WordList {
    public static final String FILENAME = "words.data";
    private RandomAccessFile f;
    private long[] positions;

    public WordList(String filename) throws IOException {
        f = new RandomAccessFile(filename, "r");
        int numWords = f.readInt();
        positions = new long[numWords];
        for (int i = 0; i < numWords; i++) {
            positions[i] = f.readLong();
        }
    }

    public void close() throws IOException {
        if (f != null) {
            f.close();
        }
        f = null;
        positions = null;
    }

    public int size() {
        if (f == null) {
            throw new IllegalStateException("file closed");
        }
        return positions.length;
    }

    public String get(int i) throws IOException {
        if (f == null) {
            throw new IllegalStateException("file closed");
        }
        f.seek(positions[i]);
        return f.readUTF();
    }

    public static void main(String[] args) throws IOException {
        writeWords(FILENAME, args);
        WordList list = new WordList(FILENAME);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        list.close();
    }

    private static void writeWords(String filename, String[] words) throws IOException {
        RandomAccessFile f = new RandomAccessFile(filename, "rw");
        long[] wordPositions = new long[words.length];
        //reserve 4 bytes for length and 8 for each location of word
        f.seek(4L + (8 * words.length));
        for (int i = 0; i < words.length; i++) {
            wordPositions[i] = f.getFilePointer();
            f.writeUTF(words[i]);
        }

        //beginning of file
        f.seek(0L);
        f.writeInt(wordPositions.length);
        for (int i = 0; i < wordPositions.length; i++) {
            f.writeLong(wordPositions[i]);
        }
        f.close();
    }
}
