package littlejava;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 2/23/14.
 */
public class PizzaDTest {
    private static PizzaD testData() {
        return new Spinach(
                new Anchovy(
                        new Olive(
                                new Anchovy(
                                        new Sausage(
                                                new Cheese(
                                                        new Crust()
                                                )
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
    }

    @Test
    public void testRemoveAnchovy() throws Exception {
        System.out.println("- testRemoveAnchovy");
        System.out.println("*" + test);
        System.out.println(" " + test.removeAnchovy());
        PizzaD p2 = new Anchovy(new Anchovy(new Crust()));
        System.out.println("*" + p2);
        System.out.println(" " + p2.removeAnchovy());
    }

    @Test
    public void testTopAnchovyWithCheese() throws Exception {
        System.out.println("- testTopAnchovyWithCheese");
        System.out.println("*" + test);
        System.out.println(" " + test.topAnchovyWithCheese());
        System.out.println(" " + test.removeAnchovy().topAnchovyWithCheese());
        System.out.println(" " + test.topAnchovyWithCheese().removeAnchovy());
    }

    @Test
    public void testSubstituteAnchovyWithCheese() throws Exception {
        System.out.println("- testSubstituteAnchovyWithCheese");
        System.out.println("*" + test);
        System.out.println(" " + test.substituteAnchovyWithCheese());
    }
}
