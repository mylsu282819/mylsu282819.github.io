package numberdemo;

import java.util.Scanner;

/**
 * A test bed for methods of the Number class
 * @author Duncan
 * @since 99-99-999
 * @version 2 uses two classes
 * @see Number
 */
public class NumberDemo 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter an integer-> ");
        int number = cin.nextInt();
        int ans = Number.factorial(number);
        if (ans == 0)
            System.out.printf("%d! = nan%n",number);
        else
            System.out.printf("%d! = %d%n",number,ans);
        
        System.out.printf("Is %d a prime number? %b%n",number,Number.isPrime(number));
        System.out.printf("Is %d a composite number? %b%n",number,Number.isComposite(number));
        System.out.printf("pi = %f%n",Number.PI);        
    }    
}
