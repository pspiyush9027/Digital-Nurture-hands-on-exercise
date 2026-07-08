public class Main {
    public static void main(String[] args) {
        double[] yearlyGrowthRates = {0.10, 0.08, 0.12, 0.07};

        FinancialRecord record = new FinancialRecord(10000, yearlyGrowthRates);
        ForecastService forecastService = new ForecastService();
        ForecastView forecastView = new ForecastView();
        ForecastController forecastController = new ForecastController(forecastService, forecastView);

        forecastController.showForecast(record);
    }
}
