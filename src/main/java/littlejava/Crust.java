package littlejava;

/**
 * Created by Yohan on 2/23/14.
 */
public class Crust extends PizzaD {
    @Override
    public PizzaD removeAnchovy() {
        return new Crust();
    }

    @Override
    public PizzaD topAnchovyWithCheese() {
        return new Crust();
    }
}
