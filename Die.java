
/**
 * Rolls the Die
 *
 * @author Thomas McConnell
 * @version 2020
 */
public class Die
{
    private int Die1;
    private int Die2;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        Die1 = 0;
        Die2 = 0;
    }

    /**
     * Rolls the die
     * @ return the total of your roll
     */
    public int roll()
    {
        Die1 = (int) (Math.random() * 6 + 1);
        Die2 = (int) (Math.random() * 6 + 1);
        System.out.println("You rolled a "+ Die1 + " and a " + Die2 + " for a " + (Die1+Die2));
        return Die1+Die2; //returns total only, only number actually necessary, but DIE1 and DIE2 available for graphics later on
    }
    
}
