public class FinancialRecord {
    private final double presentValue;
    private final double[] growthRates;

    public FinancialRecord(double presentValue, double[] growthRates) {
        this.presentValue = presentValue;
        this.growthRates = growthRates;
    }

    public double getPresentValue() {
        return presentValue;
    }

    public double[] getGrowthRates() {
        return growthRates;
    }
}
