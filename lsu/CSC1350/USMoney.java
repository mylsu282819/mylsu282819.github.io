package usmoneydemo;

/**
 * Describe US currency
 * @author Duncan
 * @since 99-99-9999
 * @version 1
 */
public class USMoney 
{
    /**
     * the number of dollars
     */
    private int dollars;
    
    /**
     * the number of cents
     */
    private int cents;
    
    /**
     * Gives the number of dollars in this object
     * @return the number of dollars
     */
    public int getDollars()
    {
        return dollars;
    }
    
    /**
     * Gives the number of cents in this object
     * @return the number of cents
     */
    public int getCents()
    {
        return cents;
    }
    
    /**
     * Modifies this object using the specified parameters
     * @param d the new number of dollars
     * @param c the new number of cents
     */
    public void setUSMoney(int d, int c)
    {
        dollars = d;
        cents = c;
    }
    
    /**
     * Gives the string representation of this object in the format
     * $d.cc
     * @return the string representation of this object in the format $d.cc
     */
    public String toString()
    {
        return String.format("$%d.%02d",dollars,cents);
    }
    
    /**
     * Determines whether this object is equivalent to the specified object
     * @param m an object of this class
     * @return true when this object is equivalent to the specified object; otherwise,
     * false
     */
    public boolean equals(USMoney m)
    {
        return dollars == m.dollars && cents == m.cents;
    }
}
