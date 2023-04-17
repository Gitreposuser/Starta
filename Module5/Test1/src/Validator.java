import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator extends EmailValidationException{
    public static boolean validate(String email) throws EmailValidationException {
        final String restrictedChars = "[^a-zA-Z0-9@\\.\\_]";
        email = email.replaceAll(restrictedChars, "");
        Pattern pattern = Pattern.compile("\\w*\\@\\w*\\.\\w{2,4}");
        Matcher matcher = pattern.matcher(email);
        if(matcher.find()) {
            return true;
        }
        throw new EmailValidationException();
    }
}