package littlejava;

import static littlejava.Helpers.*;

public abstract class Main {
    public static void main(String[] args) {
        try {
        Class root = Class.forName(args[0]);
        Object rootObj = root.getDeclaredConstructor().newInstance();

        int params = args.length;
        for(int i=0; i<params; i++) {
            println(args[i]);
        }
        Object instance = null;
        if (!"${arg1}".equals(args[1])) {
            Class next = Class.forName(args[1]);
            println(next);
            Class[] types = {  };
            Object[] parameters = { rootObj };
            instance = next.getConstructor(types).newInstance(parameters);
        } else if (!"${arg2}".equals(args[2])) {
        } else {
            println("wha?");
            instance = rootObj;
        }

        println(instance);
        } catch (Exception e) {
            println(e);
        }
    }

}
