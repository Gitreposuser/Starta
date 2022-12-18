import java.util.Random;

public class Dealer {
    private Card [] cardStack;
    private int currentCardPointer;

    public void initCardStack() {
        this.currentCardPointer = 0;
        this.cardStack = new Card[52];
        String [] cardSuit = new String[] {
                "\u2660", "\u2665", "\u2666", "\u2663"
        };
        String [] cardValue = new String[] {
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
        };

        String firstCardSuit = "\u2660";

        int cardSuitSwitcher = 0;
        int cardValueSwitcher = 0;
        for(int i = 0; i < 52; i++) {
            cardStack[i] = new Card(cardValue[cardValueSwitcher] + cardSuit[cardSuitSwitcher]);
            if(cardSuitSwitcher < 3) {
                cardSuitSwitcher++;
            } else {
                cardSuitSwitcher = 0;
                cardValueSwitcher++;
            }
        }
    }

    public void mixCardStack() {
        Random rnd = new Random();
        int firstCardIndex;
        int secondCardIndex;

        for (int cycle = 0; cycle < 100; cycle++) {
            firstCardIndex = rnd.nextInt(51);
            secondCardIndex = rnd.nextInt(51);
            swapCards(firstCardIndex, secondCardIndex);
        }
    }

    public void dealForNPlayers(int numberOfPlayers) {
        if(1 > numberOfPlayers) {
            System.out.println(" Nothing to show. Try again.");
            return;
        }
        if(10 < numberOfPlayers) {
            System.out.println(" To many players. Try again.");
            return;
        }
        for(int playerNum = 0; playerNum < numberOfPlayers; playerNum++) {
            String playerNumber = Integer.toString((playerNum + 1));
            dealCards(playerNumber + " player cards is:");
        }
    }

    private void dealCards(String message) {
        System.out.println("");
        System.out.println(message);
        int startVal = this.currentCardPointer;
        int endVal = this.currentCardPointer + 5;
        this.currentCardPointer += 5;

        for(int card = startVal; card < endVal; card++) {
            System.out.print(this.cardStack[card].getValue() + ", ");
        }
        System.out.println("");
    }

    private void swapCards(int firstIndex, int secondIndex) {
        Card buffer;
        buffer = this.cardStack[firstIndex];
        this.cardStack[firstIndex] = this.cardStack[secondIndex];
        this.cardStack[secondIndex] = buffer;
    }

    public void showCardStack() {
        int lineBreaker = 0;
        for(int i = 0; i < this.cardStack.length; i++) {
            System.out.print(cardStack[i].getValue());
            if(lineBreaker < 3) {
                lineBreaker++;
                System.out.print(", ");
            } else {
                lineBreaker = 0;
                System.out.println("");
            }
        }
    }
}