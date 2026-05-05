
package pl.dmss.vmaneliuk;
import java.util.ArrayList;
import java.util.List;

public class Developer {
    private String studioName;
    private String taxId;
    private List<Game> games;

    public Developer(String studioName, String taxId) {
        this.studioName = studioName;
        this.taxId = taxId;
        this.games = new ArrayList<>();
    }

    public void uploadGame(Game game) {
        this.games.add(game);
    }

    public int getUploadedGamesCount() {
        return this.games.size();
    }

    public boolean isValidTaxId() {
        return this.taxId != null && !this.taxId.isEmpty();
    }
}