
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
    public ChanceCard(){
        super();
        int i=(int)(Math.random()*16+1);
        if(i==1){
           super.setDescription("GET OUT OF JAIL CARD  this card may be kept until needed or sold");
        }
        else if(i==2){
            super.setDescription("GO BACK THREE SPACES");
        }
        else if(i==2){
            action="ADVANCE TO GO(collect $200)";
        }
        else if(i==2){
            action="ADVANCE TO BOARDWALK";
        }
        else if(i==2){
            action="ADVANCE TO ST. CHARLES PLACE. If you pass go, collect $200";
        }
        else if(i==2){
            action="BANK PAYS YOU DIVIDEND OF $50";
        }
        else if(i==2){
            action="YOU HAVE BEEN ELECTED CHAIRMAN OF THE BOARD. PAY EACH PLAYER $50. ";
        }
        else if(i==2){
            action="HOSPITAL FEES PAY $100";
        }
        else if(i==2){
            action="MAKE GENERAL REPAIRS ON ALL YOUR PROPERTY. \nFor each house pay $25 ";
        }
        else if(i==2){
            action="GO BACK THREE SPACES";
        }
        else if(i==2){
            action="GO BACK THREE SPACES";
        }
        else if(i==2){
            action="GO BACK THREE SPACES";
        }
        else if(i==2){
            action="GO BACK THREE SPACES";
        }
        else if(i==2){
            action="GO BACK THREE SPACES";
        }
        else if(i==2){
            action="GO BACK THREE SPACES";
        }
        else if(i==2){
            action="GO BACK THREE SPACES";
        }
        
        
            
       
    }
}
