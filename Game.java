import java.util.ArrayList;
import java.util.Scanner;
public class Game
{
    public static void main(String [] args)
    {
        Board board=new Board();
        Scanner scan=new Scanner(System.in);
        System.out.print("How many players? ");
        int numPlayers=scan.nextInt();
        ArrayList<Player> players=new ArrayList<Player>();
        for(int i=0;i<numPlayers;i++) {
            players.add(new Player());
        }
        for(int i=0;i<11;i++) {
            System.out.println(rollDice());
        }
    }


public static int rollDice() {
    return (int)(Math.random()*6+1);
}
}