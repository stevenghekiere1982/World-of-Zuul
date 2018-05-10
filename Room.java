/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
import java.util.HashMap;
public class Room 
{
    public String description;
    private HashMap <String, Room> exits;
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
    }

    
    /**
     * retourneer de ruimte die we betreden als we van deze 
     * ruimte in de richting “direction” gaan. Retourneer null
     * als er in die richting geen ruimte is.
     */
    public Room getExit(String direction)
    {
        Room exit= null;
        exit = exits.get(direction);
        return exit;
    }

    /** 
    * Definieer een uitgang in deze ruimte.
    * @ param direction De richting van de uitgang
    * @ param neighbour De ruimte in die richting
    */
    public void setExits(String direction, Room neighbour)
    {
        exits.put(direction, neighbour);
    }

  

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
