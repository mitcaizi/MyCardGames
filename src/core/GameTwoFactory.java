package core;

public class GameTwoFactory implements GamesFactory {
    @Override
    public GameTwo getGames() {
        return new GameTwo();
    }
}
