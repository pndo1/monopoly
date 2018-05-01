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
    private ArrayList<Card> chestDeck;
    private ArrayList<Card> chanceDeck;
    public Deck()
    {
        chestDeck= new ArrayList<Card>();
        chanceDeck=new ArrayList<Card>();
        for( int i=0;i<14;i++)
        {
           Card c1=new ChestCard(i);
           chestDeck.add(c1);
        }
        for( int i=0;i<14;i++)
        {
           Card c1=new ChestCard(i);
           chanceDeck.add(c1);
        }
        shuffleDeck();
    }
    
    public Card chestDealCard()
    {
        return chestDeck.remove(0);
    }
    
    public Card chanceDealCard()
    {
        return chanceDeck.remove(0);
    }
    
    public void shuffleDeck()
    {
        for(int x=0;x<chestDeck.size();x++)
        {
            int place=(int)(Math.random()*51);
            Card thing1=chestDeck.remove(x);
            Card thing2=chestDeck.remove(place);
            chestDeck.add(place,thing1);
            chestDeck.add(x,thing2);
        }
        for(int x=0;x<chanceDeck.size();x++)
        {
            int place=(int)(Math.random()*51);
            Card thing1= chanceDeck.remove(x);
            Card thing2= chanceDeck.remove(place);
            chanceDeck.add(place,thing1);
            chanceDeck.add(x,thing2);
        }
    }
}
