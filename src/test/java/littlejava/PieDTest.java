package littlejava;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 3/9/14.
 */
public class PieDTest {
    PieD pieD;

    @Before
    public void setUp() throws Exception {
        pieD = new Top(new SalmonFish(),
                new Top(new Integer(42),
                        new Top(new AnchovyFish(),
                                new Top(new Long(1),
                                        new Top(new TunaFish(),
                                                new Top(new AnchovyFish(),
                                                        new Top(new Double(2.3),
                                                                new Bot())
                                                )
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void testRemV() throws Exception {
        PieD expected = new Top(new SalmonFish(),
                new Top(new AnchovyFish(),
                        new Top(new Long(1),
                                new Top(new AnchovyFish(),
                                        new Top(new Double(2.3),
                                                new Bot())
                                )
                        )
                )
        );

        RemV fn = new RemV();
        PieD after = pieD.rem(fn, new TunaFish()).rem(fn, new Integer(42));
        System.out.println();
        System.out.println(expected);
        System.out.println(after);
        Assert.assertEquals(expected, after);
    }

    @Test
    public void testSubstV() throws Exception {
        PieD expected = new Top(new SalmonFish(),
                new Top("Forty-two",
                        new Top(new AnchovyFish(),
                                new Top(new Long(1),
                                        new Top(new SalmonFish(),
                                                new Top(new AnchovyFish(),
                                                        new Top(new Double(2.3),
                                                                new Bot())
                                                )
                                        )
                                )
                        )
                )
        );

        SubstV fn = new SubstV();
        PieD after = pieD.subst(fn, new SalmonFish(), new TunaFish()).subst(fn, "Forty-two", new Integer(42));
        System.out.println();
        System.out.println(expected);
        System.out.println(after);
        Assert.assertEquals(expected, after);
    }
}
