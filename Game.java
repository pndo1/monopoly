import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static void main(String[] args) {
        Board board = new Board();
        boolean win=false;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many players? ");
        int numPlayers = scan.nextInt();
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter player's name: ");
            String playerName=scan.next();
            players.add(new Player(i,playerName)); //Creates Player list
        }
        System.out.println("Ready Player 1");
        while(!win)
        {
            for(Player e: players)
            {                
                int dice1=rollDice();
                int dice2=rollDice();
                e.move(dice1+dice2);
                System.out.println("You rolled a "+dice1+" and a "+dice2); //Moves the player

                if(e.getLoc() >= 40){
                    int x = 0;
                    e.earnMoney(200);
                    x = e.getLoc() - board.getBoard().size();
                    e.setLoc(x); //Checks to see if the player has gone over the board size 
                }

                if(board.getSpot(e.getLoc()).getLoc()==-1)
                {
                    e.move(1); //Makes sure player isn't on jail while traversing the board
                }
                board.printSpot(e.getLoc()); 
                if(board.getSpot(e.getLoc()).getType().equals("Property")){ //Checks if type is property
                    if(board.getSpot(e.getLoc()).owned()==0) //Checks if property is aviliable
                    {

                        if(board.checkProperty(e.getLoc())==1)
                        {
                            System.out.println("You have $"+e.getPlayerMoney()+".");
                            System.out.println("What do you want to do? (Buy,Pass)");
                            String buyAsk=scan.next();
                            if(buyAsk.equals("Buy")||buyAsk.equals("buy")) {
                                board.getSpot(e.getLoc()).bought(1);

                            }

                        }
                    }
                    else
                    {
                        int pay=board.getSpot(e.getLoc()).getValue();
                        e.pay(pay);
                    }
                }
                
                else if(board.getSpot(e.getLoc()).getName().equals("GO TO JAIL")){
                    e.setLoc(-1);
                }
                
                else if(board.getSpot(e.getLoc()).getType().equals("Railroad")){
                    
                }
                else if(board.getSpot(e.getLoc()).getType().equals("")){}
            
                if(e.bankrupt())
                {
                    players.remove(e);
                }
            }
            if(players.size()==1)
            {
                win=true;
                System.out.println("Player "+players.get(0).getPlayerNum()+"  won");
            }

        }
    }

}