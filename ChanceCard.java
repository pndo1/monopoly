
/**
 * ChanceCard.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class ChanceCard extends Card
{

    private String action;
    public ChanceCard(int i){
        super();      
        super.setName("Chance");
        if(i==1){
            super.setDescription("ADVANCE TO GO(collect $200)");
            super.setMove(0);
        }
        else if(i==2){
            super.setDescription("ADVANCE TO BOARDWALK");
            super.setMove(39);
        }
        else if(i==3){
            super.setDescription("ADVANCE TO ST. CHARLES PLACE. If you pass go, collect $200");
            super.setMove(11);
        }
        else if(i==4){
            super.setDescription("BANK PAYS YOU DIVIDEND OF $50");
            super.setMoney(super.getMoney()+50);
        }
        else if(i==5){
            super.setDescription("YOU HAVE BEEN ELECTED CHAIRMAN OF THE BOARD. PAY EACH PLAYER $50. ");          
        }
        else if(i==6){
            super.setDescription("HOSPITAL FEES PAY $100");
        }
        else if(i==7){
            super.setDescription("YOUR BUILDING LOAN MATURES.\nCOLLECT $150");
        }
        else if(i==8){
            super.setDescription("YOU HAVE WON SECOND PRIZE IN A BEAUTY CONTEST.\nCOLLECT $50 ");
        }
        else if(i==9){
            super.setDescription("PAY SCHOOL FEES OF $150");
        }
        else if(i==10){
            super.setDescription("TAKE A TRIP TO READING RAILROAD  – If you pass Go, collect $200");
        }
        else if(i==11){
            super.setDescription("YOU HAVE WON A CROSSWORD COMPETITION- COLLECT $100");
        }
    }       
}

