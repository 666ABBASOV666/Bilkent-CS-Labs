import java.util.Scanner;
import java.util.Random;
public class Lab05_Q2{ 
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int deck = 0; // first count of deck
        int i = 0; // for deck in the loop

        System.out.println("Starting the game with the following deck: ");

        for ( i = 1; i <= 9 ; i++){
            for (int j = 0; j < 4; j++){
                deck = i;
                System.out.print(deck);
                  
            } 
        }
        System.out.println("");
        System.out.println("Dealer now is dealing the cards... ");

        String playerDeck = ("111122223333444455556666777788889999");
        char neyse;
        int length = playerDeck.length(); //36 cards
        int playerHand = 0;
        String playerPoints = "";
        
        System.out.println("Player's hand: ");
        for(int r = 0; 2 > r; r++)
        {
            int lengthRandom = rand.nextInt(length);// random num from 36 deck
            neyse = playerDeck.charAt(lengthRandom); // takes char from random
            playerHand = playerHand + Integer.parseInt(String.valueOf(neyse));;
            playerDeck = playerDeck.replaceFirst(String.valueOf(neyse), ""); //replace the card to the empty space
            System.out.print(neyse);
            playerPoints = playerPoints + String.valueOf(neyse); // cards numbers in the hand
            length--;
        }
        
        System.out.println("");

        int dealerHand = 0;
        String dealerPoints = "";
        String secret = "?";
        

        System.out.println("Dealer's hand:");
        for(int d = 0; 2 > d; d++){
            int lengthRandom = rand.nextInt(length);// random num from 36 deck
            neyse = playerDeck.charAt(lengthRandom); // takes char from random
            dealerHand = dealerHand + Integer.parseInt(String.valueOf(neyse)); //sum of the cards
            playerDeck = playerDeck.replaceFirst(String.valueOf(neyse), ""); //replace the card to the empty space
            secret = secret.replaceFirst(String.valueOf(neyse), "?");
            System.out.print(neyse);
            dealerPoints = dealerPoints + String.valueOf(neyse); // cards numbers in the hand
            length--;
        }



       

       
    
    }
}