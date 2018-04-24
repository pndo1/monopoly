
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
public class Boxes
{
    private String color;
    private String type;
    private String name;
    private int value;
    private int loc;
    private Card property; //For later use
    
    public Boxes(String c, String t, String n, int v, int l){
     color = c;
     type = t;
     name = n;
     value = v;
     loc = l;
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

}