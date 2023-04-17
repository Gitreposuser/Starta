package Task11_12;

import java.util.Random;

// ********************
// *** Task 11 - 12 ***
// ********************

public class TempDataService {
    public static float getAbsolutTemp() {
        Random rnd = new Random();
        final float minTemp = 223.15F;
        float temperature = rnd.nextFloat(100) + minTemp;
        return temperature;
    }
}
