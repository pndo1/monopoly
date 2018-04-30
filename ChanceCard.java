
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
        if(i==1){
            super.setDescription("GET OUT OF JAIL CARD  this card may be kept until needed or sold");
        }
        else if(i==2){
            super.setDescription("GO BACK THREE SPACES");
            super.setMove(super.getMove()-3);
        }
        else if(i==3){
            super.setDescription("ADVANCE TO GO(collect $200)");
            super.setMove(0);
        }
        else if(i==4){
            super.setDescription("ADVANCE TO BOARDWALK");
            super.setMove(39);
        }
        else if(i==5){
            super.setDescription("ADVANCE TO ST. CHARLES PLACE. If you pass go, collect $200");
            super.setMove(11);
        }
        else if(i==6){
            super.setDescription("BANK PAYS YOU DIVIDEND OF $50");
            super.setMoney(super.getMoney()+50);
        }
        else if(i==7){
            super.setDescription("YOU HAVE BEEN ELECTED CHAIRMAN OF THE BOARD. PAY EACH PLAYER $50. ");
            Player play =new Player();
            play.setPlayerMoney(play.getPlayerMoney()+ 50);
            super.setMoney(super.getMoney()-(play.getNumPlayers()*50));
        }
        else if(i==8){
            super.setDescription("HOSPITAL FEES PAY $100");
            super.setMoney(super.getMoney()-100);
        }
        else if(i==9){
            super.setDescription("MAKE GENERAL REPAIRS ON ALL YOUR PROPERTY. PAY $150");
            super.setMoney(super.getMoney()-150);
        }
        else if(i==10){
            super.setDescription("YOUR BUILDING LOAN MATURES.\nCOLLECT $150");
            super.setMoney(super.getMoney()+150);
        }
        else if(i==11){
            super.setDescription("YOU HAVE WON SECOND PRIZE IN A BEAUTY CONTEST.\nCOLLECT $50 ");
            super.setMoney(super.getMoney()+50);
        }
        else if(i==12){
            super.setDescription("GO TO JAIL.\nGO DIRECTLY TO JAIL.\nDON'T PASS GO AND DON'T COLLECT $200");
            super.setMove(-1);
        }
        else if(i==13){
            super.setDescription("PAY SCHOOL FEES OF $150");
            super.setMoney(super.getMoney()-150);
        }
        else if(i==14){
            super.setDescription("TAKE A TRIP TO READING RAILROAD  – If you pass Go, collect $200");
            super.setMove(5);
        }
        else if(i==15){
            super.setDescription("ADVANCE TO THE NEAREST UTILITY");
        }
        else if(i==16){
            super.setDescription("YOU HAVE WON A CROSSWORD COMPETITION- COLLECT $100");
        }

    }       
}

