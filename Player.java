import java.util.ArrayList;
/**
 * Player.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Player
{
    private int money;
    private ArrayList<Card> hand;
    private ArrayList<PropertyCard> propertyCards;
    private int loc;
    private boolean turn=false;
    private boolean inJail=false;
    public Player(int m)
    {
        money=m;
        hand=new ArrayList<Card>();
        propertyCards=new ArrayList<PropertyCard>();
        loc=0;
    }
}