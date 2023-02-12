package Task3;

import java.util.Random;

public class HeavyBox implements Comparable<HeavyBox>{
    private float length;
    private float width;
    private float height;
    private float weight;

    public HeavyBox(boolean generateRandom) {
        if(!generateRandom) {
            return;
        }

        Random rnd = new Random();
        this.length = 1 + rnd.nextFloat(10);
        this.width = 1 + rnd.nextFloat(20);
        this.height = 1 + rnd.nextFloat(5);
        this.weight = 1 + rnd.nextFloat(25);
    }

    @Override
    public int compareTo(HeavyBox o) {
        return (int)(o.weight - this.weight);
    }

    @Override
    public String toString() {
        return "Box parameters: "
                + "\nlength - " + this.length
                + "\nwidth - " + this.width
                + "\nheight - " + this.height
                + "\nweight is: " + this.weight;
    }
}
