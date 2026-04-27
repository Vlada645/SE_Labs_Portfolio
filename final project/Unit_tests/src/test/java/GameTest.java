import org.junit.jupiter.api.Test;
import pl.dmss.vmaneliuk.Game;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for Game entity logic.
 * Follows TDD principles to verify business rules defined in SRS.
 */
public class GameTest {

    @Test
    public void testApplyDiscount() {
        // Arrange: Create a game based on SRS specifications [cite: 189, 192]
        Game game = new Game("Cyberpunk 2077", 100.0f);

        // Act: Apply 20% discount
        game.applyDiscount(20);

        // Assert: Expecting 80.0, but will fail in this commit
        assertEquals(80.0f, game.getPrice(), "Price must be 80 after 20% discount");
    }
}