
/**
 * Allows User to play Craps
 *
 * @author Thomas McConnell
 * @version 2020, Jan 14
 */

import java.util.Scanner;

public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Press <Enter> to play Craps(y/n): ");
        if (in.nextLine().equals("n"))
            System.out.println("Thank you for playing!");
        else
        {
            System.out.println("Do you need the rules of the game? (y/n)");
            if (in.nextLine().equals("y"))
            {
                System.out.println("You start by rolling two die. If you roll a 7 or 11 you win. A 2,3,12 is a loss. Any other, you keep rolling and record the first number you rolled. You keep rolling until you either roll a 7, in which scenario, you lose, or the same number you rolled originally, in which scenario you win.");
            }
            else
            {
                System.out.println(System.out.println("Press <Enter> to roll: ");
                in.nextLine();
                int die1 = die;
            }
        }
    }
}
