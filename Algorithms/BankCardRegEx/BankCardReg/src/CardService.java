import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardService {
    public String generateCardData(int curMonth, int curYear) {
        // Generate card number
        String result = generateNumberSequence(16);

        // Generate valid date
        result += getValidDate(curMonth, curYear);

        // Generate CVV code
        result += generateNumberSequence(3);
        return result;
    }

    private String generateNumberSequence(int size) {
        StringBuffer result = new StringBuffer();
        Random rnd = new Random();
        for(int digit = 0; digit < size; digit++) {
            result.append(rnd.nextInt(10));
        }
        return result.toString();
    }

    private String getValidDate(int curMonth, int curYear) {
        String result = "";
        if(curMonth < 10) {
            result += "0";
        }
        result += curMonth;
        if(curYear < 10) {
            result += "0";
        }
        result += curYear;
        return result;
    }

    public boolean isCardValid(String readableCardData) {
        // Validate month and year
        Pattern dateReg = Pattern.compile("(\\d{2})/(\\d{2})");
        Matcher dateMatcher = dateReg.matcher(readableCardData);
        dateMatcher.region(43, readableCardData.length());
        if(dateMatcher.find()) {
            int month = Integer.parseInt(dateMatcher.group(1));
            if(month < 1 || month > 12) {
                return false;
            }
            int year = Integer.parseInt(dateMatcher.group(2));
            if(year == 0) {
                return false;
            }
        } else {
            throw new RuntimeException("Invalid card data!");
        }
        return true;
    }

    public String createReadableCard(String cardData) {
        String result = "CARD NUMBER: ";

        Pattern cardPattern = Pattern
                .compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})"
                        + "(\\d{2})(\\d{2})(\\d{3})");
        Matcher numberMatcher = cardPattern.matcher(cardData);
        if(numberMatcher.find()) {
            // Set card number
            result += numberMatcher.group(1) + " ";
            result += numberMatcher.group(2) + " ";
            result += numberMatcher.group(3) + " ";
            result += numberMatcher.group(4) + " ";

            // Set month and year
            result += "EXP DATE: ";
            result += numberMatcher.group(5) + "/";
            result += numberMatcher.group(6) + " ";

            // Set CVV code
            result += "CVV: ";
            result += numberMatcher.group(7);
        } else {
            throw new RuntimeException("Invalid card data!");
        }
        return result;
    }
}
