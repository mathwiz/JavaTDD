package littlejava;

/**
 * Created by Yohan on 2/22/14.
 */
public abstract class PizzaD {
    protected PizzaD p;

    public abstract PizzaD removeAnchovy();

    public abstract PizzaD topAnchovyWithCheese();

    public abstract PizzaD substituteAnchovyWithCheese();

    protected RemAV remFn = new RemAV();

    protected TopAwCV topFn = new TopAwCV();

    protected SubAbCV subFn = new SubAbCV();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                (p == null ? "" : " " + p);
    }

    public static void main(String[] args) {
        PizzaD p1 = new Cheese(new Sausage(new Olive(new Anchovy(new Crust()))));
        System.out.println(p1);
        System.out.println(p1.topAnchovyWithCheese());
    }
}
