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

    public static void printf(String format, Object... args) {
        out.printf(format, args);
    }        

    public static String[] parseArg(String arg, String delimiter) {
        return arg.split(delimiter);
    }

    public static void main(String[] args) {
        String[] parsed = parseArg(args[0], ":");
        int i = 0;
        for(String elem : parsed) {
            printf("Arg %d as String: %s \n", ++i, elem);
        }
    }
}
