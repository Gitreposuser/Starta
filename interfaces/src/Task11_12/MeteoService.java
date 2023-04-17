package Task11_12;

// ********************
// *** Task 11 - 12 ***
// ********************

// Old site version
public class MeteoService extends TempDataService{
    private static float convertToCelsius(float temp) {
        final float celsiusConstant = 273.15F;
        float converted = temp - celsiusConstant;
        return converted;
    }

    public static void showTemp(float temp) {
        System.out.printf("Current temperature = %.2f \u2103",
                convertToCelsius(temp));
    }
}
