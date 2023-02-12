package Task3;

import java.util.TreeSet;

public class HeavyBoxDemo {
    public static void main(String[] args) {
        TreeSet<HeavyBox> boxes = new TreeSet<>();

        HeavyBox temp;
        for(int i = 0; i < 10; i++) {
            boxes.add(new HeavyBox(true));
        }

        for(HeavyBox box: boxes) {
            System.out.println("-----------");
            System.out.println(box);
        }
        System.out.println("boxes tree size is: " + boxes.size());
    }
}
