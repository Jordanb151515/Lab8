
/**
 * Write a description of class CarpetCost here.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 4/29/25
 */
public class CarpetCost
{
    // instance variables - replace the example below with your own
    private RoomSize size;
    private double costPerSqFt;

    /**
     * Constructor for objects of class CarpetCost
     */
    public CarpetCost(RoomSize area, double cost)
    {
        size = area;
        costPerSqFt = cost;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getCost()
    {
        double cost = size.getArea() * costPerSqFt;
        return cost;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        String str = String.format(size + 
                    "\nCost per square foot: $,.2f",costPerSqFt +
                    "\nCost of the carpet: $,.2f",getCost());
        return str;
    }
}
