package Task10;

public class Main {
    public static void main(String[] args) {

        CreditCard card = new CreditCard();
        card.InitCreditCard(1234, 1111);
        System.out.println("deposit 200");
        card.deposit(1111, 200);
        System.out.println("new balance: ");
        card.showCardData();
        System.out.println("withdraw 10.1");
        card.withdraw(1111, 10.1);
        System.out.println("new balance: ");
        card.showCardData();
    }
}