package complexnormalizer;

import java.util.Scanner;
/**
 * This program prompts the user for two integer
 * values representing the real and imaginary parts,
 * a and b, of a complex number and displays the
 * complex number in standard form: a +/- bi
 * @author Duncan
 * @since 99-99-9999
 * Course: csc 1350 section: 3/4
 * Classroom Demo
 */
public class ComplexNormalizer 
{
    public static void main(String[] args) 
            
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the real and imaginarhy parts of a complex number -> ");
        int real = cin.nextInt(), imag = cin.nextInt();
        if (real == 0)
        {
            if (imag == 0)
                System.out.printf("%d",0);
            else if (imag == -1)
                System.out.printf("-i");
            else if (imag == 1)
                System.out.printf("i");
            else
                System.out.printf("%di",imag);
        }
        else
        {
            System.out.printf("%d",real);
            if (imag != 0)
            {
                if (imag == -1)
                    System.out.printf(" - i");
                else if (imag == 1)
                    System.out.printf(" + i");
                else if (imag < 0)
                    System.out.printf(" - %di",Math.abs(imag));
                else
                    System.out.printf(" + %di",imag);
            }
        }
        System.out.println();
    }
}
