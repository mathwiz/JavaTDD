package tdd.equality;

/**
 * Created by Yohan on 2/27/14.
 */
public class Main {
    public static void main(String[] args) {
        BadClass bc = new BadClass() {
            @Override
            public void suckIt(Object it) {
                System.out.println("hey I can create an anonymous instance of an abstract class");
            }
        };
        bc.suckIt("A useless argument");
    }
}
