package littlejava;

/**
 * Created by Yohan on 3/9/14.
 */
public class RemIntV {
    public PieD forBot(Integer i) {
        return new Bot();
    }

    public PieD forTop(Object t, PieD r, Integer i) {
        if (i.equals(t)) {
            return r.remInt(i);
        } else {
            return new Top(t, r.remInt(i));
        }
    }

    public static void main(String[] args) {
        PieD p =
                new Top(new Integer(1),
                        new Top(new Integer(2),
                                new Top(new Integer(3),
                                        new Top(new Integer(2),
                                                new Bot())))
                );
        System.out.println("Before\n" + p);
        PieD after = p.remInt(new Integer(2));
        System.out.println("After\n" + after);
    }

}
