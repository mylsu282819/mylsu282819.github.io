/**
 * Generates and computes the first n terms of
 * the Fibonacci series. The user enters n and
 * the program computes the series and displays
 * the output as follows:
 * n < 0 -> Fib(n) = nan
 * n = 0 or 1 -> Fib(n) = n
 * otherwise -> Fib(n) = 1 + 1 + ..... = _
 * @author Duncan
 * @since 99-99-9999
 * course: csc 1350
 * classroom demo: Using a 'for' loop to do accumulation
 */

package fibseriesgenerator;

import java.util.Scanner;

public class FibSeriesGenerator 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the number of terms of the Fibonacci series -> ");
        int nTerms = cin.nextInt();
        if (nTerms <  0)
            System.out.printf("Fib(%d) = nan%n",nTerms);
        else if (nTerms ==  0 || nTerms == 1)
            System.out.printf("Fib(%d) = %d%n",nTerms,nTerms);
        else
        {
            int series = 1, cur = 1, next = 1,i;
            System.out.printf("Fib(%d) = 1",nTerms);
            for (i = 2; i <= nTerms; i++)
            {
                next = cur + next;
                cur = next - cur;
                System.out.printf(" + %d",cur);
                series += cur;
            }
            System.out.printf(" = %d%n",series);
        }        
    }    
}
