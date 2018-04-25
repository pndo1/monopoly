
/**
 * Card.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Card
{
    private String description;
    private String name;
    private int money;
    private int move; 
    /**
     * the constructor is created so the subclasses can acsess the constructer
     * @param:none 
     * @return:none 
     */
    public Card()
    {
        description= null; 
        name= null;
        money= 0;
        move=0;
    }

    public int getMoney()
    {
        return money;
    }
    
    public void setMoney(int m)
    {
        money=m;
    }

    public int getMove()
    {
        return move;

    }
    
    public void setMove(int m)
    {
        move=m;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String d)
    {
        description=d;
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name=n;
    }
}
