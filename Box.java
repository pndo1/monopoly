
/**
 * Boxes.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Box
{
    private String color;
    private String type;
    private String name;
    private int value;
    private int loc;
    private Card property; //For later use
    private int owned; 
    private int rent;
    private Player owner;
    public Box(String c, String t, String n, int v, int l, int r){
     color = c;
     type = t;
     name = n;
     value = v;
     loc = l;
     owned=0;
     rent=r;
    }
    
    public Box()
    {
        
    }
    
    public String getColor(){
        return color;
    }
    
    public String getType(){
        return type;
    }
    
    public String getName(){
        return name;
    }
    
    public int getValue(){
        return value;
    }
    
    public int getLoc(){
        return loc;
    }
    
    public String toString(){
        return "You are currently on "+ name+" which is the color "+ color+ " and costs " + value;
    }
    
    public void bought(int x)
    {
        owned=x;
    }
    
    public int owned()
    {
       return owned; 
    }

    public void setOwner(Player p){owner=p;}

    public Player getOwner(){ return owner;}
}