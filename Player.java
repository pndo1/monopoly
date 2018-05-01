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
    private static int numPlayers;
    public Player()
    {
        money=1500;
        hand=new ArrayList<Card>();
        propertyCards=new ArrayList<PropertyCard>();
        loc=0;
        numPlayers++;
    }
    
    public static int getNumPlayers()
    {
       return numPlayers; 
    }
    
    public void setPlayerMoney(int m){
        money =m;
    }
    
    public int getPlayerMoney(){
        return money; 
    }
    
    public void change(Card c)
    {
        money+=c.getMoney();
        loc=c.getMove();
    }
    
    public void move(int m)
    {
        loc+=m;
    }

    public void buyPropertyCard(PropertyCard pc) {
        money-=pc.getMoney();
        propertyCards.add(pc);
    }

    }


