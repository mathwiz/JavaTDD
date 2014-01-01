package tdd.equality;

import tdd.model.Callaway;
import tdd.model.GolfBall;
import tdd.model.Nike;
import tdd.model.Titleist;

/**
 * Created with IntelliJ IDEA.
 * User: Yohan
 * Date: 1/1/14
 * Time: 10:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class Equality {
    public static GolfBall[] makeData() {
        return new GolfBall[]{
                new GolfBall("Maxfli", "Pro", 100),
                new GolfBall("Maxfli", "Regular", 90),
                new GolfBall("Titleist", "Pro V1", 100),
                new Titleist("Pro V1", 100),
                new Nike("Pro", 100),
                new Nike("Amateur", 90),
                new Callaway("Pro", 100),
                new Callaway("Amateur", 90)
        };
    }
}
