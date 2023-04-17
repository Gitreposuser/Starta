package Task11_12;

// ********************
// *** Task 11 - 12 ***
// ********************

public class MeteoDemo {
    public static void main(String[] args) {
        // Uncomment to test: 0 celsius, 32 fahrenheit
        //final float absolutTemp = 273.15F;
        final float absolutTemp = TempDataService.getAbsolutTemp();

        // Old version
        System.out.println("Old version.");
        MeteoService.showTemp(absolutTemp);

        // New version
        // Kelvin
        System.out.println("\n New version.");
        System.out.println("\n*** Kelvin ***");
        Absolut kelvin = new Absolut();
        kelvin.showTemp(absolutTemp);

        // Celsius
        System.out.println("\n*** Celsius ***");
        Celsius celsius = new Celsius();
        celsius.showTemp(absolutTemp);

        // Fahrenheit
        System.out.println("\n*** Fahrenheit ***");
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.showTemp(absolutTemp);
    }
}