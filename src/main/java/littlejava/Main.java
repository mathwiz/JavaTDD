package littlejava;

import static littlejava.Helpers.*;

public abstract class Main {
    public static void main(String[] args) {
        try {
        Class cls = Class.forName(args[0]);
        Object instance = cls.getDeclaredConstructor().newInstance();
        println(instance);
        } catch (Exception e) {
            println(e);
        }
    }

}
