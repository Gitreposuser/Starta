package Task1_3;

public class WordService {
    public String findMostFrequentWord(final String text, final char separator) {
        if(null == text) {
            return null;
        }

        int wordCount = getWordsCount(text, separator);
        String [] words = cutStringToWords(text, separator, wordCount);
        String result = countMatch(words);
        return result;
    }

    private int getWordsCount(final String text, final char separator) {
        int counter = 0;

        for(int position = 0; position < text.length(); position++) {
            if(separator == text.charAt(position)) {
                counter++;
            }
        }
        if(separator != text.charAt(text.length() - 1)) {
            counter++;
        }
        return counter;
    }

    private String [] cutStringToWords(final String text, final char separator, final int numberOfWords) {
        String word = "";
        String result [] = new String[numberOfWords];
        char curChar = '0';
        int wordsCounter = 0;

        for(int pos = 0; pos < text.length(); pos++) {
            curChar = (char)text.charAt(pos);
            if(separator == curChar) {
                result[wordsCounter] = word;
                wordsCounter++;
                word = "";
            } else {
                word += curChar;
            }
        }

        if(separator != curChar) {
            result[wordsCounter] = word;
        }
        return result;
    }

    private String countMatch(String [] words)
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
        return mostUsedWord;
    }
}