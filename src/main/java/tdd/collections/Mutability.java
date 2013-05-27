package tdd.collections;

public class Mutability {
    private String[] strings;

    public Mutability(){
        strings = new String[10];
    }

    public String[] getStrings() {
        return strings;
    }

    public static void main(String[] args) {
        System.out.print("Mutability");
    }
}