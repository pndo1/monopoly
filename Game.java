import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scan = new Scanner(System.in);
        System.out.print("How many players? ");
        int numPlayers = scan.nextInt();
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player());
        }
        System.out.println("Ready player 1");
    }


    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }
}