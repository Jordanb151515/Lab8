import java.util.Scanner;

/**
 * This application takes information from the user about the size and cost for
 * a room and then displays the final size and total cost for the carpet.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 4/29/25
 */
public class CarpetCostDemo
{
    public static void main(String[] args){
        double length, width, cost;
        String name;
        
        //get info about room 1
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Room Name: ");
        name = keyboard.nextLine();
        System.out.print("Enter room length: ");
        length = keyboard.nextDouble();
        System.out.print("Enter room width: ");
        width = keyboard.nextDouble();
        System.out.print("Enter cost per square foot: ");
        cost = keyboard.nextDouble();
        
        //create room 1 objects
        RoomSize temp = new RoomSize(name, length, width);
        CarpetCost room1 = new CarpetCost(temp, cost);
        
        //display room 1 information to console
        System.out.println(room1);
        String var = keyboard.nextLine();
        
        //get info about room 2
        System.out.print("Enter Room Name: ");
        name = keyboard.nextLine();
        System.out.print("Enter room length: ");
        length = keyboard.nextDouble();
        System.out.print("Enter room width: ");
        width = keyboard.nextDouble();
        System.out.print("Enter cost per square foot: ");
        cost = keyboard.nextDouble();
        
        //create room 2 object
        CarpetCost room2 = new CarpetCost(new RoomSize(name,length, width), cost);
        
        //display room 2 information to the console
        System.out.println(room2);
        var = keyboard.nextLine();
    
    }
}
