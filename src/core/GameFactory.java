package core;

public class GameFactory implements GamesFactory {
    @Override
    public Game getGames() {
        return new Game();
    }
}
