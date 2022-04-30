package core;
public class Card {
    /*
    use enum to present the suites of cards.
     */
    enum Suits {
        HEARTS,
        SPADE,
        CLUBS,
        DIAMONDS
    }

    private int value;
    private Suits suit;

    public Card(int value, Suits suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", value=" + value +
                '}';
    }
}
