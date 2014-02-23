package littlejava;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 2/23/14.
 */
public class PizzaDTest {
    private static PizzaD testData() {
        return new Anchovy(
                new Olive(
                        new Anchovy(
                                new Sausage(
                                        new Cheese(
                                                new Crust()
                                        )
                                )
                        )
                )
        );
    }

    private PizzaD test;

    @Before
    public void setUp() throws Exception {
        test = testData();
        System.out.println(test);
    }

    @Test
    public void testRemoveAnchovy() throws Exception {
        PizzaD p = test;
        System.out.println(p.removeAnchovy());
        PizzaD p2 = new Anchovy(new Anchovy(new Crust()));
        System.out.println(p2.removeAnchovy());
    }

    @Test
    public void testTopAnchovyWithCheese() throws Exception {
        PizzaD p = test;
        System.out.println(p.topAnchovyWithCheese());
        System.out.println(p.removeAnchovy().topAnchovyWithCheese());
    }
}
