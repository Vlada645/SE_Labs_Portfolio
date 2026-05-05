package pl.dmss.vmaneliuk;
import java.util.ArrayList;
import java.util.List;

public class Developer {
    private String studioName;
    private String taxId;
    private List<Game> games;

    public Developer(String studioName, String taxId) {

    }

    // Мінімальна реалізація для проходження тестів
    public void uploadGame(Game game) {

    }

    public int getUploadedGamesCount() {
    return 0;
    }

    public boolean isValidTaxId() {
        return false;
    }
}
