package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 1/15/14.
 */
public class OneMoreThan extends NumD {
    NumD predecessor;

    public OneMoreThan(NumD predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        NumD p = predecessor;
        return "new " + this.getClass().getSimpleName() +
                (p == null ? "()" : "(" + p + ")");
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof OneMoreThan) {
            return predecessor.equals(((OneMoreThan) o).predecessor);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        NumD num = new Zero();
        int n = 4;
        for(int i=0; i<n; i++) { 
            num = new OneMoreThan(num);
        }
        println("OneMOreThan");
        println(num);
    }

}
