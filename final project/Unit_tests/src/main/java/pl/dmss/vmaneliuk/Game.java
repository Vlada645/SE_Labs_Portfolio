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
        // TDD Green Phase: Minimal implementation to pass the test
        if (percent > 0 && percent <= 100) {
            this.price = this.price - (this.price * percent / 100);
        }
    }
}