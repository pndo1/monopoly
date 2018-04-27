
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

        
    /**
     * Returns the ammount of money the Card either gives or a negative value 
     * if it takes away.
     * @ return int money
     * @ Author Ashwin Srinivasan 
     */
    public int getMoney()
    {
        return money;
    }
    
    /**
     * Allows the other classes to set the ammount of money the card is going 
     * to add or take away.
     * @param int m ammount money is being set too
     * @ Author Ashwin Srinivasan
     */
    public void setMoney(int m)
    {
        money=m;
    }

    /**
     * Returns the space that the Card moves the player too
     * @return int move
     * @Author Ashwin Srinivasan
     */
    public int getMove()
    {
        return move;
    }
    
    /**
     * Sets the move value to the value it needs to be for that specific card
     * @param int m the location that the player will be moved to
     * @Author Ashwin Srinivasan
     */
    public void setMove(int m)
    {
        move=m;
    }
    
    /**
     * Returns the description of the Card
     * @Return string Description
     * @Author Ashwin Srinivasan
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Sets the description of the card to the imput value 
     * @ param String d 
     * @ author Ashwin Srinivasan
     */
    public void setDescription(String d)
    {
        description=d;
    }

    /**
     * returns the name of the Card, either a chance or a chest Card. 
     * @ return String name, either chance or community chest
     * @  author Ashwin Srinivasan
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Sets the name of the Card to the imputed value
     * @ preconditon is either Chance Card or Community Chest Card
     * @ param String n, the name of the Card
     * @ author Ashwin Srinivasan
     */
    public void setName(String n)
    {
        name=n;
    }
}
