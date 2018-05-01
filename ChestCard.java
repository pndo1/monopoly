
/**
 * ChestCard.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class ChestCard extends Card
{
    public ChestCard(int i)
    {
        super();
        super.setName("Community Chest");
        if(i==1){
            super.setDescription("Advance to Go (Collect $200)");
            super.setMove(0);
        }
        else if(i==2){
            super.setDescription("Bank error in your favor – Collect $200");
            super.setMoney(200);
        }
        else if(i==3){
            super.setDescription("You have won second prize in a beauty contest – Collect $10");
            super.setMoney(10);
        }
        else if(i==4){
            super.setDescription("Doctor's fees {fee} – Pay $50");
            super.setMoney(-50);
        }
        else if(i==5){
            super.setDescription("From sale of stock you get $50");
            super.setMoney(50);
        }
        else if(i==6){
            super.setDescription("You inherit $100");
            super.setMoney(100);
        }
        else if(i==7){
            super.setDescription("Holiday Fund matures - Receive $100 ");
            super.setMoney(100);
        }
        else if(i==8){
            super.setDescription("Income tax refund – Collect $20 ");
            super.setMoney(20);
        }
        else if(i==9){
            super.setDescription("Life insurance matures – Collect $100 ");
            super.setMoney(100);
        }
        else if(i==10){
            super.setDescription("Pay hospital fees of $100");
            super.setMoney(-100);
        }
        else if(i==11){
            super.setDescription("Pay school fees {tax} of $150");
            super.setMoney(-150);
        }
        else if(i==12){
            super.setDescription("Receive $25 consultancy fee ");
            super.setMoney(25);
        }

    }

}
