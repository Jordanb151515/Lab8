
/**
 * RoomSize takes the dimensions for the room and it calculates the area.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 4/29/25
 */
public class RoomSize
{
    private String name;
    private double length;
    private double width;

    /**
     * Constructor for objects of class RoomSize. Assigns inputed values to name, length, and width.
     */
    public RoomSize(String inName, double inLen, double inWidth)
    {
        name = inName;
        length = inLen;
        width = inWidth;
    }
    
    /**
     * Copy Constructor for objects of class RoomSize to prevent security holes.
     */
    public RoomSize(RoomSize object2)
    {
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }

    /**
     * Calcultes the area of the room based on the length and width.
     *
     * @return    the calculated area
     */
    public double getArea()
    {
        return length*width;
    }
    
    /**
     * RoomSize toString method that displays information about the size of the room.
     *
     * @return    String including the name, length, width, and area of the room.
     */
    public String toString()
    {
        String str = "\nName: " + name +
                     "\nLength: " + length +
                     "\nWidth: " + width +
                     "\nArea: " + getArea();
        return str;
    }
}
