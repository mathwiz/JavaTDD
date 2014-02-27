package tdd.equality;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Yohan on 2/26/14.
 */
public class DumbObject {
    OutputStream getOutputStream(final InputStream obj) {
        return new OutputStream() {
            InputStream n;
            @Override
            public void write(int i) throws IOException {
                //this is intentionally useless
                n = obj;
            }
        };
    }
}
