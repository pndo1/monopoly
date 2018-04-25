
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
    public ChestCard()
    {
        super();
        super.setName("Community Chest");
        for(int i=0;i<16;i++)
        {
            if(i==0){
                super.setDescription("Advance to Go (Collect $200)");
                super.setMove(0);
            }
            else if(i==1){
                super.setDescription("Bank error in your favor – Collect $200");
                super.setMoney(200);
            }
            else if(i==2){
                super.setDescription("You have won second prize in a beauty contest – Collect $10");
                super.setMoney(10);
            }
            else if(i==3){
                super.setDescription("Doctor's fees {fee} – Pay $50");
                super.setMoney(-50);
            }
            else if(i==4){
                super.setDescription("From sale of stock you get $50");
                super.setMoney(50);
            }
            else if(i==5){
                super.setDescription("Get Out of Jail Free ");
            }
            else if(i==6){
                super.setDescription("Go to Jail – Go directly to jail – Do not pass Go – Do not collect $200 ");
                super.setMove(30);
            }
            else if(i==7){
                super.setDescription("Grand Opera Night {Opening} – Collect $50 from every player for opening night seats");
                
            }
            else if(i==8){
                super.setDescription("You inherit $100");
            }
            else if(i==9){
                super.setDescription("Holiday {Xmas} Fund matures - Receive {Collect} $100 ");
            }
            else if(i==10){
                super.setDescription("Income tax refund – Collect $20 ");
            }
            else if(i==11){
                super.setDescription("Life insurance matures – Collect $100 ");
            }
            else if(i==12){
                super.setDescription("Pay hospital fees of $100 {Pay hospital $100");
            }
            else if(i==13){
                super.setDescription("Pay school fees {tax} of $150");
            }
            else if(i==14){
                super.setDescription("Receive $25 consultancy fee {Receive for services $25} ");
            }
            else if(i==15){
                super.setDescription("You are assessed for street repairs – $40 per house – $115 per hotel ");
            }   
        }
    }

}
