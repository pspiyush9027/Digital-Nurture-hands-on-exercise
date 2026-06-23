public class ForecastService {

    public double findFutureValue(double currentValue, double[] growthRates, int yearIndex) {
        if (yearIndex == growthRates.length) {
            return currentValue;
        }

        double updatedValue = currentValue * (1 + growthRates[yearIndex]);
        return findFutureValue(updatedValue, growthRates, yearIndex + 1);
    }

    public String getRecursionNote() {
        return "Recursion means a method calls itself to solve a problem in smaller steps.";
    }
}
