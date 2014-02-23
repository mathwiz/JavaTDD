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
                                new Cheese(
                                        new Anchovy(
                                                new Crust()
                                        )
                                )
                        )
                )
        );
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testRemoveAnchovy() throws Exception {
        PizzaD p = testData();
        System.out.println(p.removeAnchovy());
        PizzaD p2 = new Anchovy(new Crust());
        System.out.println(p2.removeAnchovy());
    }
}
