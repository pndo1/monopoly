import java.util.ArrayList;
/**
 * Deck.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Deck
{
    private ArrayList<Card> chanceDeck;
    //private ArrayList<Card> chanceDeck;
    public Deck()
    {
        chanceDeck= new ArrayList<Card>();
        for( int i=0;i<15;i++)
        {
           Card c1=new ChestCard(i);
        }
    }
}
