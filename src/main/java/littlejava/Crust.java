package littlejava;

/**
 * Created by Yohan on 2/23/14.
 */
public class Crust extends PizzaD {
    @Override
    public PizzaD removeAnchovy() {
        return remFn.forCrust();
    }

    @Override
    public PizzaD substituteAnchovyWithCheese() {
        return subFn.forCrust();
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return topFn.forCrust();
    }
}
