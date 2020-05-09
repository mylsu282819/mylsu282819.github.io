package helloprinter;

/**
 * This program illustrates the use of the print and println methods as well as
 * the use of the + operator to concatenate strings. Two versions of the output
 * is generated: one with two println statements and the other with one println
 * statement using concatenation.
 * @author duncanw
 * @since 08-28-2019
 * Course: csc 1350
 * Section: 3/4
 * Instructor: Dr. Duncan
 */
public class HelloPrinter 
{
    public static void main(String[] args) 
    {
        System.out.println("This is our first Java program.");
        System.out.println("Hello, World!");
        System.out.println();
        System.out.println("This is our first Java program.\n"+
                            "Hello, World!");
    }
}
