package puzzlers;

/**
 * Created by Yohan on 3/8/14.
 */
public class AnimalFarm {
    public static void main(String[] args) {
        String pig = "length: 10";
        String dog = "length: " + pig.length();
        String cat = "length: " + "10";
        System.out.println("pig = '" + pig + "'");
        System.out.println("dog = '" + dog + "'");
        System.out.println("cat = '" + cat + "'");
        System.out.println("All animals are equal: " + pig == dog);
        System.out.println("All animals are equal: " + (pig == dog));
        System.out.println("All animals are equal: " + (pig == cat));
        System.out.println("All animals are equal: " + (dog == cat));
    }
}
