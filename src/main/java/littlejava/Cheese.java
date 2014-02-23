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
        return new Cheese(p.removeAnchovy());
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return new Cheese(p.topAnchovyWithCheese());
    }
}
