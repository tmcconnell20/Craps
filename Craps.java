
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
        boolean playing = true; //games ends when false
        String pause = ""; //in.nextLine for playing
        String rules = ""; //in.nextLine for rules
        int startedplaying = 0; //checks play again or play for first time
        while(playing)
        {
            if (startedplaying == 0)
            {
                System.out.println("Would you like to play Craps(y/N)? ");
                pause = in.nextLine();
            }
            else
            {
                System.out.println("Would you like to play again (y/N)? ");
                pause = in.nextLine();
            }
            if (pause.equals("") || pause.substring(0,1).equalsIgnoreCase("n"))
            {    
                playing = false; //if no, end game
            }
            else
            {
                startedplaying = 1; //next game is not first time playing
                System.out.println("Do you need the rules of the game? (Y/n)");
                rules = in.nextLine();
                if (rules.equals("") || rules.substring(0,1).equalsIgnoreCase("y"))
                {
                    System.out.println("You start by rolling two die. If you roll a 7 or 11 you win. A 2,3,12 is a loss. Any other, you keep rolling and record the first number you rolled. You keep rolling until you either roll a 7, in which scenario, you lose, or the same number you rolled originally, in which scenario you win.");
                }
                System.out.println("Press <Enter> to roll: ");
                in.nextLine();
                Die roll = new Die(); //creates two die
                int total = roll.roll(); // rolls the die
                int win = checkRoll(total); //checks first roll
                if (win == 0) // 7 or 11 returns 0
                    System.out.println("You win");
                else if (win == -1) //2 3 12 return -1
                    System.out.println("You lose");
                else
                {
                    boolean done = false; //establishes second phase of game
                    while (!done) //done = true = game over, option to play again
                    {
                        System.out.println("Press <Enter> to Roll Again");
                        in.nextLine();
                        int total2 = roll.roll(); //subsequent roll
                        if (total2 == total) // if rolled the same number
                        {
                            System.out.println("You Win!");
                            done = true; //ends current game
                        }
                        else if (total2 == 7)
                        {
                            System.out.println("You LOST!");
                            done = true; //ends current game
                        }
                        else
                            System.out.println("Roll again..."); //continues game
                    }
                }
            }
        }
        System.out.println("Thank you for playing!");
    }

    public static int checkRoll(int total)
    {    
        if (total == 7 || total == 11)
            return 0;
        else if(total == 2 || total == 3 || total == 12)
            return -1;
        else
            return total;
    }
}
