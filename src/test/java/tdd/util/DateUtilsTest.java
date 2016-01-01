package tdd.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yohan on 2/11/14.
 */
public class DateUtilsTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testBefore() throws Exception {
        Assert.assertTrue(DateUtils.before("2014-12-30", "2014-12-31"));
        Assert.assertFalse(DateUtils.before("2014-12-30", "2014-12-30"));
        Assert.assertFalse(DateUtils.before("2014-12-30", "2014-12-29"));
    }

    @Test
    public void testMonths() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Month " + i + " Days " + DateUtils.maxDate(i));
        }
    }

    @Test
    public void testNextDay() {
        System.out.println(DateUtils.nextDay("2014-11-30"));
        System.out.println(DateUtils.nextDay("2014-12-31"));
    }

    @Test
    public void testDatesInMonth() {
        for (String it : DateUtils.datesInMonth(1)) {
            System.out.println(it);
        }
        for (String it : DateUtils.datesInMonth(2)) {
            System.out.println(it);
        }
    }
}
