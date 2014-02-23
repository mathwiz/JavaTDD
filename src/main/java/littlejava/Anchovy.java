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
        return p.removeAnchovy();
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return new Cheese(new Anchovy(p.topAnchovyWithCheese()));
    }
}
