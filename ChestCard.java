
/**
 * ChestCard.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * This class gives discriptions and actions to community chest cards in Monopoly.
 * It is a subclass of card.
 *
 */
public class ChestCard extends Card
{
    private String description;
    private String name;
    private int money;
    private int move; 
    /** 
     * The method below ina constructor for the class ChestCard.
     * It calls the class setDescription method from the card 
     * and gives instruction for when the card is used. 
     * it also calls the required methods to do the instructions 
     * provided by the card. 
     * @param: int i the number of the card that needs to be called
     */
    public ChestCard(int i)
    {
        setName("Community Chest");
        if(i==1){
            setDescription("Advance to Go (Collect $200)");
            setMove(0);
        }
        else if(i==2){
            setDescription("Bank error in your favor – Collect $200");
            setMoney(200);
        }
        else if(i==3){
            setDescription("You have won second prize in a beauty contest – Collect $10");
            setMoney(10);
        }
        else if(i==4){
            setDescription("Doctor's fees {fee} – Pay $50");
            setMoney(-50);
        }
        else if(i==5){
            setDescription("From sale of stock you get $50");
            setMoney(50);
        }
        else if(i==6){
            setDescription("You inherit $100");
            setMoney(100);
        }
        else if(i==7){
            setDescription("Holiday Fund matures - Receive $100 ");
            setMoney(100);
        }
        else if(i==8){
            setDescription("Income tax refund – Collect $20 ");
            setMoney(20);
        }
        else if(i==9){
            setDescription("Life insurance matures – Collect $100 ");
            setMoney(100);
        }
        else if(i==10){
            setDescription("Pay hospital fees of $100");
            setMoney(-100);
        }
        else if(i==11){
            setDescription("Pay school fees {tax} of $150");
            setMoney(-150);
        }
        else if(i==12){
            setDescription("Receive $25 consultancy fee ");
            setMoney(25);
        }

    }

    /**
     * Returns the ammount of money the Card either gives or a negative value 
     * if it takes away.
     * @ return int money
     * @ Author Ashwin Srinivasan 
     */
    public int getMoney()
    {
        return super.getMoney();
    }

    /**
     * Allows the other classes to set the ammount of money the card is going 
     * to add or take away.
     * @param int m ammount money is being set too
     * @ Author Ashwin Srinivasan
     */
    public void setMoney(int m)
    {
        super.setMoney(m);
    }

    /**
     * Returns the space that the Card moves the player too
     * @return int move
     * @Author Ashwin Srinivasan
     */
    public int getMove()
    {
        return super.getMove();
    }

    /**
     * Sets the move value to the value it needs to be for that specific card
     * @param int m the location that the player will be moved to
     * @Author Ashwin Srinivasan
     */
    public void setMove(int m)
    {
        super.setMove(m);
    }

    /**
     * Returns the description of the Card
     * @Return string Description
     * @Author Ashwin Srinivasan
     */
    public String getDescription()
    {
        return super.getDescription();
    }

    /**
     * Sets the description of the card to the imput value 
     * @ param String d 
     * @ author Ashwin Srinivasan
     */
    public void setDescription(String d)
    {
        super.setDescription(d);
    }

    /**
     * returns the name of the Card, either a chance or a chest Card. 
     * @ return String name, either chance or community chest
     * @  author Ashwin Srinivasan
     */
    public String getName()
    {
        return super.getName();
    }

    /**
     * Sets the name of the Card to the imputed value
     * @ preconditon is either Chance Card or Community Chest Card
     * @ param String n, the name of the Card
     * @ author Ashwin Srinivasan
     */
    public void setName(String n)
    {
        super.setName(n);
    }
}