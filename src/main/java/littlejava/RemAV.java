package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class RemAV {
    PizzaD forCrust() {
        return new Crust();
    }

    public PizzaD forCheese(PizzaD p) {
        return new Cheese(p.removeAnchovy());
    }

    public PizzaD forOlive(PizzaD p) {
        return new Olive(p.removeAnchovy());
    }

    public PizzaD forAnchovy(PizzaD p) {
        return p.removeAnchovy();
    }

    public PizzaD forSausage(PizzaD p) {
        return new Sausage(p.removeAnchovy());
    }
}
