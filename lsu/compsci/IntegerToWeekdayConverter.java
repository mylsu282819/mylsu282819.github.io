package integertoweekdayconverter;

import java.util.Scanner;

/**
 * This program prints the weekday equivalent to
 * an integer: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
 * or an error message indicating that the integer does
 * not represent a week day.<br>
 * This program illustrates the use of a switch statement
 * for multiway branching<br>
 * csc 1350
 * @author Duncan
 * @since 99-99-9999
 */
public class IntegerToWeekdayConverter 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter an integer for the day of the week -> ");
        int dayNumber = cin.nextInt();
        String dayName="";
        switch(dayNumber)
        {
            case 0: dayName = "Sunday";
            break;
            case 1: dayName = "Monday";
            break;
            case 2: dayName = "Tuesday";
            break;
            case 3: dayName = "Wednesday";
            break;
            case 4: dayName = "Thursday";
            break;
            case 5: dayName = "Friday";
            break;
            case 6: dayName = "Saturday";
            break;
            default: dayName = "ERROR: NO EQUIVALENT WEEKDAY";
        }
        System.out.printf("%d represents the weekday '%s'.%n",dayNumber,dayName);          
    }  
}
