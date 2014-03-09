package littlejava;

/**
 * Created by Yohan on 2/23/14.
 */
public class Cheese extends PizzaD {
    public Cheese(PizzaD p) {
        this.p = p;
    }

    @Override
    public PizzaD removeAnchovy() {
        return remFn.forCheese(this.p);
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return topFn.forCheese(this.p);
    }

    @Override
    public PizzaD substituteAnchovyWithCheese() {
        return subFn.forCheese(this.p);
    }}
