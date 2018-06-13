
public class Card {
	private String face; 
	private String suit; 
	private int value;  
	//no args constructor
	public Card()
	{
		face = ""; 
		suit = ""; 
		value = 0; 
	
	}
	//Card class take in
	public Card(String f, String s, int v)
	{
		face = f; 
		suit = s; 
		value = v; 
	}
	//returns the suit of the Card
	public String getSuit()
	{
		return suit; 
	}
	//returns the number value of the Card
	public int getValue()
	{
		return value;
	}
	//toString to print Card to user
	public String toString()
	{
		String temp = ""; 
		
		if (suit.equalsIgnoreCase("Diamonds"))
			temp = "D"; 
		else if (suit.equalsIgnoreCase("Hearts"))
			temp = "H"; 
		else if (suit.equalsIgnoreCase("Spades"))
			temp = "S"; 
		else if (suit.equalsIgnoreCase("Clubs"))
			temp = "C"; 
		return face + temp; 
	}
}