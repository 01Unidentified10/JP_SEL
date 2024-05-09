public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double CASH_TO_MILES_CONVERSION_RATE = 0.0035;

    public RewardValue(double value) {
        if (value >= 0) {
            this.cashValue = value;
            this.milesValue = (int) (value / CASH_TO_MILES_CONVERSION_RATE);
        } else {
            throw new IllegalArgumentException("Value must be non-negative");
        }
    }

    public RewardValue(int value) {
        if (value >= 0) {
            this.milesValue = value;
            this.cashValue = value * CASH_TO_MILES_CONVERSION_RATE;
        } else {
            throw new IllegalArgumentException("Value must be non-negative");
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
