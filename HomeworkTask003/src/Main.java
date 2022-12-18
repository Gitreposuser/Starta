public class Main {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        dealer.initCardStack();

        /*
        System.out.println(" Base card stack.");
        dealer.showCardStack();

        System.out.println("");
        System.out.println(" Mixed card stack.");
        System.out.println("");
        */

        dealer.mixCardStack();
        //dealer.showCardStack();

        int numberOfPlayers = UI.getNumberOfPlayers();
        dealer.dealForNPlayers(numberOfPlayers);
    }
}