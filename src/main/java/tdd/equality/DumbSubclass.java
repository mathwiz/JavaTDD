package tdd.equality;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Yohan on 2/26/14.
 */
public class DumbSubclass extends DumbObject {
    private InputStream d;

    @Override
    FileOutputStream getOutputStream(final InputStream something) {
        this.d = something;
        System.out.println("How is this legal?");
        try {
            return new FileOutputStream("AFakeString");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
