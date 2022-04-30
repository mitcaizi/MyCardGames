package core;

public class GameTwo implements Games {
    private Deck deck;

    public GameTwo() {
        this.deck = new Deck();
    }

    public void play(Player p1, Player p2) {
        int count = 0;
        while (count < 2) {
            p1.addCard(deck.dealCard());
            p2.addCard(deck.dealCard());
            count++;
        }
    }

    public void showWinner(Player p1, Player p2) {
        if(p1 == null || p2 == null) {
            throw new IllegalStateException("Missing player");
        }
        Card player1Card = null;
        Card player2Card = null;
        for (Card card : p1.getHand()) {
            if (player1Card == null) {
                player1Card = card;
            } else if (card.getValue() > player1Card.getValue()) {
                player1Card = card;
            }
        }
        for (Card c : p2.getHand()) {
            if (player2Card == null) {
                player2Card = c;
            } else if (c.getValue() > player2Card.getValue()) {
                player2Card = c;
            }
        }
        if (player1Card.getValue() > player2Card.getValue()) {
            System.out.println(p1.getName() + " wins");
        } else if (player2Card.getValue() > player1Card.getValue()) {
            System.out.println(p2.getName() + " wins");
        } else {
            System.out.println("It's a tie");
        }
    }
}
