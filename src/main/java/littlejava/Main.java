package littlejava;

import static littlejava.Helpers.*;

public abstract class Main {
    public static void main(String[] args) {
        try {
        int params = args.length;
        for(int i=0; i<params; i++) {
            println(args[i]);
        }

        Class type = new Type(args[0]).value();

        Object instance = null;
        String[] classes = new Names(args[1]).value();

        for(int i=0; i<classes.length; i++) {
            String className = classes[i];
            Class cls = new Type(className).value();
            if (i==0) {
                instance = new Instance(cls).value();
            } else {
                instance = new Instance(cls, new Object[] { instance }, new Class[] { type }).value();
            }
        }

        println(instance);
        } catch (Exception e) {
            println(e);
        }
    }

}

class Instance {
    final Object obj;
    Instance(Class cls) throws Exception { 
        obj = cls.getConstructor().newInstance(); 
    }
    Instance(Class cls, Object[] params, Class[] paramTypes) throws Exception { 
        obj = cls.getConstructor(paramTypes).newInstance(params);
    }
    Object value() { return obj; }
}

class Names {
    final String[] names;
    Names(String s) { names = parseArg(s, ":"); }
    String[] value() { return names; }
}

class Type {
    final String packName = "littlejava";
    final Class type;
    Type(String name) throws Exception {
        type = Class.forName(packName + "." + name);
    }

    Class value() { return type; }
}
