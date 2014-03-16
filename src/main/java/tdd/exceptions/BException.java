package tdd.exceptions;

/**
 * Created by Yohan on 3/15/14.
 */
public class BException extends AException {
    public BException() {
    }

    public BException(String s) {
        super(s);
    }

    public BException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public BException(Throwable throwable) {
        super(throwable);
    }

    public BException(String s, Throwable throwable, boolean b, boolean b2) {
        super(s, throwable, b, b2);
    }
}
