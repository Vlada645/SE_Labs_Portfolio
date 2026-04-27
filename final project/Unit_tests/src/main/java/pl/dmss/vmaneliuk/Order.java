package pl.dmss.vmaneliuk;

public class Order {
    private float basePrice;

    public Order(float basePrice) {
        this.basePrice = basePrice;
    }
    public float calculateTotal(int quantity) {
        return basePrice * quantity;
    }
    public float applyTax(float taxRate) {
        return 0;
    }
}
