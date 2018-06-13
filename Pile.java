
public class Pile {
    private Card[] pile; 
    private boolean[] faceUp;
    //populates pile with new cards all face down
    public Pile()
    {
        for(int i = 0; i < pile.length; i++)
        {
            pile[i] = new Card(); 
            faceUp[i] = false; 
        }
    }
    //Pile method takes in cards to create the pile and adds cards facing up
    public Pile(Card[] cards, boolean[] faces)
    {
        for(int i = 0; i < cards.length; i++)
        {
            pile[i] = cards[i];     
            faceUp[i] = faces[i]; 
        }
    }
    //adds a facedown card to the pile 
    public void addCardFaceDown(Card card)
    {
        pile[pile.length] = card; 
        faceUp[pile.length] = false; 
    }
    //removes a card from the pile
    public Card removeCard()
    {
        for(int i = 0; i < pile.length; i++)
        {
            if (faceUp[i] == false)
            {
                return pile[i];
            }else
                continue;
        }
        return null; 
    }
    //calculates the number of facedown cards
    public int getNumberOfFaceDown()
    {
        int facedown = 0;
        for(int i = 0; i < pile.length; i++)
        {
            if (faceUp[i] == false)
                facedown++; 
        }
        return facedown; 
    }
    //adds a face up card to the pile
    public void addCardFaceUp(Card card)
    {
        pile[pile.length] = card; 
        faceUp[pile.length] = true; 

    }
    //calculates the number of face up cards in a pile
    public int getNumberOfFaceUp()
    {
        int faceup = 0; 
        for(int i = 0; i < pile.length; i++)
        {
            if (faceUp[i] == true)
                faceup++; 
        }
        return faceup; 
    }
    //prints out to user
    public String toString()
    {
        String temp = ""; 
        for(int i = 0; i < pile.length; i++)
        {
            temp += pile[i].toString() + " "; 
        }
        return temp; 
    }
}
