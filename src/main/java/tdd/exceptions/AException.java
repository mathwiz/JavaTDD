package tdd.exceptions;

/**
 * Created by Yohan on 3/15/14.
 */
public class AException extends Exception {
    public AException() {
    }

    public AException(String s) {
        super(s);
    }

    public AException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public AException(Throwable throwable) {
        super(throwable);
    }

    public AException(String s, Throwable throwable, boolean b, boolean b2) {
        super(s, throwable, b, b2);
    }
}
