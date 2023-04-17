public class EmailDemo {
    public static void main(String[] args)
            throws EmailValidationException {
        String email;
        int tries = 3;
        while(tries > 0) {
             email = UI.getEmail();
            try {
                Validator.validate(email);
                System.out.println("E-mail address accepted.");
                break;
            } catch (EmailValidationException e) {
                --tries;
                System.err.println("Exception occurred " + e.getMessage());
                System.err.println(tries + " attempts left...");
            }
        }
    }
}