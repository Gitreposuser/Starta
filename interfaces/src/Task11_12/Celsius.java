package Task11_12;

// ********************
// *** Task 11 - 12 ***
// ********************

public class Celsius extends TempDataService implements MeteoData {
    private static float convertToCelsius(float temp) {
        final float celsiusConstant = 273.15F;
        float converted = temp - celsiusConstant;
        return converted;
    }

    @Override
    public void showTemp(float temp) {
        System.out.printf("Current temperature = %.2f \u2103",
                convertToCelsius(temp));
    }
}
