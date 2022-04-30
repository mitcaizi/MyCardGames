import core.*;

public class App {
    public static void main(String[] args) {
        Player p1 = new Player("James");
        Player p2 = new Player("Sam");
        Games game = new GameFactory().getGames();
        game.play(p1, p2);
        p1.showHand();
        p2.showHand();
        game.showWinner(p1, p2);
        p1.remove();
        p2.remove();

        System.out.println("------------------------------");

        Player p3 = new Player("Jack");
        Player p4 = new Player("Cole");
        Games gameTwo = new GameTwoFactory().getGames();
        gameTwo.play(p3, p4);
        p3.showHand();
        p4.showHand();
        game.showWinner(p3, p4);
        p1.remove();
        p2.remove();

    }
}
