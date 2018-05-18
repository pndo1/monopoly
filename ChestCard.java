
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
        super.setName("Community Chest");
        if(i==1){
            description="Advance to Go (Collect $200)";
            super.setMove(0);
        }
        else if(i==2){
            description="Bank error in your favor – Collect $200";
            super.setMoney(200);
        }
        else if(i==3){
            description="You have won second prize in a beauty contest – Collect $10";
            super.setMoney(10);
        }
        else if(i==4){
            description="Doctor's fees {fee} – Pay $50";
            super.setMoney(-50);
        }
        else if(i==5){
            description="From sale of stock you get $50";
            super.setMoney(50);
        }
        else if(i==6){
            description="You inherit $100";
            super.setMoney(100);
        }
        else if(i==7){
            description="Holiday Fund matures - Receive $100 ";
            super.setMoney(100);
        }
        else if(i==8){
            description="Income tax refund – Collect $20 ";
            super.setMoney(20);
        }
        else if(i==9){
            description="Life insurance matures – Collect $100 ";
            super.setMoney(100);
        }
        else if(i==10){
            description="Pay hospital fees of $100";
            super.setMoney(-100);
        }
        else if(i==11){
            description="Pay school fees {tax} of $150";
            super.setMoney(-150);
        }
        else if(i==12){
            description="Receive $25 consultancy fee ";
            super.setMoney(25);
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