import org.junit.jupiter.api.Test;
import pl.dmss.vmaneliuk.Game;
import pl.dmss.vmaneliuk.Library;
import pl.dmss.vmaneliuk.Order;

import static org.junit.Assert.assertTrue;

public class GameStoreTest {
    @Test
    public void testLibraryAdd() {
        Library library = new Library(101); // ownerId = 101
        Game game = new Game("Elden Ring", 60.0f);
        library.addGame(game);
        assertTrue(library.hasGame("Elden Ring")); // This will fail now
    }

    @Test
    public void testRefundPolicy() {
        Order order = new Order(60.0f);
        // If owned for 5 days, refund should be allowed
        assertTrue(order.isEligibleForRefund(5)); // This will fail now
    }
}
