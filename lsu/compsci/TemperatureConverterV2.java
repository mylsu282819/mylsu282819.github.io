package temperatureconverterv2;

import java.util.Scanner;


/**
 * This is a text-based modular menu-driven application for the conversion of a 
 * temperature from one scale to another. The relevant conversion equations
 * are:
 * f = 9/5c+32        k = c + 273.15
 * C = 5/9(f-32)         K = 5/9(f-32) + 273.15
 * C = K - 273.15        F = 9/5(K - 273.15)+32
 * @author Duncan
 * @since 99-99-9999
 * @version 2: Uses void and value-returning static methods
 * course: csc 1350
 * Classroom Demo: using 'do...while' and 'switch' statements in 
 *                 implementing a menu-driven application
 */
public class TemperatureConverterV2
{
    /**
     * Displays the text-based menu interface for the program
     */
    public static void menu()
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
    }
    
    /**
     * Converts the specified temperature in  Celsius to Fahrenheit
     * @param c the temperature in Celsius
     * @return the equivalent temperature in Fahrenheit
     */
    public static double c2F(double c)
    {
       return 9.0/5*c + 32; 
    }
    
    /**
     * Converts the specified temperature in Celsius to Kelvin
     * @param c the temperature in Celsius
     * @return the equivalent temperature in Kelvin
     */
    public static double c2K(double c)
    {
       return c+273.15;
    }  
    
    /**
     * Converts the specified temperature in Fahrenheit to Celsius
     * @param f the temperature in Fahrenheit
     * @return the equivalent temperature in Celsius
     */
    public static double f2C(double f)
    {
       return 5/9.0*(f- 32); 
    }     
    
    /**
     * Converts the specified temperature in Kelvin to Celsius
     * @param k the temperature in Kelvin
     * @return the equivalent temperature in Celsius
     */
    public static double k2C(double k)
    {
       return k - 273.15; 
    }     
    
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        int option=0;
        double temp;
        do
        {
            menu();
            System.out.print("Select an option -> ");
            option  = cin.nextInt();
            switch(option)
            {
                case 1: System.out.print("Enter the temperature in deg C -> ");
                        temp = cin.nextDouble();
                        System.out.printf("%f deg C = %f deg F%n", temp,c2F(temp));
                        break;
                case 2:System.out.print("Enter the temperature in deg C -> ");
                       temp = cin.nextDouble();
                       System.out.printf("%f deg C = %f K%n", temp,c2K(temp));
                       break;
                case 3:System.out.print("Enter the temperature in deg F -> ");
                        temp = cin.nextDouble();
                        System.out.printf("%f deg F = %f deg C%n", temp,f2C(temp));
                        break;
                case 4:System.out.print("Enter the temperature in deg F -> ");
                       temp = cin.nextDouble();
                       System.out.printf("%f deg F = %f K%n", temp,c2K(f2C(temp)));
                       break;
                case 5:System.out.print("Enter the temperature in K -> ");
                        temp = cin.nextDouble();
                        System.out.printf("%f K = %f deg C%n", temp,k2C(temp));
                        break;
                case 6:System.out.print("Enter the temperature in K -> ");
                       temp = cin.nextDouble();
                       System.out.printf("%f K = %f deg F%n", temp,c2F(k2C(temp)));
                       break;
                default: System.out.println("Invalid menu option");
                         break;
                case 0: System.out.println("Goodbye!!");                        
            }
         System.out.println();   
        }while (option != 0);    
    }    
}