package pl.dmss.vmaneliuk;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages user's digital collection[cite: 165].
 */
public class Library {
    private int id;

    private List<Game> ownedGames = new ArrayList<>();

    public Library(int i) {
    }

    public void addGame(Game game) {
        // Business logic from SRS: add game to collection after purchase [cite: 123]
        ownedGames.add(game);
    }

    public boolean hasGame(String title) {
        return ownedGames.stream().anyMatch(g -> g.getTitle().equals(title));
    }
}
