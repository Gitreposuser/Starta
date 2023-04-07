import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class MorseDemo {
    public static void main(String[] args) {
        MorseService morse = new MorseService();
        String res = morse.encodeMorse("1 2 3 4 ");
        //String res = morse.encodeMorse("abc feh");
        //String res = morse.decodeMorse(".---- ..--- ...-- ....-");
        //String res = morse.encodeMorseAdvance("a b c   f e h ");
        System.out.println(res);
    }
}