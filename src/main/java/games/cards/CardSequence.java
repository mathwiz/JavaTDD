package games.cards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yohan on 12/6/2014.
 */
public class CardSequence {
    private List<Card> cards = new ArrayList<>();

    public List<Card> getCards() {
        return new ArrayList(cards);
    }
}
