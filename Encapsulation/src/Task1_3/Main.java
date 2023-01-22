package Task1_3;

public class Main {
    public static void main(String [] args) {
        String text = "a b c aa vb aa cn nj tm aaa cc aaa n";
        char separator = ' ';
        WordService service = new WordService();
        String result = service.findMostFrequentWord(text, separator);
        System.out.println(" most frequent word is : " + result);
    }
}
