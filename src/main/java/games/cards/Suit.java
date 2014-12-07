package games.cards;

/**
 * Created by Yohan on 12/6/2014.
 */
public enum Suit {
    CLUBS("C"), DIAMONDS("D"), HEARTS("H"), SPADES("S");

    public String getSymbol() {
        return symbol;
    }

    private String symbol;

    private Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return getSymbol();
    }
}
