
/**
 * CarpetCost class calculates the total cost of the carpet for a room with inputed dimensions.
 *
 * @author Jordan Byrne
 * @version v1.1
 * @since 4/29/25
 */
public class CarpetCost
{
    private RoomSize size;
    private double costPerSqFt;

    /**
     * Constructor for objects of class CarpetCost. Assigns inputed variables
     * to size and cost per square foot.
     */
    public CarpetCost(RoomSize area, double cost)
    {
        size = new RoomSize(area);
        costPerSqFt = cost;
    }

    /**
     * Methpd calculates the total cost of the carpet depending on the inputed
     * size and cost per square foot of carpet.
     *
     * @return    the calculated final cost
     */
    public double getCost()
    {
        double cost = size.getArea() * costPerSqFt;
        return cost;
    }
    
    /**
     * CarpetCost toString is display information about the room and the cost.
     *
     * @return    String containing the RoomSize toString, the cost per foot, 
     *              and the total cost.
     */
    public String toString()
    {
        String str = size + 
                    String.format("\nCost per square foot: $%,.2f\nCost of the carpet: $%,.2f\n",costPerSqFt, getCost());
        return str;
    }
}
