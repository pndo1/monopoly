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
            players.add(new Player());
        }
        System.out.println("垄断");
        while(!win)
        {
            for(Player e: players)
            {
                int dice1=rollDice();
                int dice2=rollDice();
                e.move(dice1+dice2);
                System.out.println("You rolled a "+dice1+" and a "+dice2);
                board.getSpot(e.getLoc());
            }
            win=true;
            System.out.println("Player 1 won");
        }
    }

    
}