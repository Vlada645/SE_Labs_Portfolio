package pl.dmss.vmaneliuk;

public class Order {
    private float basePrice;

    public Order(float basePrice) {
        this.basePrice = basePrice;
    }
    public float calculateTotal(int quantity) {
        if (quantity <= 0) return 0; // Refactored to handle invalid quantities
        return basePrice * quantity;
    }
    public float applyTax(float taxRate) {
        return basePrice + (basePrice * taxRate);
    }
    public boolean isOrderValid() {
        return basePrice > 0;
    }

    public boolean isEligibleForRefund(int i) {
        if (i <= 5) {
            return true;
        } else {
            return false;
        }

    }
}
