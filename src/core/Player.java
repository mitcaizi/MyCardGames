package core;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    /*
    Give a card to the player.
     */
    public void addCard(Card card) {
        if (card == null)
            throw new NullPointerException("No more cards available");
        hand.add(card);
    }

    /*
    After one round of game, remove all the cards from the player.
     */
    public void remove() {
        hand.clear();
    }

    /*
    Show player's cards.
     */
    public void showHand() {
        System.out.println(name + ":" + hand);
    }
}
