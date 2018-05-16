
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

    private String action;
    public ChanceCard(int i){
        setName("Chance card");

        if(i==1){
            setDescription("ADVANCE TO GO(collect $200)");
            setMove(0);
        }
        else if(i==2){
            setDescription("ADVANCE TO BOARDWALK");
            setMove(39);
        }
        else if(i==3){
            setDescription("ADVANCE TO ST. CHARLES PLACE. If you pass go, collect $200");
            setMove(11);
        }
        else if(i==4){
            super.setDescription("BANK PAYS YOU DIVIDEND OF $50");
            super.setMoney(50);
        }
        else if(i==5){
            super.setDescription("HOSPITAL FEES PAY $100");
            super.setMoney(-100);
        }
        else if(i==6){
            super.setDescription("MAKE GENERAL REPAIRS ON ALL YOUR PROPERTY. PAY $150");
            super.setMoney(-150);
        }
        else if(i==7){

            super.setDescription("YOUR BUILDING LOAN MATURES.\nCOLLECT $150");
            super.setMoney(150);
        }
        else if(i==8){
            super.setDescription("YOU HAVE WON SECOND PRIZE IN A BEAUTY CONTEST.\nCOLLECT $50 ");
            super.setMoney(50);

        }
        else if(i==9){
            super.setDescription("GO TO JAIL.\nGO DIRECTLY TO JAIL.\nDON'T PASS GO AND DON'T COLLECT $200");
            super.setMove(-1);
        }
        else if(i==10){
            super.setDescription("PAY SCHOOL FEES OF $150");
            super.setMoney(-150);
        }
        else if(i==11){
            super.setDescription("TAKE A TRIP TO READING RAILROAD  – If you pass Go, collect $200");
            super.setMove(5);
        }
        else if(i==12){
            super.setDescription("YOU HAVE WON A CROSSWORD COMPETITION- COLLECT $100");
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