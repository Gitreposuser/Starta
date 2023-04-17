package Task11_12;

// ********************
// *** Task 11 - 12 ***
// ********************

public class Absolut extends TempDataService implements MeteoData {
    @Override
    public void showTemp(float temp) {
        System.out.printf("Current temperature = %.2f K",
                getAbsolutTemp());
    }
}
