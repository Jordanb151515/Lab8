
/**
 * Write a description of class RoomSize here.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 4/29/25
 */
public class RoomSize
{
    // instance variables - replace the example below with your own
    private String name;
    private double length;
    private double width;

    /**
     * Constructor for objects of class RoomSize
     */
    public RoomSize(String inName, double inLen, double inWidth)
    {
        name = inName;
        length = inLen;
        width = inWidth;
    }
    
    /**
     * Constructor for objects of class RoomSize
     */
    public RoomSize(RoomSize object2)
    {
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getArea()
    {
        return length*width;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        String str = "Name: " + name +
                     "\nLength: " + length +
                     "\nWidth: " + width;
        return str;
    }
}
