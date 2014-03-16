package tdd.exceptions;

import littlejava.SubAbCV;

/**
 * Created by Yohan on 3/15/14.
 */
public class Subclasses {
    Subclasses m1(Object o) throws AException {
        if (o == null) {
            throw new AException("Null argument");
        }
        return this;
    }

    Subclasses m2(Object o) throws BException {
        if (o == null) {
            throw new BException("Null argument");
        }
        return this;
    }

    public static void main(String[] args) {
        Subclasses s = new Subclasses();
        try {
            s.m1(new Runnable() {
                @Override
                public void run() {
                    System.out.println("I ran");
                }
            });
            s.m2(null);
        } catch (AException e) {
            System.out.println("Caught AException: " + e);
//      This is not possible
//        } catch (BException e) {
//            System.out.println("Caught BException: " + e);
        }
    }
}
