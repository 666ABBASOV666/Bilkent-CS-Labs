import java.util.Scanner;
import java.util.Random;

public class Lab05_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int deck = 0; // first count of deck
        int i = 0; // for deck in the loop

        System.out.println("Starting the game with the following deck: ");

        for (i = 1; i <= 9; i++) {
            for (int j = 0; j < 4; j++) {
                deck = i;
                System.out.print(deck);

            }
        }
        System.out.println("");
        System.out.println("Dealer now is dealing the cards... ");

        String playerDeck = ("111122223333444455556666777788889999");
        char neyse;
        int length = playerDeck.length(); // 36 cards
        int playerHand = 0;
        String playerPoints = "";

        System.out.println("Player's hand: ");
        for (int r = 0; 2 > r; r++) {
            int lengthRandom = rand.nextInt(length);// random num from 36 deck
            neyse = playerDeck.charAt(lengthRandom); // takes char from random
            playerHand = playerHand + Integer.parseInt(String.valueOf(neyse));
            playerDeck = playerDeck.replaceFirst(String.valueOf(neyse), ""); // replace the card to the empty space
            System.out.print(neyse);
            playerPoints = playerPoints + String.valueOf(neyse); // cards numbers in the hand
            length--;
        }

        System.out.println("");

        int dealerHand = 0;
        String dealerPoints = "";
        String secret = "?";
        char secret0;
        int tray = 0;

        System.out.println("Dealer's hand:");
        for (int d = 0; 2 > d; d++) {
            boolean bool = true;
            int lengthRandom = rand.nextInt(length);// random num from 36 deck
            neyse = playerDeck.charAt(lengthRandom); // takes char from random
            dealerHand = dealerHand + Integer.parseInt(String.valueOf(neyse)); // sum of the cards
            playerDeck = playerDeck.replaceFirst(String.valueOf(neyse), ""); // replace the card to the empty space
            dealerPoints = dealerPoints + String.valueOf(neyse); // cards numbers in the hand
            tray++;
            length--;

            if (tray > 1) {
                secret0 = dealerPoints.charAt(1);
                secret = dealerPoints.replace(String.valueOf(secret0), "?");
                System.out.print(secret);
                bool = false;
            }
        }
        System.out.println("");

        boolean bool1 = true;
        do {

            System.out.println("Please enter your choice: ");
            System.out.println("1) Hit ");
            System.out.println("2) Stand ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Hit! Dealer is giving the player a card...");
                System.out.println("Player's hand: ");

                int lengthRandom = rand.nextInt(length);// random num from 36 deck
                neyse = playerDeck.charAt(lengthRandom); // takes char from random
                playerHand = playerHand + Integer.parseInt(String.valueOf(neyse));// sum of the cards
                playerDeck = playerDeck.replaceFirst(String.valueOf(neyse), ""); // replace the card to the empty space
                playerPoints = playerPoints + String.valueOf(neyse); // cards numbers in the hand
                length--;
                System.out.println(playerPoints);
                if (playerHand == 21) {
                    System.out.println("Player scored 21. Player wins! ");
                    break;
                }
                if (playerHand > 21) {
                    System.out.println("Player scored over 21. Player lost! ");
                    break;
                }
            }

            if (choice == 2) {

                System.out.println("Stand! Player's turn is now over. Player's hand sums to " + playerHand + ".");
                bool1 = false;

            }
        } while (bool1 == true);

        boolean bool2 = true;
        do {

            System.out.println("Dealer is drawing cards... ");

            int lengthRandom = rand.nextInt(length);// random num from 36 deck
            neyse = playerDeck.charAt(lengthRandom); // takes char from random
            dealerHand = dealerHand + Integer.parseInt(String.valueOf(neyse)); // sum of the cards
            playerDeck = playerDeck.replaceFirst(String.valueOf(neyse), ""); // replace the card to the empty space
            dealerPoints = dealerPoints + String.valueOf(neyse); // cards numbers in the hand
            length--;
            System.out.println(dealerPoints);

            if (dealerHand == 21) {
                System.out.println("Dealer scored 21. Dealer wins! ");
                bool2 = false;
            }
            if (dealerHand > 21) {
                System.out.println("Dealer scored over 21. Dealer lost! ");
                bool2 = false;
            }
            if (dealerHand > playerHand && dealerHand <= 21) {
                System.out.println("Dealer scored more than player. Dealer wins!");
                bool2 = false;
            }

        } while (bool2 == true);

    }
}
