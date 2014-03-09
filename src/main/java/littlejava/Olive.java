package littlejava;

/**
 * Created by Yohan on 2/23/14.
 */
public class Olive extends PizzaD {
    public Olive(PizzaD p) {
        this.p = p;
    }

    @Override
    public PizzaD removeAnchovy() {
        return remFn.forOlive(this.p);
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return topFn.forOlive(this.p);
    }

    @Override
    public PizzaD substituteAnchovyWithCheese() {
        return subFn.forOlive(this.p);
    }
}
