public class TranslatorDemo {
    public static void main(String[] args) {
        DictionaryService dictionary = new DictionaryService();
        String word = UI.inputLine();
        while(!word.equals("exit")) {
            String translatedWord = dictionary.getTranslation(word);
            System.out.println("Translated word: " + translatedWord);
            word = UI.inputLine();
        }
    }
}