package games.cards;

/**
 * Created by Yohan on 1/30/2015.
 */
public enum Rank {
    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");

    public String getSymbol() {
        return symbol;
    }

    private String symbol;

    private Rank(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return getSymbol();
    }

    public static void main(String[] args) {
        System.out.println(TWO.getSymbol().compareTo(THREE.getSymbol()));
    }
}
