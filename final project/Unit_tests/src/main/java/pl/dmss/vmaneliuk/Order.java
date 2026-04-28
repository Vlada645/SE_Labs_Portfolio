package pl.dmss.vmaneliuk;

public class Order {
    private static final int REFUND_WINDOW_DAYS = 14; // Policy from SRS
    private float basePrice;

    public Order(float basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isEligibleForRefund(int daysOwned) {
        return daysOwned >= 0 && daysOwned <= REFUND_WINDOW_DAYS;
    }

    public float calculateTotal(int quantity) {
        return (quantity <= 0) ? 0 : basePrice * quantity;
    }

    public float applyTax(float taxRate) {
        return basePrice + (basePrice * taxRate);
    }
    public boolean isOrderValid() {
        return basePrice > 0;
    }
}
