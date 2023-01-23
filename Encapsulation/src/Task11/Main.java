package Task11;

public class Main {
    public static void main(String [] args) {
        Palindrom pal = new Palindrom();
        final String [] text = { "abcdcba", "b", "abc", "abba", "Abba"};
        boolean result;
        for(int index = 0; index < text.length; index++) {
            result = pal.isPalindrom(text[index]);
            showResult(text[index], result);
        }
    }

    private static void showResult(String text, boolean result) {
        System.out.println("testing string: " + text);
        System.out.println("Is palindrom? " + result);
        System.out.println("");
    }
}
