public class Ornithosaurian implements Ground, Air {

    @Override
    public void fly() {
        System.out.println(" Ornithosaurian can fly ");
    }

    @Override
    public void run() {
        System.out.println(" Ornithosaurian can crawl ");
    }
}
