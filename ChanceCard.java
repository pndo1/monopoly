
/**
 * ChanceCard.java  
 *
 * @author:Pradnya Wani 
 * Assignment #:
 * 
 * Brief Program Description:
 * This class makes Chace cards and has setters and getters so that they can be accessed.
 * It also has a actions for every card,a nd calls methods from the superClass to make required 
 * changes
 * @param:int i
 * @return: none
 */
public class ChanceCard extends Card
{
    private String description;
    public ChanceCard(int i){
        super.setName("Chance card");        
        if(i==1){
            description="ADVANCE TO GO(collect $200)";
            super.setMove(0);
        }
        else if(i==2){
            description="ADVANCE TO BOARDWALK";
            super.setMove(39);
        }
        else if(i==3){
            description="ADVANCE TO ST. CHARLES PLACE. If you pass go, collect $200";
            super.setMove(11);
        }
        else if(i==4){
            description="BANK PAYS YOU DIVIDEND OF $50";
            super.setMoney(50);
        }
        else if(i==5){
            description="HOSPITAL FEES PAY $100";
            super.setMoney(-100);
        }
        else if(i==6){
            description="MAKE GENERAL REPAIRS ON ALL YOUR PROPERTY. PAY $150";
            super.setMoney(-150);
        }
        else if(i==7){

            description="YOUR BUILDING LOAN MATURES.\nCOLLECT $150";
            super.setMoney(150);
        }
        else if(i==8){
            description="YOU HAVE WON SECOND PRIZE IN A BEAUTY CONTEST.\nCOLLECT $50 ";
            super.setMoney(50);

        }
        else if(i==9){
            description="GO TO JAIL.\nGO DIRECTLY TO JAIL.\nDON'T PASS GO AND DON'T COLLECT $200";
            super.setMove(41);
        }
        else if(i==10){
            description="PAY SCHOOL FEES OF $150";
            super.setMoney(-150);
        }
        else if(i==11){
            description="TAKE A TRIP TO READING RAILROAD  – If you pass Go, collect $200";
            super.setMove(5);
        }
        else if(i==12){
            description="YOU HAVE WON A CROSSWORD COMPETITION- COLLECT $100";
            super.setMoney(100);
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