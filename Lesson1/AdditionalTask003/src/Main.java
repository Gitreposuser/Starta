public class Main {
    public static void main(String[] args) {

        CreditCard card = new CreditCard(0,
                                        1111);
        card.deposit(1111, 200);
        card.showCardData();
        card.withdraw(1111, 10.1);
        card.showCardData();
    }
}