public class Main {
    public static void main(String[] args) {
        CardService card = new CardService();
        String result = card.generateCardData(3, 23);
        System.out.println("Generated card data: ");
        System.out.println(result);
        result = card.createReadableCard(result);
        System.out.println("Redable card data: ");
        System.out.println(result);
        if(card.isCardValid(result)) {
            System.out.println("Card date is valid");
        } else {
            System.out.println("Warning card date is invalid!");
        }
    }
}