import org.junit.jupiter.api.Test;
import pl.dmss.vmaneliuk.Game;
import pl.dmss.vmaneliuk.Order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

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

    @Test
    public void testFullDiscount() {
        // Testing edge case: 100% discount
        Game game = new Game("Free Game", 50.0f);
        game.applyDiscount(100);
        assertEquals(0.0f, game.getPrice(), "Price should be 0.0 after 100% discount");
    }
    @Test
    public void testPriceValidation() {
        Game game = new Game("Free Game", -10.0f);
        assertFalse(game.isValidPrice(), "Price should not be negative");
    }

    @Test
    public void testOrderTotal() {
        Order order = new Order(50.0f); // 50.0 is price per game
        assertEquals(150.0f, order.calculateTotal(3)); // 50 * 3
    }
    @Test
    public void testOrderTax() {
        Order order = new Order(100.0f);
        assertEquals(123.0f, order.applyTax(0.23f)); // 23% VAT
    }
}