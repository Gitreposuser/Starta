import java.util.Random;

public class WordService {
    private String givenString;
    private String words[];
    private int wordsCount;
    private char separator;
    private String mostUsedWord;
    private int counter;

    public String getGeneratedString()
    {
        return this.givenString;
    }

    public WordService(String text, char separator)
    {
        this.givenString = text;
        this.separator = separator;
        getWordsCount();
        this.words = new String[this.wordsCount];
        this.mostUsedWord = null;
        this.counter = 0;
    }

    public String findMostFrequentWord(String text)
    {
        if(null == text)
        {
            return null;
        }

        cutStringToWords();
        countMatch();
        return this.mostUsedWord;
    }

    private void getWordsCount()
    {
        String text = this.givenString;
        char separator = this.separator;
        int counter = 0;

        for(int position = 0; position < text.length(); position++)
        {
            if(separator == text.charAt(position))
            {
                counter++;
            }
        }
        if(separator != text.charAt(text.length() - 1))
        {
            counter++;
        }
        this.wordsCount = counter;
    }

    private void cutStringToWords()
    {
        String text = this.givenString;
        String word = "";
        char separator = this.separator;
        String result[] = new String[this.words.length];
        char curChar = '0';
        int wordsCounter = 0;

        for(int pos = 0; pos < text.length(); pos++)
        {
            curChar = (char)text.charAt(pos);
            if(separator == curChar)
            {
                result[wordsCounter] = word;
                wordsCounter++;
                word = "";
            }
            else
            {
                word += curChar;
            }
        }

        if(separator != curChar)
            result[wordsCounter] = word;
        this.words = result;
    }

    private void countMatch()
    {
        int counter = 0;
        int max = 0;
        String mostUsedWord = "";

        for(String buffer1: words)
        {
            for (String buffer2: words)
            {
                if(buffer1.equals(buffer2))
                {
                    counter++;
                }
            }
            if(max < counter)
            {
                mostUsedWord = buffer1;
                max = counter;
            }
            counter = 0;
        }
        this.mostUsedWord = mostUsedWord;
        this.counter = max;
    }

    public void generateString(int size)
    {
        if(1 > size)
        {
            this.givenString = "ooups something whent wrong";
            return;
        }

        char separator = this.separator;
        String word = "";
        int wordMazSize = 7;
        String result = "";
        Random rnd = new Random();

        for(int words = 0; words < size; words++)
        {
            int wordLength = 3 + rnd.nextInt(wordMazSize);
            for(int symbol = 0; symbol < wordLength; symbol++)
            {
                word += (char)(97 + rnd.nextInt(26));
            }
            result += word + separator;
            word = "";
        }
        this.givenString = result;
    }
}