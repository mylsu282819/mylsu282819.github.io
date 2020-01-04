package factorialcalculator;

import java.util.Scanner;
/**
 * The program computes the factorial of a number
 * using a 'while' loop. Its output is in the following
 * format:
 * 1. n < 0 ->  n! = nan
 * 2. n = 0 or 1 -> n! = 1
 * 3. otherwise -> n! = 1 x 2 x ... x n = ___
 * @author Duncan
 * @since 99-99-9999
 * course: csc 1350.03/1350.04
 * classroom demo: Using a 'while' loop
 */
public class FactorialCalculator 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enteraninteger -> ");
        int num = cin.nextInt();
        if (num < 0)
            System.out.printf("%d! = nan%n",num);
        else if (num == 0 || num == 1)
            System.out.printf("%d! = 1%n",num);
        else
        {
            int prod = 1, factor = 2;
            System.out.printf("%d! = 1",num);
            while(factor <= num)
            {
                System.out.printf(" x %d",factor);
                prod *= factor;
                factor++;
            }
            System.out.printf(" = %d%n",prod);
        }
    }  
}
