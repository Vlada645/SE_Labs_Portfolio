import org.junit.jupiter.api.BeforeEach;
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

    private Game game;

    @BeforeEach
    public void setUp() {
        // Shared setup for tests
        game = new Game("Test Game", 100.0f);
    }

    @Test
    public void testApplyDiscount() {
        game.applyDiscount(20);
        assertEquals(80.0f, game.getPrice());
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

    @Test
    public void testOrderValidity() {
        Order order = new Order(0.0f);
        assertFalse(order.isOrderValid(), "Order with zero price should be invalid");
    }
}