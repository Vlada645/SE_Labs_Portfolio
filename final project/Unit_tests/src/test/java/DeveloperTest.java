
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.dmss.vmaneliuk.Developer;
import pl.dmss.vmaneliuk.Game;

import static org.junit.jupiter.api.Assertions.*;

public class DeveloperTest {
    private Developer developer;

    @BeforeEach
    public void setUp() {
        developer = new Developer("Ubisoft", "TAX12345");
    }

    @Test
    public void testUploadGame() {
        Game newGame = new Game("Assassin's Creed", 60.0f);
        developer.uploadGame(newGame);
        assertEquals(1, developer.getUploadedGamesCount(), "Кількість завантажених ігор має бути 1");
    }

    @Test
    public void testTaxIdValidation() {
        assertTrue(developer.isValidTaxId(), "Tax ID має бути валідним");
    }
}