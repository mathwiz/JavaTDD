package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class TopAwCV {
    public PizzaD forCrust() {
        return new Crust();
    }

    public PizzaD forCheese(PizzaD p) {
        return new Cheese(p.topAnchovyWithCheese());
    }

    public PizzaD forOlive(PizzaD p) {
        return new Olive(p.topAnchovyWithCheese());
    }

    public PizzaD forAnchovy(PizzaD p) {
        return new Cheese(new Anchovy(p.topAnchovyWithCheese()));
    }

    public PizzaD forSausage(PizzaD p) {
        return new Sausage(p.topAnchovyWithCheese());
    }
}
