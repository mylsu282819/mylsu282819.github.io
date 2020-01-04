package temperatureconverter;

import java.util.Scanner;


/**
 * This is a text-based menu-driven application for the conversion of a 
 * temperature from one scale to another. The relevant conversion equations
 * are:
 * f = 9/5c+32        k = c + 273.15
 * C = 5/9(f-32)         K = 5/9(f-32) + 273.15
 * C = K - 273.15        F = 9/5(K - 273.15)+32
 * @author Duncan
 * @since 99-99-9999
 * course: csc 1350
 * Classroom Demo: using 'do...while' and 'switch' statements in 
 *                 implementing a menu-driven application
 */
public class TemperatureConverter 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        int option=0;
        double temp;
        do
        {
            System.out.println("TEMPERATURE CONVERSION APPLICATION");
            System.out.println("==================================");
            System.out.println("Celsius -> Fahrenheit..........[1]");
            System.out.println("Celsius -> Kelvin..............[2]");
            System.out.println("Fahrenheit -> Celsius..........[3]");
            System.out.println("Fahrenheit -> Kelvin...........[4]");
            System.out.println("Kelvin -> Celsius..............[5]");
            System.out.println("Kelvin -> Fahrenheit...........[6]");
            System.out.println("Exit...........................[0]");
            System.out.println("==================================");
            System.out.print("Select an option -> ");
            option  = cin.nextInt();
            switch(option)
            {
                case 1: System.out.print("Enter the temperature in deg C -> ");
                        temp = cin.nextDouble();
                        System.out.printf("%f deg C = %f deg F%n", temp,9.0/5*temp+32);
                        break;
                case 2:System.out.print("Enter the temperature in deg C -> ");
                       temp = cin.nextDouble();
                       System.out.printf("%f deg C = %f K%n", temp,temp+273.15);
                       break;
                case 3:System.out.print("Enter the temperature in deg F -> ");
                        temp = cin.nextDouble();
                        System.out.printf("%f deg F = %f deg C%n", temp,5.0/9*(temp-32));
                        break;
                case 4:System.out.print("Enter the temperature in deg F -> ");
                       temp = cin.nextDouble();
                       System.out.printf("%f deg F = %f K%n", temp,5.0/9*(temp-32)+273.15);
                       break;
                case 5:System.out.print("Enter the temperature in K -> ");
                        temp = cin.nextDouble();
                        System.out.printf("%f K = %f deg C%n", temp,temp-273.15);
                        break;
                case 6:System.out.print("Enter the temperature in K -> ");
                       temp = cin.nextDouble();
                       System.out.printf("%f K = %f deg F%n", temp,9.0/5*(temp-273.15)+32);
                       break;
                default: System.out.println("Invalid menu option");
                         break;
                case 0: System.out.println("Goodbye!!");                        
            }
         System.out.println();   
        }while (option != 0);    
    }    
}
