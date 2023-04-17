package Task11_12;

// ********************
// *** Task 11 - 12 ***
// ********************

public class Fahrenheit implements MeteoData{
    public float convertToFahrenheit(float temp) {
        final float fahrenheitConstant = 273.15F;
        float converted = (temp - fahrenheitConstant) * 9 / 5 + 32;
        return converted;
    }

    @Override
    public void showTemp(float temp) {
        System.out.printf("Current temperature = %.2f \u2103",
                convertToFahrenheit(temp));
    }
}
