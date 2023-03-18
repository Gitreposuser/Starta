import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseService {
    // "a" = 97, "z" = 122; "0" = 48, "9" = 57
    private final String [] morseView = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            "-----", ".----", "..---", "...--", "....-", ".....", "-....",
            "--...", "---..", "----."
    };
    private final String [] symbolView = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z",
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };

    public String encodeMorse(String text) {
        String encoded = "";
        text = text.toLowerCase();
        int index = 0;
        Pattern pattern = Pattern.compile("\\w*\s");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            String buffer = matcher.group();
            System.out.println(buffer);
            for(String symbol: buffer.split(" ")) {
                index = Arrays.asList(symbolView).indexOf(symbol);
                encoded += morseView[index] + " ";
            }
        }
        return encoded;
    }

    public String encodeMorseAdvance(String text) {
        String encoded = "";
        text = text.toLowerCase();
        int index = 0;
        for(String symbol: text.split(" ")) {
            // If current symbol is number
            int keyCode = symbol.charAt(0);
            if(keyCode > 47
                    && keyCode < 58) {
                index = keyCode - 22;
            }
            // If current symbol is letter
            if(keyCode > 96
                    && keyCode < 123) {
                index = keyCode - 97;
            }
            encoded += morseView[index] + " ";
        }
        return encoded;
    }

    public String decodeMorse(String text) {
        String decoded = "";
        int index = 0;
        for(String symbol: text.split(" ")) {
            index = Arrays.asList(morseView).indexOf(symbol);
            decoded += symbolView[index];
        }
        return decoded;
    }

    /*
    private String translateText(String text, boolean encode) {
        String result = "";
        int index = 0;
        if(encode) {
            for(String symbol: text.split(" ")) {
                index = Arrays.asList(symbolView).indexOf(symbol);
                result += morseView[index] + " ";
            }
        } else {
            for(String symbol: text.split(" ")) {
                index = Arrays.asList(morseView).indexOf(symbol);
                result += symbolView[index];
            }
        }
        return result;
    }

     */
}
