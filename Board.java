import java.util.ArrayList;
/**
 * Board.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Board
{
    private ArrayList<Box> board;
    public Board(){
        board=new ArrayList<Box>();
        board.add(new Box("White","Go","Go",200,0));
        board.add(new Box("Brown","Property","Mediterranean Avenue",60,1));
        board.add(new Box("White","Chest","Community Chest",0,2));
        board.add(new Box("Brown","Property","Baltic Avenue",60,3));
        board.add(new Box("White", "Tax","Income Tax", -200, 4));
        board.add(new Box("White", "Railroad", "Reading Railroad", 200, 5));
        board.add(new Box("Blue", "Property", "Oriential Avenue", 100, 6));
        board.add(new Box("White", "Chance", "Chance", 0, 7));
        board.add(new Box("Blue", "Property", "Vermont Avenue", 100, 8));
        board.add(new Box("Blue","Property", "Connecticut Avenue", 100, 9));
        board.add(new Box("White", "Jail", "Just Visiting", 0, 10));
        board.add(new Box("White", "Jail", "Jail", 0, -1)); //THIS IS JAIL - NOT A PHYSICAL SPOT ON THE BOARD
        board.add(new Box("Purple", "Property", "St.Charles Place", 140, 11));
        board.add(new Box("White", "Utility", "Electric Company", 150, 12));
        board.add(new Box("Purple", "Property", "States Avenue", 140, 13));
        board.add(new Box("Purple", "Property", "Virgina Avenue", 160, 14));
        board.add(new Box("White", "Railroad", "Pennsylvania Railroad", 200, 15));
        board.add(new Box("Orange", "Property", "St.James Place", 180, 16));
        board.add(new Box("White", "Chest", "Community Chest", 0, 17));
        board.add(new Box("Orange", "Property", "Tennessee Avenue", 180, 18));
        board.add(new Box("Orange", "Property", "New York Avenue", 200, 19));
        board.add(new Box("White", "Parking", "Free Parking", 0, 20));
        board.add(new Box("Red", "Property", "Kentucky Avenue", 220, 21));
        board.add(new Box("White", "Chance", "Chance", 0, 22));
        board.add(new Box("Red", "Property", "Indiana Avenue", 220, 23));
        board.add(new Box("Red", "Property", "Illinois Avenue", 240, 24));
        board.add(new Box("White", "Railroad", "B & O Railroad", 200, 25));
        board.add(new Box("Yellow","Property", "Atlantic Avenue", 260, 26));
        board.add(new Box("Yellow", "Property", "Ventnor Avenue", 260, 27));
        board.add(new Box("White", "Utility", "Water Works", 150, 28));
        board.add(new Box("Yellow", "Property", "Marvin Garden", 280, 29));
        board.add(new Box("White", "Jail", "GO TO JAIL", 0, 30));
        board.add(new Box("Green", "Property", "Pacific Avenue", 300, 31));
        board.add(new Box("Green", "Property", "North Carolina Avenue", 300, 32));
        board.add(new Box("White", "Chest", "Community Chest", 0, 33));
        board.add(new Box("Green", "Property", "Pennsylvania Avenue", 320, 34));
        board.add(new Box("White", "Railroad", "Short Line", 200, 35));
        board.add(new Box("White", "Chance", "Chance", 0, 36));
        board.add(new Box("Blue", "Property", "Park Place", 350, 37));
        board.add(new Box("White", "Tax", "Luxury Tax", -100, 38));
        board.add(new Box("Blue", "Property", "Boardwalk", 400, 39));
        
    }
    
    public ArrayList<Box> getBoard()
    {
        return board;
    }
    
    public void getSpot(int x)
    {
        System.out.println("You are on"+board.get(x).toString());
    }
    }
