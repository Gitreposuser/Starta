public class Main {
    public static void main(String[] args) {

        int [] array = ArrayService.createArray();
        ArrayService.initArray(array);
        ArrayService.showArray(array);
        ArrayService.increaseArrayByTwo(array);
        ArrayService.showArray(array);
    }
}