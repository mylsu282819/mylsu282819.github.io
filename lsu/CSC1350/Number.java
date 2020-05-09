package numberdemo;

/**
 * Provides implementation for the factorial, primality testing and 
 * composite number test elementary algorithms
 * @author Duncan
 * @since 99-99-9999
 */
public class Number 
{
    public static final double PI = 3.14159;
    
    /**
     * Computes the factorial of the specified number
     * @param n an integer
     * @return the factorial of the specified number of
     * 0 if the factorial is undefined
     */    
    public static int factorial(int n)
    {
        if (n < 0)
            return 0;
        if (n == 0 || n == 1)
            return 1;
        int prod = 1, i;
        for (i = 2;  i <= n; i++)
            prod *= i;
        return prod;                            
    }
    
    /**
     * Determines whether the specified integer is prime
     * @param n an integer
     * @return true if n is prime; otherwise, false
     */
    public static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        int i;
        for (i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    /**
     * Determines whether the specified number is a composite number
     * @param n an integer
     * @return true when the specified number is composite; otherwise, false
     */
    public static boolean isComposite(int n)
    {
        return !isPrime(n);        
    }
    
}
