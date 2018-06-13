import java.util.*;
import java.io.*;
/**
 * THis version of the driver reads all the student
 * data from a data file.
 * 
 * @author L. Lehmann 
 * @version v1
 */

public class ClockSolitaire {
    public static void main(String[ ] args)throws IOException
    {
        Scanner input = new Scanner(System.in);//to read the name of the data file
        String choice;

        int score = 13;
        //declare a reference variable to hold address of array object
        Pile[] myPile = new Pile[4];
        Card[] deck;
        Card[] cards;
        
        //loop for initializing card piles
        do 
        {
            Deck myDeck = new Deck();
            myDeck.shuffle();
            Card myCard = new Card();

            System.out.println(myCard.getSuit());
            System.out.println(myCard.getValue());

            for ( int i=0; i < 13; i++) {
                Pile pile = new Pile();

                myPile[i].addCardFaceDown(myCard);
                Card card = myDeck.dealCard();
                pile.addCardFaceDown(card);                
            }
            
            System.out.println(myPile.toString());

            int numberOfStepsMade = 0;

            System.out.println("User score : " + score);
            System.out.println(myDeck);
            System.out.println("\nPlay Again? type yes or no");
            choice = input.next();
        }while(choice.equals("yes"));
    }
}
