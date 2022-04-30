package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private int cardLeft;
    private int cardPosition;
    private List<Card> deck;

    public List<Card> getDeck() {
        return deck;
    }

    public Deck() {
        this.cardLeft = 52;
        this.cardPosition = 0;
        this.deck = new ArrayList<>();
        createDeck();
        shuffle();
    }

    /*
    TO create a deck of cards with 13 numbers and 4 suits.
     */
    public void createDeck() {
        for(Card.Suits suit : Card.Suits.values()) {
            for(int number = 1; number <=13; number++) {
                deck.add(new Card(number, suit));
            }
        }
    }

    /*
    Shuffle the cards
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }

    /*
    pick up the top card of the deck and give it to a player.
     */
    public Card dealCard() {
        if(cardLeft == 0) {
            throw new IllegalStateException("No more cards available");
        }
        cardLeft--;
        return deck.get(cardPosition++);
    }
}
