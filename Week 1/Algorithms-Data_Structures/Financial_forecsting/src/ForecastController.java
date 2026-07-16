public class ForecastController {
    private final ForecastService forecastService;
    private final ForecastView forecastView;

    public ForecastController(ForecastService forecastService, ForecastView forecastView) {
        this.forecastService = forecastService;
        this.forecastView = forecastView;
    }

    public void showForecast(FinancialRecord record) {
        forecastView.showHeading("Financial Forecasting Using Recursion");
        forecastView.showRecursionIdea(forecastService.getRecursionNote());
        forecastView.showStartingValue(record.getPresentValue());
        forecastView.showGrowthRates(record.getGrowthRates());

        double futureValue = forecastService.findFutureValue(
                record.getPresentValue(),
                record.getGrowthRates(),
                0
        );

        forecastView.showForecast(futureValue);
    }
}
