package littlejava;

import static littlejava.Helpers.*;

/**
 * Created by Yohan on 2/23/14.
 */
public class Spinach extends PizzaD {
    public Spinach(PizzaD p) {
        this.p = p;
    }

    @Override
    public PizzaD removeAnchovy() {
        return new Spinach(p.removeAnchovy());
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return new Spinach(p.topAnchovyWithCheese());
    }

    @Override
    public PizzaD substituteAnchovyWithCheese() {
        return new Spinach(p.substituteAnchovyWithCheese());
    }

    public static void main(String[] args) {
        PizzaD p1 = new Spinach(new Sausage(new Olive(new Anchovy(new Crust()))));
        println(p1);
        println("Topping Anchovy with Cheese");
        println(p1.topAnchovyWithCheese());
    }

}


