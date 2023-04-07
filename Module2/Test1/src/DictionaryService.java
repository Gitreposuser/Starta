import java.util.*;

public class DictionaryService {
    private Hashtable<String, String> words;

    public DictionaryService() {
        words = new Hashtable<>();
        words.put("plane", "samolet");
        words.put("train", "poezd");
        words.put("car", "avtomobil");
    }

    public String getTranslation(String word) {
        System.out.println(words.get(word));
        if(words.get(word) == null) {
            System.out.println("condition is true");
            addWordToDictionary(word);
        }
        return words.get(word);
    }

    public void addWordToDictionary(String word) {
        System.out.println("There is no such word in dictionary");
        System.out.println("Propose your translation for: " + word);
        String translated = UI.inputLine();
        words.put(word, translated);
    }
}
