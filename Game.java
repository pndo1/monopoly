import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static void main(String[] args) {
        Board board = new Board();
        boolean win = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many players? ");
        int numPlayers = scan.nextInt();
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter player "+(i+1)+"'s name: ");
            String playerName = scan.next();
            players.add(new Player(i, playerName)); //Creates Player list
        }
        while (!win) {
            for (Player e : players) {
                System.out.println();
                System.out.println(e.getName() + " is playing.");
                int dice1 = rollDice();
                int dice2 = rollDice();
                boolean turn=true;
                System.out.println("You rolled a " + dice1 + " and a " + dice2); //Moves the player
                while(turn)
                {
                    if (e.getLoc() > 40) {
                        e.earnMoney(200);
                        int x = e.getLoc() - board.getBoard().size();
                        e.setLoc(x); //Checks to see if the player has gone over the board size 
                    } else if (board.getSpot(e.getLoc()).getName().equals("Jail")) {
                        if (dice1 != dice2) {
                            System.out.println("You're in jail and you didn't roll doubles, try again.");
                        } else if (dice1 == dice2) {
                            System.out.println("You rolled doubles! You're out of jail.");
                            e.move(dice1 + dice2);
                            board.printSpot(e.getLoc());

                        }
                    } else {
                        e.move(dice1 + dice2);
                        board.printSpot(e.getLoc());

                    }

                    String propType = board.getSpot(e.getLoc()).getType();
                    if (propType.equals("Property") || propType.equals("Railroad") || propType.equals("Utility")) { //Checks if type is property
                        if (board.getSpot(e.getLoc()).owned() == 0) //Checks if property is available
                        {

                            if (board.checkProperty(e.getLoc()) == 1) {
                                System.out.println("You have $" + e.getPlayerMoney() + ".");
                                if (e.getPlayerMoney() >= board.getSpot(e.getLoc()).getValue()) {
                                    System.out.println("You have enough money to buy the property. Buy? [yes/no]");
                                    String buyAsk = scan.next();
                                    while (!buyAsk.equals("yes") && !buyAsk.equals("no")) {
                                        System.out.println("This was an invalid response. Please try again.");
                                        System.out.println("You have enough money to buy the property. Buy? [yes/no]");
                                        buyAsk = scan.next();
                                    }

                                    if (buyAsk.equals("yes") || buyAsk.equals("Yes")) {
                                        e.pay(board.getSpot(e.getLoc()).getValue());
                                        System.out.println("You now have " + e.getPlayerMoney() + " dollars.");
                                        board.getSpot(e.getLoc()).bought(1);
                                        e.buyPropertyCard(board.getSpot(e.getLoc()));
                                    }

                                } else
                                    System.out.println("You don't have enough money to buy this property.");

                            }
                        } else {
                            System.out.println("You landed on a property owned by: " + board.getSpot(e.getLoc()).getOwner().getName());
                            int pay = board.getSpot(e.getLoc()).getRent();
                            e.pay(pay);
                            board.getSpot(e.getLoc()).getOwner().earnMoney(pay);
                            System.out.println("You have to pay " + board.getSpot(e.getLoc()).getOwner().getName() + " " + board.getSpot(e.getLoc()).getRent() + " dollars.");
                            System.out.println("You now have " + e.getPlayerMoney() + " dollars.");

                        }

                    } else if (board.getSpot(e.getLoc()).getName().equals("GO TO JAIL")) {
                        e.setLoc(41);
                    } else if (board.getSpot(e.getLoc()).getName().equals("Just Visiting")) {
                        System.out.println("You are just visiting jail.");
                    } else if (board.getSpot(e.getLoc()).getType().equals("Tax")) {
                        System.out.println("You are being charged a " + board.getSpot(e.getLoc()).getName() +
                            " of " + board.getSpot(e.getLoc()).getValue());

                    e.pay(board.getSpot(e.getLoc()).getValue());
                    System.out.println("You now have " + e.getPlayerMoney() + " dollars.");
                } else if (board.getSpot(e.getLoc()).getType().equals("Chance")) {
                    int random = ((int) Math.random() * 11);
                    ChanceCard chance = new ChanceCard(random);
                    System.out.println("You landed on a Chance spot! Your chance is:");
                    System.out.println(chance.getDescription());
                    if (random == 1 || random == 2 || random == 3 || random == 9 || random == 11) {
                       //finish this is the chance loc if statement

                        e.pay(board.getSpot(e.getLoc()).getValue());
                        System.out.println("You now have " + e.getPlayerMoney() + " dollars.");
                    } else if (board.getSpot(e.getLoc()).getType().equals("Chance")) {
                        int random = ((int) Math.random() * 11);
                        ChanceCard chance = new ChanceCard(random);
                        System.out.println("You landed on a Chance spot! Your card is:");
                        System.out.println(chance.getDescription());
                        if(chance.getMoney()!=0)
                        {
                            e.earnMoney(chance.getMoney());
                            System.out.println("You now have "+e.getPlayerMoney()+" dollars");
                        }

                        if(chance.getMove()!= 0){
                            e.setLoc(chance.getMove());
                            System.out.println("You are now on " + board.getSpot(e.getLoc()).getName());
                        }

                    }
                    
                    else if (board.getSpot(e.getLoc()).getType().equals("Chest")) {
                        int random = ((int) Math.random() * 11);
                        ChestCard chest = new ChestCard(random);
                        System.out.println("You landed on a Community Chest spot! Your card is:");
                        System.out.println(chest.getDescription());
                        if(chest.getMoney()!=0)
                        {
                            e.earnMoney(chest.getMoney());
                            System.out.println("You now have "+e.getPlayerMoney()+" dollars");
                        }

                        if(chest.getMove()!= 0){
                            e.setLoc(chest.getMove());
                            System.out.println("You are now on " + board.getSpot(e.getLoc()).getName());
                        }


                    }

                    if(dice1!=dice2)
                    {
                        turn=false;
                    }
                    if (e.bankrupt()) {
                        turn=false;
                        players.remove(e);
                    }
                }
                if (players.size() == 1) {
                    win = true;
                    System.out.println("Player " + players.get(0).getPlayerNum() + "  won");
                }
                

            }
        }

    }
}