public class ForecastView {

    public void showHeading(String text) {
        System.out.println(text);
    }

    public void showRecursionIdea(String message) {
        System.out.println(message);
    }

    public void showStartingValue(double value) {
        System.out.println("Starting value : " + value);
    }

    public void showGrowthRates(double[] growthRates) {
        System.out.print("Growth rates   : ");

        for (int i = 0; i < growthRates.length; i++) {
            System.out.print((growthRates[i] * 100) + "%");
            if (i < growthRates.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void showForecast(double finalValue) {
        System.out.printf("Predicted value: %.2f%n", finalValue);
    }
}
