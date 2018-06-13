import java.util.*; 
public class Deck 
{
    private Card[] deck; 
    private int indexTop; 
    
    private String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"}; 
    private String[] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; 

    public Deck() 
    {
        deck =  new Card[52]; 
        indexTop = 0; 
        int tempIndex = 0; 

        for(int i = 0; i < suits.length; i++)
        {
            for (int k = 0; k < faces.length; k++)
            {
                deck[tempIndex++] = new Card(faces[k], suits[i],k + 1);
            }
        }
    }
    //shuffle method to randomize the card deck
    public void shuffle()
    {
        Random rand = new Random(); 

        Card temp; 
        for(int i = 0; i < 500; i++)
        {
            int rand1 = rand.nextInt(52); 
            int rand2 = rand.nextInt(52); 
            while (rand1 == rand2)
            {
                rand2 = rand.nextInt(52); 
            }
            temp = deck[rand1]; 
            deck[rand1] = deck[rand2]; 
            deck[rand2] = temp; 
        }
    }
    //deals out a card for a pile
    public Card dealCard()
    {
        return deck[indexTop++]; 
    }
    //checks the amount of cards remaining
    public int cardsLeft()
    {
        return deck.length - indexTop; 
    }
    //method to print to user
    public String toString()
    {
        String temp = ""; 
        for(int i = indexTop; i < deck.length; i++)
        {
            temp = deck[i].toString() + " "; 
        }
        return temp; 
    }
}
