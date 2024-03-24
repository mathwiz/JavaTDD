package littlejava;

import java.io.*;

public abstract class Helpers {
    private static PrintStream out = System.out;

    public static void print(Object o) {
        out.print(o);
    }        

    public static void println(Object o) {
        out.println(o);
    }        
}
