package littlejava;

/**
 * Created by Yohan on 2/23/14.
 */
public class Sausage extends PizzaD {
    public Sausage(PizzaD p) {
        this.p = p;
    }

    @Override
    public PizzaD removeAnchovy() {
        return remFn.forSausage(this.p);
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return topFn.forSausage(this.p);
    }

    @Override
    public PizzaD substituteAnchovyWithCheese() {
        return subFn.forSausage(this.p);
    }
}
