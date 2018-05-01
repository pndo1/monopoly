
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
        super();
        super.setName("Chance card");


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
        else if(i==19){
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
}

