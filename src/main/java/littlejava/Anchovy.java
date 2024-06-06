package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 2/23/14.
 */
public class Anchovy extends PizzaD {
    public Anchovy(PizzaD p) {
        this.p = p;
    }

    @Override
    public PizzaD removeAnchovy() {
        return remFn.forAnchovy(this.p);
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return topFn.forAnchovy(this.p);
    }

    @Override
    public PizzaD substituteAnchovyWithCheese() {
        return subFn.forAnchovy(this.p);
    }

    public static void main(String[] args) {
        PizzaD p1 = new Olive(new Anchovy(new Anchovy(new Anchovy(new Cheese(new Crust())))));
        println(p1);
        println("After removing anchovies...");
        println(p1.removeAnchovy());
        println("Another pizza");
        p1 = new Cheese(new Anchovy(new Cheese(new Crust())));
        println(p1);
        println("Another removal...");
        println(p1.removeAnchovy());
        println("The second pizza but after topping anchovies with cheese rather than removing...");
        println(p1.topAnchovyWithCheese());
        println("A fancy pizza");
        p1 = new Olive(new Anchovy(new Cheese(new Anchovy(new Crust()))));
        println(p1);
        println("Top anchovy with cheese, then remove anchovy...");
        println(p1.topAnchovyWithCheese().removeAnchovy());
    }
}
