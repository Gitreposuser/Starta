package Task11;

public class Palindrom {
    public boolean isPalindrom(String text) {
        if(1 == text.length()) {
            return true;
        }

        text = text.toLowerCase();
        int headPosition = 0;
        int tailPosition = text.length() - 1;
        boolean isSymbolsEqual;

        while (headPosition < tailPosition) {
            isSymbolsEqual = (text.charAt(headPosition)
                    == text.charAt(tailPosition));

            if (isSymbolsEqual) {
                headPosition++;
                tailPosition--;
            } else {
                return false;
            }
        }
        return true;
    }
}
