/**
 * Computes the factorial of a number
 * @author Duncan
 * @since 99-99-9999
 * @version 2 Uses a static method to compute the factorial
 * of a number
 * Classroom Demo
 */
 
import java.util.Scanner;

public class Factorializer
{
    /**
     * Computes the factorial of a Number
     * @param n an integer whose factorial is to be found
     * @return 0 (undefined) when n < 0, 1 when n is 0 or 1 and
     * 1 x 2 x ... x n for all other values of n
     */
    public static int factorial(int n)
    {
        if (n < 0)
           return 0;
        if (n == 0 || n == 1)
           return 1;
        int prod = 1, i;
        for (i = 2; i <= n; i++)
           prod *= i;
        return prod;
    }
    
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter an integer to compute its factorial -> ");
        int num = cin.nextInt();
        System.out.printf("%d! = %d%n",num,factorial(num));
        System.out.print("Enter another integer to compute its factorial -> ");
        num = cin.nextInt();
        System.out.printf("%d! = %d%n",num,factorial(num));
    }    
}