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

    public static String[] parseArg(String arg, String delimiter) {
        return arg.split(delimiter);
    }

    public static void main(String[] args) {
        String[] parsed = parseArg(args[0], ":");
        for(String elem : parsed) {
            println(elem);
        }
    }
}
