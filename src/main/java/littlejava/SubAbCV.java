package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class SubAbCV {
    public PizzaD forCrust() {
        return new Crust();
    }

    public PizzaD forCheese(PizzaD p) {
        return new Cheese(p.substituteAnchovyWithCheese());
    }

    public PizzaD forOlive(PizzaD p) {
        return new Olive(p.substituteAnchovyWithCheese());
    }

    public PizzaD forAnchovy(PizzaD p) {
        return new Cheese(p.substituteAnchovyWithCheese());
    }

    public PizzaD forSausage(PizzaD p) {
        return new Sausage(p.substituteAnchovyWithCheese());
    }
}
