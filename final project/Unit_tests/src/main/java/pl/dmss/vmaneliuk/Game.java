package pl.dmss.vmaneliuk;

public class Game {

    private String title;
    private float price;

    public Game(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public float getPrice() {
        return price;
    }

    public boolean isValidPrice() {
        return this.price >= 0;
    }

    public void applyDiscount(int percent) {
        if (percent > 0 && percent <= 100) {
            this.price = this.price - (this.price * percent / 100);
        }
    }
}