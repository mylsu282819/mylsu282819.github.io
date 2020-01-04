
package datevalidator;

import java.util.Scanner;
/**
 * This program determine whether three integers entered
 * by the user represents a valid date on the Gregorian
 * Calendar. If they do, it displays the date in mm/yy/yyyy
 * format with a message indicating that the triple does. 
 * If the triple does not represent a valid date, it displays
 * the triple in the format m/d/y with a message indicating
 * that it does not.
 * A Date is invalid if:
 * 1. year < 1583, month < 1, month > 12, day < 1 or day > 31
 * 2. day is 31 and month is April, June, September or November
 * 3. month is February, year is leap and day > 29
 * 4. month is February, year is non-leap and day > 28
 *
 * Note: A year is leap if
 * a. it is divisible by 400 or
 * b. it is divisible by 4 but not divisible by 100
 * @author Duncan
 * @since 99-99-9999
 * csc 1350: classroom demo on using compound boolean expressions
 *           in a program.
 */
public class DateValidator 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter numeric values of the month, day and year -> ");
        int month = cin.nextInt(), day = cin.nextInt(), year = cin.nextInt();
        boolean valid, leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        if (year < 1583 || month < 1 || month > 12 || day < 1 || day > 31)
            valid = false;
        else if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11))
            valid = false;
        else if (month == 2)
        {
            if (leap)
            {
                if (day > 29)
                    valid = false;
                else
                    valid = true;
            }
            else
            {
                if (day > 28)
                    valid = false;
                else
                    valid = true;
            }
        }
        else
            valid = true;        
        if (valid)
            System.out.printf("%02d/%02d/%d is a valid date.%n",month,day, year);
        else
            System.out.printf("%d/%d/%d is not a valid date.%n",month,day, year);

    }
}
