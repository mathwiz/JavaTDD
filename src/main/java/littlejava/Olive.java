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
        return new Olive(p.removeAnchovy());
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return new Olive(p.topAnchovyWithCheese());
    }
}
