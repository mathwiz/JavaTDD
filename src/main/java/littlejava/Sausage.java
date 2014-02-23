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
        return new Sausage(p.removeAnchovy());
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return new Sausage(p.topAnchovyWithCheese());
    }
}
