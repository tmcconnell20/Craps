
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
     *
     */
    public void roll()
    {
        Die1 = (int) Math.random() * 6 +1;
        Die1 = (int) Math.random() * 7 +1;
    }
}
