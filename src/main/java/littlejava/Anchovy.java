package littlejava;

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
}
