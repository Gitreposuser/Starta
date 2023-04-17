public class EmailValidationException extends Exception {
    public EmailValidationException() {
        System.err.println("Email validation exception occurred! ");
    }

    @Override
    public String getMessage() {
        return "Wrong e-mail address! ";
    }
}