public class Main {
    public static void main(String[] args) {
        //WordService service = new WordService(300);
        String text = "aa bb cc aa bb ff aaa bbb ee aa";
        String result;
        char separator = ' ';
        WordService service = new WordService(text, separator);
        result = service.findMostFrequentWord(service.getGeneratedString());

        System.out.println(result);
    }
}