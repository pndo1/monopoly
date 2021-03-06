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
    private ArrayList<Box> properties;
    private int loc;
    private boolean turn=false;
    private static int numPlayers;
    private int playerNum;
    private String name;
    public Player(int n, String na)
    {
        money=1500;
        properties=new ArrayList<Box>();
        loc=0;
        numPlayers++;
        playerNum=n;
        name=na;

    }

    public static int getNumPlayers()
    {
        return numPlayers; 
    }

    public void setPlayerMoney(int m){
        money =m;
    }

    public void pay(int m)
    {
        money-=m;
    }

    public void earnMoney(int m){
        money += m;   
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

    public void buyPropertyCard(Box prop) {
        properties.add(prop);
        prop.setOwner(this);
    }

    public boolean bankrupt()
    {
        if(money<0){
            return true;
        }
        return false;
    }

    public int getLoc()
    {
        return loc;
    }

    public int getPlayerNum()
    {
        return playerNum;
    }

    public void setLoc(int x){
        loc = x;
    }

    public String getName(){ return name;}
}

