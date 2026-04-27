package pl.dmss.vmaneliuk;

/**
 * TDD Red Phase: Initial test for the discount logic.
 * This test is expected to fail.
 */
public class Game {

    private String title;
    private float price;

    public Game(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void applyDiscount(int percent) {
        // TDD Red Phase: Method is empty, test will fail.
    }
}